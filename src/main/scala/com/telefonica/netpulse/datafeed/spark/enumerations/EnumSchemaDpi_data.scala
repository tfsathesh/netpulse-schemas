package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaDpi_data extends Enumeration {
type enumSchemaDpi_data = Value

    val event_id                                   = Value(1-1)
    val event_result                               = Value(2-1)
    val date                                       = Value(3-1)
    val time_hour                                  = Value(4-1)
    val time_minute                                = Value(5-1)
    val time_second                                = Value(6-1)
    val time_millisecond                           = Value(7-1)
    val duration                                   = Value(8-1)
    val default_bearer_id                          = Value(9-1)
    val pdn_id                                     = Value(10-1)
    val rule_space                                 = Value(11-1)
    val imsi                                       = Value(12-1)
    val imeisv                                     = Value(13-1)
    val msisdn                                     = Value(14-1)
    val mcc                                        = Value(15-1)
    val mnc                                        = Value(16-1)
    val rating_group                               = Value(17-1)
    val protocol_category                          = Value(18-1)
    val service_identifier                         = Value(19-1)
    val service_ul_bytes                           = Value(20-1)
    val service_dl_bytes                           = Value(21-1)
    val service_time_seconds                       = Value(22-1)
    val dt                                         = Value(23-1)
    val hour                                       = Value(24-1)
    val loc                                        = Value(25-1)
    val csp                                        = Value(26-1)
}
