package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaMobility_stats_v1 {

  val dFSchemaMobility_stats_v1 = StructType(
    List(
      StructField("userid", StringType, nullable = true),
      StructField("numevents", IntegerType, nullable = true),
      StructField("numeventsnolocation", IntegerType, nullable = true),
      StructField("numsectors", IntegerType, nullable = true),
      StructField("numsectorsnolocation", IntegerType, nullable = true),
      StructField("numhandovers", IntegerType, nullable = true),
      StructField("totduration", DoubleType, nullable = true),
      StructField("avgduration", DoubleType, nullable = true),
      StructField("gyration", DoubleType, nullable = true),
      StructField("entropy", DoubleType, nullable = true),
      StructField("entropynorm", DoubleType, nullable = true),
      StructField("bbdiagonal", DoubleType, nullable = true),
      StructField("xcentroid", DoubleType, nullable = true),
      StructField("ycentroid", DoubleType, nullable = true),
      StructField("dt", StringType, nullable = true),
      StructField("hour", StringType, nullable = true)
    ))
}
