package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaFtaggregated_scored_v2_retrain {

  val dFSchemaFtaggregated_scored_v2_retrain = StructType(
    List(
      StructField("userid", StringType, nullable = true),
      StructField("predclass", IntegerType, nullable = true),
      StructField("probclass0", DoubleType, nullable = true),
      StructField("probclass1", DoubleType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
