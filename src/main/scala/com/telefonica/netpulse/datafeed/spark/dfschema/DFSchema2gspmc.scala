package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchema2gspmc {

  val dFSchema2gspmc = StructType(
    List(
      StructField("datetimetimezone", StringType, nullable = true),
      StructField("ci", StringType, nullable = true),
      StructField("jvco_id", StringType, nullable = true),
      StructField("bdwnacc", LongType, nullable = true),
      StructField("tdwnscan", LongType, nullable = true),
      StructField("bcch_uptime", LongType, nullable = true),
      StructField("ave_avail_tch_sum", LongType, nullable = true),
      StructField("bcch_downtime", LongType, nullable = true),
      StructField("csr", StringType, nullable = true),
      StructField("mycom_id", StringType, nullable = true),
      StructField("bsc", StringType, nullable = true),
      StructField("magnet_cell_type", StringType, nullable = true),
      StructField("degrees_latitude", StringType, nullable = true),
      StructField("degrees_longitude", StringType, nullable = true),
      StructField("magnetipd_3g_4g_vendor", StringType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
