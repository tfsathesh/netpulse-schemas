package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchema2gvod extends Enumeration {
type enumSchema2gvod = Value

    val datetimetimezone                           = Value(1-1)
    val ci                                         = Value(2-1)
    val jvco_id                                    = Value(3-1)
    val s12_2g_asr_denom                           = Value(4-1)
    val s12_2g_asr_num                             = Value(5-1)
    val s12_2g_avail_denom                         = Value(6-1)
    val s12_2g_avail_num                           = Value(7-1)
    val s12_2g_cssr_data_denom                     = Value(8-1)
    val s12_2g_cssr_data_num                       = Value(9-1)
    val s12_2g_dcr_data_denom                      = Value(10-1)
    val s12_2g_dcr_data_num                        = Value(11-1)
    val s12_2g_dcr_voice_denom                     = Value(12-1)
    val s12_2g_dcr_voice_num                       = Value(13-1)
    val s12_2g_sdcch_dr_denom                      = Value(14-1)
    val s12_2g_sdcch_dr_num                        = Value(15-1)
    val s12_2g_sdcch_sr_denom                      = Value(16-1)
    val s12_2g_sdcch_sr_num                        = Value(17-1)
    val s12_2g_voice_qual_dl_denom                 = Value(18-1)
    val s12_2g_voice_qual_dl_num                   = Value(19-1)
    val s12_2g_voice_qual_ul_denom                 = Value(20-1)
    val s12_2g_voice_qual_ul_num                   = Value(21-1)
    val s12_2g_voice_traffic                       = Value(22-1)
    val t_2g_dl_data_traffic                       = Value(23-1)
    val t_2g_edge_gprs_tbf_drops                   = Value(24-1)
    val t_2g_edge_gprs_tbfs                        = Value(25-1)
    val t_2g_gprs_dl_attempts                      = Value(26-1)
    val t_2g_gprs_dl_blocks                        = Value(27-1)
    val t_2g_normal_disconnections                 = Value(28-1)
    val t_2g_sd_attempts                           = Value(29-1)
    val t_2g_sd_blocks                             = Value(30-1)
    val t_2g_sd_drops                              = Value(31-1)
    val t_2g_sd_seizures                           = Value(32-1)
    val t_2g_sd_sms                                = Value(33-1)
    val t_2g_ta_hua_band_0                         = Value(34-1)
    val t_2g_ta_hua_band_1                         = Value(35-1)
    val t_2g_ta_hua_band_10                        = Value(36-1)
    val t_2g_ta_hua_band_11                        = Value(37-1)
    val t_2g_ta_hua_band_12                        = Value(38-1)
    val t_2g_ta_hua_band_13                        = Value(39-1)
    val t_2g_ta_hua_band_14                        = Value(40-1)
    val t_2g_ta_hua_band_15                        = Value(41-1)
    val t_2g_ta_hua_band_16                        = Value(42-1)
    val t_2g_ta_hua_band_17                        = Value(43-1)
    val t_2g_ta_hua_band_18                        = Value(44-1)
    val t_2g_ta_hua_band_19                        = Value(45-1)
    val t_2g_ta_hua_band_2                         = Value(46-1)
    val t_2g_ta_hua_band_20                        = Value(47-1)
    val t_2g_ta_hua_band_21                        = Value(48-1)
    val t_2g_ta_hua_band_22                        = Value(49-1)
    val t_2g_ta_hua_band_23                        = Value(50-1)
    val t_2g_ta_hua_band_24                        = Value(51-1)
    val t_2g_ta_hua_band_25                        = Value(52-1)
    val t_2g_ta_hua_band_26                        = Value(53-1)
    val t_2g_ta_hua_band_27                        = Value(54-1)
    val t_2g_ta_hua_band_28                        = Value(55-1)
    val t_2g_ta_hua_band_29                        = Value(56-1)
    val t_2g_ta_hua_band_3                         = Value(57-1)
    val t_2g_ta_hua_band_30                        = Value(58-1)
    val t_2g_ta_hua_band_4                         = Value(59-1)
    val t_2g_ta_hua_band_5                         = Value(60-1)
    val t_2g_ta_hua_band_6                         = Value(61-1)
    val t_2g_ta_hua_band_7                         = Value(62-1)
    val t_2g_ta_hua_band_8                         = Value(63-1)
    val t_2g_ta_hua_band_9                         = Value(64-1)
    val t_2g_ta_nsn_band_0                         = Value(65-1)
    val t_2g_ta_nsn_band_1                         = Value(66-1)
    val t_2g_ta_nsn_band_2                         = Value(67-1)
    val t_2g_ta_nsn_band_3                         = Value(68-1)
    val t_2g_ta_nsn_band_4                         = Value(69-1)
    val t_2g_ta_nsn_band_5                         = Value(70-1)
    val t_2g_ta_nsn_band_6                         = Value(71-1)
    val t_2g_ta_nsn_band_7                         = Value(72-1)
    val t_2g_ta_nsn_band_8                         = Value(73-1)
    val t_2g_ta_nsn_band_9                         = Value(74-1)
    val t_2g_tc_blocks_post_dir_ret                = Value(75-1)
    val t_2g_tc_normal_attempts                    = Value(76-1)
    val t_2g_tc_normal_sz                          = Value(77-1)
    val t_2g_ul_data_traffic                       = Value(78-1)
    val t_2g_voice_drops_dcr3                      = Value(79-1)
    val t_2g_voice_traffic                         = Value(80-1)
    val v_2g_accessibility_attempts                = Value(81-1)
    val v_2g_amr_hr_penetration_denom              = Value(82-1)
    val v_2g_amr_hr_penetration_num                = Value(83-1)
    val v_2g_avail_pdch_ch                         = Value(84-1)
    val v_2g_avail_sdcch_ch                        = Value(85-1)
    val v_2g_avail_tch_ch                          = Value(86-1)
    val v_2g_blocks                                = Value(87-1)
    val v_2g_busy_hour                             = Value(88-1)
    val v_2g_edge_throughput_dl                    = Value(89-1)
    val v_2g_edge_throughput_ul                    = Value(90-1)
    val v_2g_gprs_throughput_dl                    = Value(91-1)
    val v_2g_gprs_throughput_ul                    = Value(92-1)
    val v_2g_irat_ho_to_3g                         = Value(93-1)
    val v_2g_isho_to_gsm                           = Value(94-1)
    val v_2g_mean_dl_pdchs_denom                   = Value(95-1)
    val v_2g_mean_dl_pdchs_num                     = Value(96-1)
    val v_2g_mean_ul_pdchs_denom                   = Value(97-1)
    val v_2g_mean_ul_pdchs_num                     = Value(98-1)
    val v_2g_sim_dl_tbf                            = Value(99-1)
    val v_2g_sim_ul_tbf                            = Value(100-1)
    val v_2g_trxs                                  = Value(101-1)
    val v_2g_voice_traffic_fr                      = Value(102-1)
    val v_2g_voice_traffic_hr                      = Value(103-1)
    val v_cell_basis_2g_dcr_calls_best_approach    = Value(104-1)
    val v_cell_basis_2g_dcr_dropped_calls          = Value(105-1)
    val v_network_basis_2g_dcr_calls               = Value(106-1)
    val v_network_basis_2g_dcr_dropped_calls       = Value(107-1)
    val csr                                        = Value(108-1)
    val ne_status                                  = Value(109-1)
    val cellowner                                  = Value(110-1)
    val mycom_id                                   = Value(111-1)
    val bsc                                        = Value(112-1)
    val magnet_cell_type                           = Value(113-1)
    val degrees_latitude                           = Value(114-1)
    val degrees_longitude                          = Value(115-1)
    val magnetipd_3g_4g_vendor                     = Value(116-1)
    val dt                                         = Value(117-1)
}
