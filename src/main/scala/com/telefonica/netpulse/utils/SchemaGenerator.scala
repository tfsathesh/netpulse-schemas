package com.telefonica.netpulse.utils


import com.telefonica.netpulse.common.SparkContextFactory
import org.apache.spark.sql.types._

import scala.collection.immutable.ListMap
import scala.io.Source
object SchemaGenerator {

  def getDFSchema(inputSchemaPath: String): StructType =
  {
    val fieldsAndTypesMap: Map[Int, (String, String)] = getFieldsMapFromPropFile(inputSchemaPath)
    val structTypeSchema = getStructType(fieldsAndTypesMap)
    structTypeSchema
  }

  def getEnumeration(inputSchemaPath: String): DynamicEnum = {
    val fieldsAndTypesMap: Map[Int, (String, String)] = getFieldsMapFromPropFile(inputSchemaPath)
    new DynamicEnum(fieldsAndTypesMap)
  }

  def getStructType(fieldsAndTypesMap : Map[Int, (String, String)]):StructType  = {
    var arrayOfFields : Array[StructField] = new Array[StructField](5000)
    var structType: StructType =  new StructType()
    for (elem <- fieldsAndTypesMap.keys) {
      val name = fieldsAndTypesMap.get(elem).get._1
      val datatype = fieldsAndTypesMap.get(elem).get._2
      structType = structType.add(StructField(name,convertToDFDataType(datatype),true))
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
      if(seqNameType.length >1)
      fieldNameAndType += (sequenceNum -> (seqNameType(0),seqNameType(1)))
      else
        fieldNameAndType += (sequenceNum -> (seqNameType(0),null))
      sequenceNum = sequenceNum + 1
    }
    ListMap(fieldNameAndType.toSeq.sortBy(_._1): _*)
  }
}