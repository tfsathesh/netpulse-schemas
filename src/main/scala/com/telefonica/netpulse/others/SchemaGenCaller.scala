package com.telefonica.netpulse.others


import java.io.File

import org.rogach.scallop.ScallopConf
import com.telefonica.netpulse.common.Constants._
import com.telefonica.netpulse.utils.SchemaGenerator._

object SchemaGenCaller {

  class CLOptions(arguments: Seq[String]) extends ScallopConf(arguments) {
    val runType = opt[String](name = "run-type", required = false, default = Some("DFSCHEMAFILE"))
    val hiveDDLInputPath = opt[String](name = "hive-ddl-input-path", required = false, default = Some(CONST_EMPTY_STRING))
    val outputPath = opt[String](name = "output-path", required = false, default = Some(CONST_EMPTY_STRING))
    val packagePath = opt[String](name = "package-path", required = false, default = Some("com.telefonica.incas.experimental.datafeed"))
    val others = trailArg[List[String]](required = false, default = Some(List[String]()))
    verify()
  }

  def getListOfFiles(dir: String): List[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      d.listFiles.filter(_.isFile).toList
    } else if (d.isFile) {
      List(d)
    }
    else
      List[File]()
  }

  def main(args: Array[String]): Unit = {
    val clopts = new CLOptions(args)
    val runType = clopts.runType()
    val hiveDDLInputPath = clopts.hiveDDLInputPath()
    val outputPath = clopts.outputPath()
    val packagePath = clopts.packagePath()


    if (runType.toUpperCase() == "ENUMERATION") {
      if (!hiveDDLInputPath.isEmpty && !outputPath.isEmpty) {
        val hiveFiles = getListOfFiles(hiveDDLInputPath)
        printRunInfo(hiveDDLInputPath, outputPath, runType, packagePath)
        hiveFiles.foreach(a => {
          SchemaGenerator.writeEnumFile(a.toString, outputPath, packagePath)
          println(a)
        }
        )
      } else printHelp
    }
    else if (runType.toUpperCase() == "DFSCHEMAFILE") {
      if (!hiveDDLInputPath.isEmpty && !outputPath.isEmpty) {
        val hiveFiles = getListOfFiles(hiveDDLInputPath)
        printRunInfo(hiveDDLInputPath, outputPath, runType, packagePath)
        hiveFiles.foreach(a => {
          SchemaGenerator.writeDFSchemaFile(a.toString, outputPath)
          println(a)
        }
        )
      } else printHelp
    }
    else {
      printHelp
    }
  }

  def printHelp(): Unit = {
    println("************Job could not be run, it accepts following parameters ****************")
    println("run-type: Values Allowed-> 1. Enumertion 2.DFSchemaFile")
    println("hive-ddl-input-path: Values Allowed -> .hql file path or folder with .hql files")
    println("output-path: Values Allowed -> output folder path")
    println("package-path: Values Allowed -> scala project package path you prefer to have as first line of .scala files, ex: com.telefonica.incas.experimental.datafeed")
    println("**********************************************************************************")

  }


  def printRunInfo(hiveDDLInputPath: String, outputPath: String, runType: String, packagePath: String): Unit = {
    println("************* Job Running with below parameters:  **********************************")
    println("hiveDDLInputPath: "+ hiveDDLInputPath)
    println("outputPath: "+ outputPath)
    println("runType: "+ runType)
    println("packagePath: "+ packagePath)
    println("**********************************************************************************")

  }

}