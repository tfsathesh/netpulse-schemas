package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaUserscatalog_v0 {

  val dFSchemaUserscatalog_v0 = StructType(
    List(
      StructField("userid", StringType, nullable = true),
      StructField("imsi", StringType, nullable = true),
      StructField("imei", StringType, nullable = true),
      StructField("svset", StringType, nullable = true),
      StructField("date", StringType, nullable = true),
      StructField("csp", StringType, nullable = true),
      StructField("collisions", StringType, nullable = true),
      StructField("useridpairingtimecnt", IntegerType, nullable = true),
      StructField("datafeedmask", IntegerType, nullable = true),
      StructField("is2g", IntegerType, nullable = true),
      StructField("is3g", IntegerType, nullable = true),
      StructField("is4g", IntegerType, nullable = true),
      StructField("isdata2g", IntegerType, nullable = true),
      StructField("isdata3g", IntegerType, nullable = true),
      StructField("isdata4g", IntegerType, nullable = true),
      StructField("isvoice2g", IntegerType, nullable = true),
      StructField("isvoice3g", IntegerType, nullable = true),
      StructField("isvoice4g", IntegerType, nullable = true),
      StructField("tac2g", IntegerType, nullable = true),
      StructField("tac3g", IntegerType, nullable = true),
      StructField("tac4g", IntegerType, nullable = true),
      StructField("tac4gtdd", IntegerType, nullable = true),
      StructField("tacmanufacturer", StringType, nullable = true),
      StructField("tacmodelname", StringType, nullable = true),
      StructField("tacos", StringType, nullable = true),
      StructField("countryiso", StringType, nullable = true),
      StructField("operator", StringType, nullable = true),
      StructField("apnstrcnt", IntegerType, nullable = true),
      StructField("apnstr", StringType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
