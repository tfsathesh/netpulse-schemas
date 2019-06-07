package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaAscom_web {

  val dFSchemaAscom_web = StructType(
    List(
      StructField("ascom_imsi", LongType, nullable = true),
      StructField("ascom_url", StringType, nullable = true),
      StructField("web_domain", StringType, nullable = true),
      StructField("web_url", StringType, nullable = true),
      StructField("ascom_endtime_with_http", TimestampType, nullable = true),
      StructField("ascom_endtime_with_duration_method_a", TimestampType, nullable = true),
      StructField("diff_ascom_endtime_httpweb_timestamp_time", LongType, nullable = true),
      StructField("diff_ascom_endtime_duration_method_a_web_timestamp_time", LongType, nullable = true),
      StructField("web_timestamp", TimestampType, nullable = true)
    ))
}
