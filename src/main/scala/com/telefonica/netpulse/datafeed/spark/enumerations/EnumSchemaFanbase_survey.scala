package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaFanbase_survey extends Enumeration {
type enumSchemaFanbase_survey = Value

    val emsisdn                                    = Value(1-1)
    val subscr_id                                  = Value(2-1)
    val survey_id                                  = Value(3-1)
    val script_id                                  = Value(4-1)
    val survey_dt                                  = Value(5-1)
    val survey_tm                                  = Value(6-1)
    val survey_cd                                  = Value(7-1)
    val script_name                                = Value(8-1)
    val script_desc                                = Value(9-1)
    val survey_meth_name                           = Value(10-1)
    val dt                                         = Value(11-1)
}
