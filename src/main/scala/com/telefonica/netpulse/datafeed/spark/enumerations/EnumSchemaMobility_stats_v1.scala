package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaMobility_stats_v1 extends Enumeration {
type enumSchemaMobility_stats_v1 = Value

    val userid                                     = Value(1-1)
    val numevents                                  = Value(2-1)
    val numeventsnolocation                        = Value(3-1)
    val numsectors                                 = Value(4-1)
    val numsectorsnolocation                       = Value(5-1)
    val numhandovers                               = Value(6-1)
    val totduration                                = Value(7-1)
    val avgduration                                = Value(8-1)
    val gyration                                   = Value(9-1)
    val entropy                                    = Value(10-1)
    val entropynorm                                = Value(11-1)
    val bbdiagonal                                 = Value(12-1)
    val xcentroid                                  = Value(13-1)
    val ycentroid                                  = Value(14-1)
    val dt                                         = Value(15-1)
    val hour                                       = Value(16-1)
}
