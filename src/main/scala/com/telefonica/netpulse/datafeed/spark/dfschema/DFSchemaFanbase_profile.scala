package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaFanbase_profile {

  val dFSchemaFanbase_profile = StructType(
    List(
      StructField("msisdn", StringType, nullable = true),
      StructField("subscr_id", LongType, nullable = true),
      StructField("email_address", StringType, nullable = true),
      StructField("age_band", StringType, nullable = true),
      StructField("gender", StringType, nullable = true),
      StructField("postal_sector", StringType, nullable = true),
      StructField("handset_model", StringType, nullable = true),
      StructField("handset_manufacturer", StringType, nullable = true),
      StructField("needs_segment_name", StringType, nullable = true),
      StructField("smart_phone_ind", StringType, nullable = true),
      StructField("operating_system_name", StringType, nullable = true),
      StructField("lte_subscr_ind", StringType, nullable = true),
      StructField("bill_cycle_day", IntegerType, nullable = true),
      StructField("avg_3_mths_spend", DoubleType, nullable = true),
      StructField("avg_3_mths_calls_usage", IntegerType, nullable = true),
      StructField("avg_3_mths_sms_usage", IntegerType, nullable = true),
      StructField("avg_3_mths_data_usage", IntegerType, nullable = true),
      StructField("avg_3_mths_intl_calls_usage", IntegerType, nullable = true),
      StructField("avg_3_mths_roam_calls_usage", IntegerType, nullable = true),
      StructField("avg_3_mths_roam_sms_usage", IntegerType, nullable = true),
      StructField("avg_3_mths_roam_data_usage", IntegerType, nullable = true),
      StructField("data_bolton_ind", StringType, nullable = true),
      StructField("insurance_bolton_ind", StringType, nullable = true),
      StructField("o2travel_optin_ind", StringType, nullable = true),
      StructField("pm_registered_ind", StringType, nullable = true),
      StructField("connection_dt", DateType, nullable = true),
      StructField("contract_start_dt", DateType, nullable = true),
      StructField("contract_end_dt", DateType, nullable = true),
      StructField("contract_term_mths", IntegerType, nullable = true),
      StructField("upgrade_dt", DateType, nullable = true),
      StructField("cust_tenure_mths", IntegerType, nullable = true),
      StructField("pay_and_go_migrated_ind", StringType, nullable = true),
      StructField("pay_and_go_migrated_dt", DateType, nullable = true),
      StructField("ported_in_ind", StringType, nullable = true),
      StructField("ported_in_dt", DateType, nullable = true),
      StructField("ported_in_from_netwk_name", StringType, nullable = true),
      StructField("disconnection_dt", StringType, nullable = true),
      StructField("tariff_name", StringType, nullable = true),
      StructField("sim_only_ind", StringType, nullable = true),
      StructField("acquisition_channel_name", StringType, nullable = true),
      StructField("billing_system_name", StringType, nullable = true),
      StructField("last_billing_date", DateType, nullable = true),
      StructField("event_desc", StringType, nullable = true),
      StructField("contact_event_type_cd", StringType, nullable = true),
      StructField("event_start_dt", DateType, nullable = true),
      StructField("campaign_cd", StringType, nullable = true),
      StructField("texts_optin_ind", StringType, nullable = true),
      StructField("email_optin_ind", StringType, nullable = true),
      StructField("phone_optin_ind", StringType, nullable = true),
      StructField("post_optin_ind", StringType, nullable = true),
      StructField("all_marketing_optin_ind", StringType, nullable = true),
      StructField("dt", StringType, nullable = true)
    ))
}
