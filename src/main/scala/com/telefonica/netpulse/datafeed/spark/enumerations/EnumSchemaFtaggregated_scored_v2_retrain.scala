package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaFtaggregated_scored_v2_retrain extends Enumeration {
type enumSchemaFtaggregated_scored_v2_retrain = Value

    val userid                                     = Value(1-1)
    val predclass                                  = Value(2-1)
    val probclass0                                 = Value(3-1)
    val probclass1                                 = Value(4-1)
    val dt                                         = Value(5-1)
}
