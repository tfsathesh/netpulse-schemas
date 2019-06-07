package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchema4gspmc {

  val dFSchema4gspmc = StructType(
    List(
      StructField("datetimetimezone", StringType, nullable = true),
      StructField("ci", StringType, nullable = true),
      StructField("jvco_id", StringType, nullable = true),
      StructField("pmcelldowntimeman", LongType, nullable = true),
      StructField("pmcelldowntimeauto", LongType, nullable = true),
      StructField("lcelav_samples_cell_avail", LongType, nullable = true),
      StructField("lcelav_samples_cell_plan_unavail", LongType, nullable = true),
      StructField("lcelav_denom_cell_avail", LongType, nullable = true),
      StructField("csr", StringType, nullable = true),
      StructField("mycom_id", StringType, nullable = true),
      StructField("magnet_cell_type", StringType, nullable = true),
      StructField("degrees_latitude", StringType, nullable = true),
      StructField("degrees_longitude", StringType, nullable = true),
      StructField("magnetipd_3g_4g_vendor", StringType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
