package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaFanbase_profile extends Enumeration {
type enumSchemaFanbase_profile = Value

    val msisdn                                     = Value(1-1)
    val subscr_id                                  = Value(2-1)
    val email_address                              = Value(3-1)
    val age_band                                   = Value(4-1)
    val gender                                     = Value(5-1)
    val postal_sector                              = Value(6-1)
    val handset_model                              = Value(7-1)
    val handset_manufacturer                       = Value(8-1)
    val needs_segment_name                         = Value(9-1)
    val smart_phone_ind                            = Value(10-1)
    val operating_system_name                      = Value(11-1)
    val lte_subscr_ind                             = Value(12-1)
    val bill_cycle_day                             = Value(13-1)
    val avg_3_mths_spend                           = Value(14-1)
    val avg_3_mths_calls_usage                     = Value(15-1)
    val avg_3_mths_sms_usage                       = Value(16-1)
    val avg_3_mths_data_usage                      = Value(17-1)
    val avg_3_mths_intl_calls_usage                = Value(18-1)
    val avg_3_mths_roam_calls_usage                = Value(19-1)
    val avg_3_mths_roam_sms_usage                  = Value(20-1)
    val avg_3_mths_roam_data_usage                 = Value(21-1)
    val data_bolton_ind                            = Value(22-1)
    val insurance_bolton_ind                       = Value(23-1)
    val o2travel_optin_ind                         = Value(24-1)
    val pm_registered_ind                          = Value(25-1)
    val connection_dt                              = Value(26-1)
    val contract_start_dt                          = Value(27-1)
    val contract_end_dt                            = Value(28-1)
    val contract_term_mths                         = Value(29-1)
    val upgrade_dt                                 = Value(30-1)
    val cust_tenure_mths                           = Value(31-1)
    val pay_and_go_migrated_ind                    = Value(32-1)
    val pay_and_go_migrated_dt                     = Value(33-1)
    val ported_in_ind                              = Value(34-1)
    val ported_in_dt                               = Value(35-1)
    val ported_in_from_netwk_name                  = Value(36-1)
    val disconnection_dt                           = Value(37-1)
    val tariff_name                                = Value(38-1)
    val sim_only_ind                               = Value(39-1)
    val acquisition_channel_name                   = Value(40-1)
    val billing_system_name                        = Value(41-1)
    val last_billing_date                          = Value(42-1)
    val event_desc                                 = Value(43-1)
    val contact_event_type_cd                      = Value(44-1)
    val event_start_dt                             = Value(45-1)
    val campaign_cd                                = Value(46-1)
    val texts_optin_ind                            = Value(47-1)
    val email_optin_ind                            = Value(48-1)
    val phone_optin_ind                            = Value(49-1)
    val post_optin_ind                             = Value(50-1)
    val all_marketing_optin_ind                    = Value(51-1)
    val dt                                         = Value(52-1)
}
