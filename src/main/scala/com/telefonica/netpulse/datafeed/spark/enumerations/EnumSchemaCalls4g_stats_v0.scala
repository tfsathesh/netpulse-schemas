package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaCalls4g_stats_v0 extends Enumeration {
type enumSchemaCalls4g_stats_v0 = Value

    val userid                                     = Value(1-1)
    val cntactivate                                = Value(2-1)
    val cntdeactivate                              = Value(3-1)
    val cntrejectactivate                          = Value(4-1)
    val cntrejectdeactivate                        = Value(5-1)
    val percrejectactivate                         = Value(6-1)
    val percrejectdeactivate                       = Value(7-1)
    val cntcalls                                   = Value(8-1)
    val cntcallsdowngrade                          = Value(9-1)
    val perccallsdowngrade                         = Value(10-1)
    val cntincomplete                              = Value(11-1)
    val percincompleteratio                        = Value(12-1)
    val totduration                                = Value(13-1)
    val totdurationdowngrade                       = Value(14-1)
    val percdurationdowngrade                      = Value(15-1)
    val dt                                         = Value(16-1)
}
