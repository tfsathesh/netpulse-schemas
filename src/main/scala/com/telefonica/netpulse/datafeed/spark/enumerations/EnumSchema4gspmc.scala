package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchema4gspmc extends Enumeration {
type enumSchema4gspmc = Value

    val datetimetimezone                           = Value(1-1)
    val ci                                         = Value(2-1)
    val jvco_id                                    = Value(3-1)
    val pmcelldowntimeman                          = Value(4-1)
    val pmcelldowntimeauto                         = Value(5-1)
    val lcelav_samples_cell_avail                  = Value(6-1)
    val lcelav_samples_cell_plan_unavail           = Value(7-1)
    val lcelav_denom_cell_avail                    = Value(8-1)
    val csr                                        = Value(9-1)
    val mycom_id                                   = Value(10-1)
    val magnet_cell_type                           = Value(11-1)
    val degrees_latitude                           = Value(12-1)
    val degrees_longitude                          = Value(13-1)
    val magnetipd_3g_4g_vendor                     = Value(14-1)
    val dt                                         = Value(15-1)
}
