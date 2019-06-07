package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaCalls4g_stats_v0 {

  val dFSchemaCalls4g_stats_v0 = StructType(
    List(
      StructField("userid", StringType, nullable = true),
      StructField("cntactivate", IntegerType, nullable = true),
      StructField("cntdeactivate", IntegerType, nullable = true),
      StructField("cntrejectactivate", IntegerType, nullable = true),
      StructField("cntrejectdeactivate", IntegerType, nullable = true),
      StructField("percrejectactivate", DoubleType, nullable = true),
      StructField("percrejectdeactivate", DoubleType, nullable = true),
      StructField("cntcalls", IntegerType, nullable = true),
      StructField("cntcallsdowngrade", IntegerType, nullable = true),
      StructField("perccallsdowngrade", DoubleType, nullable = true),
      StructField("cntincomplete", IntegerType, nullable = true),
      StructField("percincompleteratio", DoubleType, nullable = true),
      StructField("totduration", IntegerType, nullable = true),
      StructField("totdurationdowngrade", IntegerType, nullable = true),
      StructField("percdurationdowngrade", DoubleType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
