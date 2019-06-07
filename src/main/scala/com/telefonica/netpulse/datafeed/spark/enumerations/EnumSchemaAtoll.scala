package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaAtoll extends Enumeration {
type enumSchemaAtoll = Value

    val csr                                        = Value(1-1)
    val db_record_id                               = Value(2-1)
    val cell_identity                              = Value(3-1)
    val transmitter_id                             = Value(4-1)
    val latitude                                   = Value(5-1)
    val longitude                                  = Value(6-1)
    val altitude                                   = Value(7-1)
    val region                                     = Value(8-1)
    val bts_name                                   = Value(9-1)
    val site_type                                  = Value(10-1)
    val prediction_radius                          = Value(11-1)
    val prediction_resolution                      = Value(12-1)
    val number_of_antenna                          = Value(13-1)
    val cell_type                                  = Value(14-1)
    val antenna_name                               = Value(15-1)
    val height                                     = Value(16-1)
    val tilt                                       = Value(17-1)
    val azimuth                                    = Value(18-1)
    val electrical_tilt                            = Value(19-1)
    val antenna_dx                                 = Value(20-1)
    val antenna_dy                                 = Value(21-1)
    val antenna_frequency                          = Value(22-1)
    val beamwidth                                  = Value(23-1)
    val gain                                       = Value(24-1)
    val vertical_beamwidth                         = Value(25-1)
    val ipd_p0                                     = Value(26-1)
    val site_name                                  = Value(27-1)
    val migration_status                           = Value(28-1)
    val dt                                         = Value(29-1)
}
