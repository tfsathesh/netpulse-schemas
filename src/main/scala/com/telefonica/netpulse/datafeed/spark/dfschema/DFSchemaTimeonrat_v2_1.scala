package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaTimeonrat_v2_1 {

  val dFSchemaTimeonrat_v2_1 = StructType(
    List(
      StructField("key", StringType, nullable = true),
      StructField("totevents", IntegerType, nullable = true),
      StructField("filtered", IntegerType, nullable = true),
      StructField("in2g", DoubleType, nullable = true),
      StructField("in3g", DoubleType, nullable = true),
      StructField("in4g", DoubleType, nullable = true),
      StructField("avg2gup", DoubleType, nullable = true),
      StructField("avg3gdown", DoubleType, nullable = true),
      StructField("avg3gup", DoubleType, nullable = true),
      StructField("avg4gdown", DoubleType, nullable = true),
      StructField("tottrans", IntegerType, nullable = true),
      StructField("trans2g3g", IntegerType, nullable = true),
      StructField("trans2g4g", IntegerType, nullable = true),
      StructField("trans3g2g", IntegerType, nullable = true),
      StructField("trans3g4g", IntegerType, nullable = true),
      StructField("trans4g2g", IntegerType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
