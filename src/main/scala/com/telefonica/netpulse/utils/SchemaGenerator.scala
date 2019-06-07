package com.telefonica.netpulse.utils.SchemaGenerator


import java.io.{File, PrintWriter}

import com.telefonica.netpulse.common.SparkContextFactory
import org.apache.spark.sql.types._

import scala.collection.immutable.ListMap
import util.control.Breaks._
import scala.io.Source
object SchemaGenerator {

  def writeDFSchemaFile(hiveFilePath: String, dfFilePath: String): Unit = {
    val fieldsAndTypesMap = getFieldsMapFromHiveFile(hiveFilePath)
    val dfOjbectName: String = getObjectName(hiveFilePath)
    val dfSchemaName = "DFSchema" + dfOjbectName
    val dfSchemaFileName = dfSchemaName + ".scala"
    val dfWriter = new PrintWriter(new File(dfFilePath + dfSchemaFileName))

    dfWriter.println("package com.telefonica.incas.experimental.datafeed")
    dfWriter.println()
    dfWriter.println()
    dfWriter.println("import org.apache.spark.sql.types._")
    dfWriter.println()
    dfWriter.println("object " + dfSchemaName + " {")
    dfWriter.println()
    dfWriter.println("  val " + "dFSchema" + dfOjbectName.capitalize + " = StructType(")
    dfWriter.println("    List(")
    for (i <- 1 to fieldsAndTypesMap.size) {
      dfWriter.println("      StructField(\"" + fieldsAndTypesMap.get(i).get._1 + "\", " + convertToDFDataTypeString(fieldsAndTypesMap.get(i).get._2) + ", nullable = true)" + returnSchemaComma(fieldsAndTypesMap.size, i))
    }
    dfWriter.println("    ))")
    dfWriter.println("}")
    dfWriter.close()
  }

  def returnSchemaComma(size: Int, pos: Int): String = {
    if (size != pos) ","
    else ""
  }

  def getDFSchema(inputSchemaPath: String): StructType =
  {
    //val fileFullPath = this.getClass.getClassLoader.getResource(fieldNamesFile).getPath
    val fieldsAndTypesMap: Map[Int, (String, String)] = getFieldsMapFromPropFile(inputSchemaPath)
    val structTypeSchema = getStructType(fieldsAndTypesMap)
    structTypeSchema
  }

  def getStructType(fieldsAndTypesMap : Map[Int, (String, String)]):StructType  = {
    var arrayOfFields : Array[StructField] = new Array[StructField](5000)
    var structType: StructType =  new StructType()
    for (elem <- fieldsAndTypesMap.keys) {
      val name = fieldsAndTypesMap.get(elem).get._1
      val datatype = fieldsAndTypesMap.get(elem).get._2
      structType = structType.add(StructField(name,convertToDFDataType(datatype),false))
    }
    structType
  }

  def getDFSchema(hiveDBName: String, hiveTableName: String): StructType = {
    val (spark, scSql) = SparkContextFactory.getSparkSession(appname = "SchemaGenCall", consoleEcho = true, coresBoost = true, logLevel = "INFO", speculation = true)
    val tableDFSchema = spark.sql("select * from " + hiveDBName + "." + hiveTableName).schema
    tableDFSchema
  }

  def getObjectName(hiveFilePath: String): String = {
    hiveFilePath.split("/").last.split("\\.").head.capitalize
  }

  def writeEnumFile(hiveFilePath: String, enumFilePath: String, packagePath: String = "com.telefonica.incas.experimental.datafeed"): Unit = {
    val fieldsAndTypesMap = getFieldsMapFromHiveFile(hiveFilePath)
    val enumObjectName = getObjectName(hiveFilePath)
    val enumFileName = "EnumSchema" + enumObjectName + ".scala"
    val enumWriter = new PrintWriter(new File(enumFilePath + enumFileName))
    val fieldNamesMap: Map[Int, String] = fieldsAndTypesMap.map(a => (a._1 -> enrichField(a._2._1)))
    enumWriter.println("package " + packagePath)
    enumWriter.println()
    enumWriter.println("//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type")
    enumWriter.println("object " + "enumSchema" + enumObjectName + " extends Enumeration {")
    enumWriter.println("type " + "enumSchema" + enumObjectName + " = Value")
    enumWriter.println()
    for (fieldSeq <- 1 to fieldNamesMap.size) {
      val fieldLine = ("    val " + fieldNamesMap.get(fieldSeq).get).padTo(50, ' ') + " = " + "Value(" + fieldSeq + "-1)"
      enumWriter.println(fieldLine)
    }
    enumWriter.println("}")
    enumWriter.close()
  }

