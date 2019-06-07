package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaUserscatalog_v0 extends Enumeration {
type enumSchemaUserscatalog_v0 = Value

    val userid                                     = Value(1-1)
    val imsi                                       = Value(2-1)
    val imei                                       = Value(3-1)
    val svset                                      = Value(4-1)
    val date                                       = Value(5-1)
    val csp                                        = Value(6-1)
    val collisions                                 = Value(7-1)
    val useridpairingtimecnt                       = Value(8-1)
    val datafeedmask                               = Value(9-1)
    val is2g                                       = Value(10-1)
    val is3g                                       = Value(11-1)
    val is4g                                       = Value(12-1)
    val isdata2g                                   = Value(13-1)
    val isdata3g                                   = Value(14-1)
    val isdata4g                                   = Value(15-1)
    val isvoice2g                                  = Value(16-1)
    val isvoice3g                                  = Value(17-1)
    val isvoice4g                                  = Value(18-1)
    val tac2g                                      = Value(19-1)
    val tac3g                                      = Value(20-1)
    val tac4g                                      = Value(21-1)
    val tac4gtdd                                   = Value(22-1)
    val tacmanufacturer                            = Value(23-1)
    val tacmodelname                               = Value(24-1)
    val tacos                                      = Value(25-1)
    val countryiso                                 = Value(26-1)
    val operator                                   = Value(27-1)
    val apnstrcnt                                  = Value(28-1)
    val apnstr                                     = Value(29-1)
    val dt                                         = Value(30-1)
}
