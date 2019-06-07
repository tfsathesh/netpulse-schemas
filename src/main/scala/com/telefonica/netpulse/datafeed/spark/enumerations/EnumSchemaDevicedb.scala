package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaDevicedb extends Enumeration {
type enumSchemaDevicedb = Value

    val emsisdn                                    = Value(1-1)
    val imsi                                       = Value(2-1)
    val imei                                       = Value(3-1)
    val marketing_name                             = Value(4-1)
    val internal_model_name                        = Value(5-1)
    val manufacturer                               = Value(6-1)
    val bands                                      = Value(7-1)
    val allocation_date                            = Value(8-1)
    val brand_name                                 = Value(9-1)
    val model_name                                 = Value(10-1)
    val operating_system                           = Value(11-1)
    val nfc                                        = Value(12-1)
    val bluetooth                                  = Value(13-1)
    val wlan                                       = Value(14-1)
    val device_type                                = Value(15-1)
    val service_provider_id                        = Value(16-1)
    val tariff_offering_id                         = Value(17-1)
    val billing_system                             = Value(18-1)
    val dt                                         = Value(19-1)
}
