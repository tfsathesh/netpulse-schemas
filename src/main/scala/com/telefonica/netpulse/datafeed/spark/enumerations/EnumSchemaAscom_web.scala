package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaAscom_web extends Enumeration {
type enumSchemaAscom_web = Value

    val ascom_imsi                                 = Value(1-1)
    val ascom_url                                  = Value(2-1)
    val web_domain                                 = Value(3-1)
    val web_url                                    = Value(4-1)
    val ascom_endtime_with_http                    = Value(5-1)
    val ascom_endtime_with_duration_method_a       = Value(6-1)
    val diff_ascom_endtime_httpweb_timestamp_time  = Value(7-1)
    val diff_ascom_endtime_duration_method_a_web_timestamp_time = Value(8-1)
    val web_timestamp                              = Value(9-1)
}
