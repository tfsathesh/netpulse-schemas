package com.telefonica.netpulse.common

// spark dependencies
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql._

object SparkContextFactory {

  def getNew(
              appname:String,
              compressionCodec:String = "lz4",
              consoleEcho:Boolean = false,
              coresBoost:Boolean = false,
              logLevel:String = "INFO",
              speculation:Boolean = true):(SparkContext, SQLContext) = {

    val scConf = new SparkConf()
    scConf.setAppName("%s.%s".format(Constants.CONST_PACKAGE_NAME, appname))
    scConf.set("spark.io.compression.codec", compressionCodec)
    scConf.set("spark.speculation", speculation.toString)
    scConf.set("spark.hadoop.validateOutputSpecs", "false")
    //scConf.set("spark.scheduler.listenerbus.eventqueue.size", "1000000000")
    //scConf.set("spark.dynamicAllocation.enabled", "false")
    //scConf.set("spark.dynamicAllocation.enabled", "true")
    if (coresBoost)
      scConf.set("spark.executor.cores", "3")

    val sc = new SparkContext(scConf)
    sc.setLogLevel(logLevel)

    // print on the console the full SparkConf key=value pairs
    if (consoleEcho)
      sc.getConf.getAll.foreach{ case (key, value) => println(s"\t$key : $value") }

    val scSql = new org.apache.spark.sql.SQLContext(sc)

    (sc, scSql)
  }


  def getSparkSession(appname:String,
                      compressionCodec:String = "lz4",
                      consoleEcho:Boolean = false,
                      coresBoost:Boolean = false,
                      logLevel:String = "INFO",
                      speculation:Boolean = true): (SparkSession, SQLContext) ={

    val spark = SparkSession
      .builder()
      .appName(appname)
      .config("spark.io.compression.codec", compressionCodec)
      .config("spark.executor.cores", "3")
      .config("spark.hadoop.validateOutputSpecs","false")
      .config("spark.speculation", speculation.toString)
      .enableHiveSupport()
      .getOrCreate()

    spark.sparkContext.setLogLevel(logLevel)

    if (consoleEcho)
      spark.conf.getAll.foreach { case (key, value) => println(s"\t$key : $value") }

    (spark, spark.sqlContext)

  }
}