  def enrichField(fieldName: String): String = {
    val intRegex = """(\d+)""".r
    val enrichedField = fieldName.substring(0, 1) match {
      case intRegex(str) => "c" + fieldName
      case _ => fieldName // or some other value, or an exception
    }
    if (enrichedField == "type")
      "c" + enrichedField
    else enrichedField
  }

  def convertToDFDataTypeString(inputType: String): String = {
    val outputType: String = inputType.toUpperCase match {
      case "TINYINT" => "IntegerType"
      case "SMALLINT" => "IntegerType"
      case "INT" => "IntegerType"
      case "BIGINT" => "LongType"
      case "FLOAT" => "DoubleType"
      case "DOUBLE" => "DoubleType"
      case "DECIMAL" => "DoubleType"
      case "STRING" => "StringType"
      case "VARCHAR" => "StringType"
      case "CHAR" => "StringType"
      case "BOOLEAN" => "BooleanType"
      case "TIMESTAMP" => "TimestampType"
      case "DATE" => "DateType"
      case _ => "StringType"
    }
    outputType
  }

  def convertToDFDataType(inputType: String): DataType = {
    val outputType: DataType = inputType.toUpperCase match {
      case "TINYINT" => IntegerType
      case "SMALLINT" => IntegerType
      case "INT" => IntegerType
      case "BIGINT" => LongType
      case "FLOAT" => DoubleType
      case "DOUBLE" => DoubleType
      case "DECIMAL" => DoubleType
      case "STRING" => StringType
      case "VARCHAR" => StringType
      case "CHAR" => StringType
      case "BOOLEAN" => BooleanType
      case "TIMESTAMP" => TimestampType
      case "DATE" => DateType
      case _ => StringType
    }
    outputType
  }
  def rtrimParanthesis(s: String) = s.replaceAll("\\)+$", "")

  def rtrimComma(s: String) = s.replaceAll("\\,+$", "")

  def trimQuotes(s: String) = s.replaceAll("\\`", "").replaceAll("\\,+$", "")

  def getFieldsMapFromPropFile(fieldsFilePath: String ): ListMap[Int,(String,String)] ={

    var fieldNameAndType = Map[Int, (String, String)]()
    var sequenceNum: Int = 1
    for(lines <- Source.fromFile(fieldsFilePath
    ).getLines )
    {
      val seqNameType: Array[String] = lines.split(",")
      fieldNameAndType += (sequenceNum -> (seqNameType(0),seqNameType(1)))
      sequenceNum = sequenceNum + 1
    }
    ListMap(fieldNameAndType.toSeq.sortBy(_._1): _*)
  }

  def getFieldsMapFromHiveFile(hiveFilePath: String): Map[Int, (String, String)] = {
    var intSeq = 0
    var skipCount = 0
    var skipCountMax = 1
    val pattern = "([0-9A-Za-z_`]+) ([0-9A-Za-z,)]+)".r
    var fieldNameAndType = Map[Int, (String, String)]()

    for (lines <- Source.fromFile(hiveFilePath).getLines) {
      if (lines.contains("PARTITIONED BY"))
        skipCountMax = 2
    }
    breakable {
      for (lines <- Source.fromFile(hiveFilePath).getLines) {
        if (lines.contains(",") || lines.contains(")")) {
          val pattern(name, datatype) = rtrimComma(rtrimParanthesis(lines.trim)).split(" ").take(2).mkString(" ")
          intSeq = intSeq + 1
          fieldNameAndType += (intSeq -> (trimQuotes(name), datatype))
          if (lines.takeRight(1) == ")") {
            skipCount = skipCount + 1
          }
          if (skipCount == skipCountMax)
            break
        }
      }
    }
    ListMap(fieldNameAndType.toSeq.sortBy(_._1): _*)
  }
}