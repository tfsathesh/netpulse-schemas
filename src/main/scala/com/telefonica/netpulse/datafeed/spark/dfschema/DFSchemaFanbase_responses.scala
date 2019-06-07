package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaFanbase_responses {

  val dFSchemaFanbase_responses = StructType(
    List(
      StructField("msisdn", StringType, nullable = true),
      StructField("subscr_id", LongType, nullable = true),
      StructField("survey_id", LongType, nullable = true),
      StructField("script_id", IntegerType, nullable = true),
      StructField("script_question_id", IntegerType, nullable = true),
      StructField("script_question_cd", StringType, nullable = true),
      StructField("script_question_name", StringType, nullable = true),
      StructField("script_question_desc", StringType, nullable = true),
      StructField("survey_response_dt", DateType, nullable = true),
      StructField("survey_response_val", StringType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
