package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaDevicedb {

  val dFSchemaDevicedb = StructType(
    List(
      StructField("emsisdn", StringType, nullable = true),
      StructField("imsi", StringType, nullable = true),
      StructField("imei", StringType, nullable = true),
      StructField("marketing_name", StringType, nullable = true),
      StructField("internal_model_name", StringType, nullable = true),
      StructField("manufacturer", StringType, nullable = true),
      StructField("bands", StringType, nullable = true),
      StructField("allocation_date", StringType, nullable = true),
      StructField("brand_name", StringType, nullable = true),
      StructField("model_name", StringType, nullable = true),
      StructField("operating_system", StringType, nullable = true),
      StructField("nfc", StringType, nullable = true),
      StructField("bluetooth", StringType, nullable = true),
      StructField("wlan", StringType, nullable = true),
      StructField("device_type", StringType, nullable = true),
      StructField("service_provider_id", StringType, nullable = true),
      StructField("tariff_offering_id", StringType, nullable = true),
      StructField("billing_system", StringType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
