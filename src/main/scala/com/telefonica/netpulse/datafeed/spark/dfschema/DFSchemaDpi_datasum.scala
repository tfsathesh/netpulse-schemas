package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaDpi_datasum {

  val dFSchemaDpi_datasum = StructType(
    List(
      StructField("event_id", StringType, nullable = true),
      StructField("event_result", StringType, nullable = true),
      StructField("date", IntegerType, nullable = true),
      StructField("time_hour", IntegerType, nullable = true),
      StructField("time_minute", IntegerType, nullable = true),
      StructField("time_second", IntegerType, nullable = true),
      StructField("time_millisecond", IntegerType, nullable = true),
      StructField("duration", IntegerType, nullable = true),
      StructField("default_bearer_id", IntegerType, nullable = true),
      StructField("pdn_id", LongType, nullable = true),
      StructField("rule_space", IntegerType, nullable = true),
      StructField("imsi", LongType, nullable = true),
      StructField("imeisv", LongType, nullable = true),
      StructField("msisdn", IntegerType, nullable = true),
      StructField("mcc", IntegerType, nullable = true),
      StructField("mnc", IntegerType, nullable = true),
      StructField("rating_group", IntegerType, nullable = true),
      StructField("service_ul_bytes", IntegerType, nullable = true),
      StructField("service_dl_bytes", IntegerType, nullable = true),
      StructField("service_time_seconds", IntegerType, nullable = true),
      StructField("dt", StringType, nullable = true),
      StructField("hour", StringType, nullable = true),
      StructField("loc", StringType, nullable = true),
      StructField("csp", StringType, nullable = true)
    ))
}
