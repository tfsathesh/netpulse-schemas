package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaFanbase_responses extends Enumeration {
type enumSchemaFanbase_responses = Value

    val msisdn                                     = Value(1-1)
    val subscr_id                                  = Value(2-1)
    val survey_id                                  = Value(3-1)
    val script_id                                  = Value(4-1)
    val script_question_id                         = Value(5-1)
    val script_question_cd                         = Value(6-1)
    val script_question_name                       = Value(7-1)
    val script_question_desc                       = Value(8-1)
    val survey_response_dt                         = Value(9-1)
    val survey_response_val                        = Value(10-1)
    val dt                                         = Value(11-1)
}
