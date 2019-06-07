package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaFanbase_survey {

  val dFSchemaFanbase_survey = StructType(
    List(
      StructField("emsisdn", StringType, nullable = true),
      StructField("subscr_id", LongType, nullable = true),
      StructField("survey_id", LongType, nullable = true),
      StructField("script_id", IntegerType, nullable = true),
      StructField("survey_dt", DateType, nullable = true),
      StructField("survey_tm", LongType, nullable = true),
      StructField("survey_cd", StringType, nullable = true),
      StructField("script_name", StringType, nullable = true),
      StructField("script_desc", StringType, nullable = true),
      StructField("survey_meth_name", StringType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
