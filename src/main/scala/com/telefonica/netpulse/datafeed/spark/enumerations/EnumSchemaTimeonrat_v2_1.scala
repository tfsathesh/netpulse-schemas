package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaTimeonrat_v2_1 extends Enumeration {
type enumSchemaTimeonrat_v2_1 = Value

    val key                                        = Value(1-1)
    val totevents                                  = Value(2-1)
    val filtered                                   = Value(3-1)
    val in2g                                       = Value(4-1)
    val in3g                                       = Value(5-1)
    val in4g                                       = Value(6-1)
    val avg2gup                                    = Value(7-1)
    val avg3gdown                                  = Value(8-1)
    val avg3gup                                    = Value(9-1)
    val avg4gdown                                  = Value(10-1)
    val tottrans                                   = Value(11-1)
    val trans2g3g                                  = Value(12-1)
    val trans2g4g                                  = Value(13-1)
    val trans3g2g                                  = Value(14-1)
    val trans3g4g                                  = Value(15-1)
    val trans4g2g                                  = Value(16-1)
    val dt                                         = Value(17-1)
}
