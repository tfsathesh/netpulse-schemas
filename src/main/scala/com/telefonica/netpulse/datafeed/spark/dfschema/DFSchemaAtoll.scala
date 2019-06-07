package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaAtoll {

  val dFSchemaAtoll = StructType(
    List(
      StructField("csr", StringType, nullable = true),
      StructField("db_record_id", StringType, nullable = true),
      StructField("cell_identity", StringType, nullable = true),
      StructField("transmitter_id", StringType, nullable = true),
      StructField("latitude", LongType, nullable = true),
      StructField("longitude", LongType, nullable = true),
      StructField("altitude", LongType, nullable = true),
      StructField("region", StringType, nullable = true),
      StructField("bts_name", StringType, nullable = true),
      StructField("site_type", StringType, nullable = true),
      StructField("prediction_radius", LongType, nullable = true),
      StructField("prediction_resolution", LongType, nullable = true),
      StructField("number_of_antenna", LongType, nullable = true),
      StructField("cell_type", StringType, nullable = true),
      StructField("antenna_name", StringType, nullable = true),
      StructField("height", DoubleType, nullable = true),
      StructField("tilt", DoubleType, nullable = true),
      StructField("azimuth", DoubleType, nullable = true),
      StructField("electrical_tilt", DoubleType, nullable = true),
      StructField("antenna_dx", StringType, nullable = true),
      StructField("antenna_dy", StringType, nullable = true),
      StructField("antenna_frequency", LongType, nullable = true),
      StructField("beamwidth", DoubleType, nullable = true),
      StructField("gain", DoubleType, nullable = true),
      StructField("vertical_beamwidth", DoubleType, nullable = true),
      StructField("ipd_p0", StringType, nullable = true),
      StructField("site_name", StringType, nullable = true),
      StructField("migration_status", StringType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
