package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaAscom1 {

  val dFSchemaAscom1 = StructType(
    List(
      StructField("time", StringType, nullable = true),
      StructField("latitude", StringType, nullable = true),
      StructField("longitude", StringType, nullable = true),
      StructField("dat", StringType, nullable = true),
      StructField("equipment", StringType, nullable = true),
      StructField("logfile", StringType, nullable = true),
      StructField("operator", StringType, nullable = true),
      StructField("region", StringType, nullable = true),
      StructField("udr", StringType, nullable = true),
      StructField("url", StringType, nullable = true),
      StructField("technology", StringType, nullable = true),
      StructField("status", StringType, nullable = true),
      StructField("type", StringType, nullable = true),
      StructField("technology_detail", StringType, nullable = true),
      StructField("duration_method_a", StringType, nullable = true),
      StructField("throughput_method_a", StringType, nullable = true),
      StructField("page_size", StringType, nullable = true),
      StructField("sample_initiated_on_4g", StringType, nullable = true),
      StructField("city", StringType, nullable = true),
      StructField("http_session_time", StringType, nullable = true),
      StructField("sample_initiated_on_3g", StringType, nullable = true),
      StructField("sample_initiated_on_2g", StringType, nullable = true),
      StructField("start_time", StringType, nullable = true),
      StructField("reportstatus", StringType, nullable = true),
      StructField("route_type", StringType, nullable = true),
      StructField("startlatitude", StringType, nullable = true),
      StructField("startlongitude", StringType, nullable = true),
      StructField("imei", StringType, nullable = true),
      StructField("imsi", StringType, nullable = true),
      StructField("channel", StringType, nullable = true),
      StructField("technologylist", StringType, nullable = true),
      StructField("errorcause", StringType, nullable = true),
      StructField("firstsignalstrength", StringType, nullable = true),
      StructField("lastsignalstrength", StringType, nullable = true),
      StructField("arithavgsignalstrength", StringType, nullable = true),
      StructField("logavgsignalstrength", StringType, nullable = true),
      StructField("route_part", StringType, nullable = true),
      StructField("beacon_area", StringType, nullable = true),
      StructField("original_udr", StringType, nullable = true),
      StructField("callid", StringType, nullable = true),
      StructField("trueregion", StringType, nullable = true),
      StructField("notes", StringType, nullable = true),
      StructField("reportperiod", StringType, nullable = true),
      StructField("currentset", StringType, nullable = true),
      StructField("msisdn", StringType, nullable = true),
      StructField("dt", IntegerType, nullable = true)
    ))
}
