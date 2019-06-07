package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaCalls2g3g_sectors_stats_v2 extends Enumeration {
type enumSchemaCalls2g3g_sectors_stats_v2 = Value

    val key                                        = Value(1-1)
    val calls_all                                  = Value(2-1)
    val calls_suc_all                              = Value(3-1)
    val calls_fail_all                             = Value(4-1)
    val calls_mo_all                               = Value(5-1)
    val calls_mt_all                               = Value(6-1)
    val calls_suc_2g                               = Value(7-1)
    val calls_fail_2g                              = Value(8-1)
    val calls_suc_3g                               = Value(9-1)
    val calls_fail_3g                              = Value(10-1)
    val calls_suc_mo_2g                            = Value(11-1)
    val calls_fail_mo_2g                           = Value(12-1)
    val calls_suc_mt_2g                            = Value(13-1)
    val calls_fail_mt_2g                           = Value(14-1)
    val calls_suc_mo_3g                            = Value(15-1)
    val calls_fail_mo_3g                           = Value(16-1)
    val calls_suc_mt_3g                            = Value(17-1)
    val calls_fail_mt_3g                           = Value(18-1)
    val dt                                         = Value(19-1)
}
