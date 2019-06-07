package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaMobility_topk_v1 {

  val dFSchemaMobility_topk_v1 = StructType(
    List(
      StructField("userid", StringType, nullable = true),
      StructField("gyration", DoubleType, nullable = true),
      StructField("bbdiagonal", DoubleType, nullable = true),
      StructField("topduration", DoubleType, nullable = true),
      StructField("topkduration", DoubleType, nullable = true),
      StructField("sectorid1", StringType, nullable = true),
      StructField("timesector1", DoubleType, nullable = true),
      StructField("sectorid2", StringType, nullable = true),
      StructField("timesector2", DoubleType, nullable = true),
      StructField("sectorid3", StringType, nullable = true),
      StructField("timesector3", DoubleType, nullable = true),
      StructField("sectorid4", StringType, nullable = true),
      StructField("timesector4", DoubleType, nullable = true),
      StructField("sectorid5", StringType, nullable = true),
      StructField("timesector5", DoubleType, nullable = true),
      StructField("sectorid6", StringType, nullable = true),
      StructField("timesector6", DoubleType, nullable = true),
      StructField("sectorid7", StringType, nullable = true),
      StructField("timesector7", DoubleType, nullable = true),
      StructField("sectorid8", StringType, nullable = true),
      StructField("timesector8", DoubleType, nullable = true),
      StructField("sectorid9", StringType, nullable = true),
      StructField("timesector9", DoubleType, nullable = true),
      StructField("sectorid10", StringType, nullable = true),
      StructField("timesector10", DoubleType, nullable = true),
      StructField("sectorid11", StringType, nullable = true),
      StructField("timesector11", DoubleType, nullable = true),
      StructField("sectorid12", StringType, nullable = true),
      StructField("timesector12", DoubleType, nullable = true),
      StructField("sectorid13", StringType, nullable = true),
      StructField("timesector13", DoubleType, nullable = true),
      StructField("sectorid14", StringType, nullable = true),
      StructField("timesector14", DoubleType, nullable = true),
      StructField("sectorid15", StringType, nullable = true),
      StructField("timesector15", DoubleType, nullable = true),
      StructField("sectorid16", StringType, nullable = true),
      StructField("timesector16", DoubleType, nullable = true),
      StructField("sectorid17", StringType, nullable = true),
      StructField("timesector17", DoubleType, nullable = true),
      StructField("sectorid18", StringType, nullable = true),
      StructField("timesector18", DoubleType, nullable = true),
      StructField("sectorid19", StringType, nullable = true),
      StructField("timesector19", DoubleType, nullable = true),
      StructField("sectorid20", StringType, nullable = true),
      StructField("timesector20", DoubleType, nullable = true),
      StructField("dt", StringType, nullable = true),
      StructField("hour", StringType, nullable = true)
    ))
}
