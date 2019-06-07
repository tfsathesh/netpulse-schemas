package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaCalls2g3g_users_stats_v2 {

  val dFSchemaCalls2g3g_users_stats_v2 = StructType(
    List(
      StructField("key", StringType, nullable = true),
      StructField("calls_all", LongType, nullable = true),
      StructField("calls_suc_all", LongType, nullable = true),
      StructField("calls_fail_all", LongType, nullable = true),
      StructField("calls_mo_all", LongType, nullable = true),
      StructField("calls_mt_all", LongType, nullable = true),
      StructField("calls_suc_2g", LongType, nullable = true),
      StructField("calls_fail_2g", LongType, nullable = true),
      StructField("calls_suc_3g", LongType, nullable = true),
      StructField("calls_fail_3g", LongType, nullable = true),
      StructField("calls_suc_mo_2g", LongType, nullable = true),
      StructField("calls_fail_mo_2g", LongType, nullable = true),
      StructField("calls_suc_mt_2g", LongType, nullable = true),
      StructField("calls_fail_mt_2g", LongType, nullable = true),
      StructField("calls_suc_mo_3g", LongType, nullable = true),
      StructField("calls_fail_mo_3g", LongType, nullable = true),
      StructField("calls_suc_mt_3g", LongType, nullable = true),
      StructField("calls_fail_mt_3g", LongType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
