package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchema4gtef extends Enumeration {
type enumSchema4gtef = Value

    val datetimetimezone                           = Value(1-1)
    val ci                                         = Value(2-1)
    val jvco_id                                    = Value(3-1)
    val s12_4g_availability_num                    = Value(4-1)
    val s12_4g_availability_denom                  = Value(5-1)
    val s12_4g_dl_thput_num                        = Value(6-1)
    val s12_4g_dl_thput_denom                      = Value(7-1)
    val s12_4g_ul_thput_num                        = Value(8-1)
    val s12_4g_ul_thput_denom                      = Value(9-1)
    val v_4g_dl_scheduling_time_num                = Value(10-1)
    val v_4g_dl_scheduling_time_denom              = Value(11-1)
    val s12_4g_s1_ssr_num                          = Value(12-1)
    val s12_4g_s1_ssr_denom                        = Value(13-1)
    val s12_4g_rrc_ssr_num                         = Value(14-1)
    val s12_4g_rrc_ssr_denom                       = Value(15-1)
    val s12_4g_erab_initial_ssr_num                = Value(16-1)
    val s12_4g_erab_initial_ssr_denom              = Value(17-1)
    val s12_4g_service_dr_num                      = Value(18-1)
    val s12_4g_service_dr_denom                    = Value(19-1)
    val v_4g_dl_data_volume                        = Value(20-1)
    val v_4g_ul_data_volume                        = Value(21-1)
    val v_4g_cpu_load                              = Value(22-1)
    val v_4g_dl_packet_loss_rate_num               = Value(23-1)
    val v_4g_dl_packet_loss_rate_denom             = Value(24-1)
    val v_4g_ul_packet_loss_rate_num               = Value(25-1)
    val v_4g_ul_packet_loss_rate_denom             = Value(26-1)
    val v_4g_dl_avg_active_users_denom             = Value(27-1)
    val v_4g_ul_avg_active_users_num               = Value(28-1)
    val v_4g_ul_avg_active_users_denom             = Value(29-1)
    val v_4g_avg_rrc_users_num                     = Value(30-1)
    val v_4g_avg_rrc_users_denom                   = Value(31-1)
    val v_4g_session_time_ue                       = Value(32-1)
    val v_4g_csfb_wcdma                            = Value(33-1)
    val v_4g_csfb_gsm                              = Value(34-1)
    val v_4g_service_drop_mme                      = Value(35-1)
    val v_4g_erab_added_sr_qci_1_num               = Value(36-1)
    val v_4g_erab_added_sr_qci_1_den               = Value(37-1)
    val v_4g_erab_added_sr_qci_5_num               = Value(38-1)
    val v_4g_erab_added_sr_qci_5_den               = Value(39-1)
    val v_4g_erab_dcr_radio_qci_1_num              = Value(40-1)
    val v_4g_erab_dcr_radio_qci_1_den              = Value(41-1)
    val v_4g_erab_dcr_radio_active_qci_1_num       = Value(42-1)
    val v_4g_erab_dcr_radio_active_qci_1_den       = Value(43-1)
    val v_4g_erab_dcr_e2e_active_qci_1_num         = Value(44-1)
    val v_4g_erab_dcr_e2e_active_qci_1_den         = Value(45-1)
    val v_4g_erlangs_qci_1                         = Value(46-1)
    val v_4g_avg_voice_call_duration_num           = Value(47-1)
    val v_4g_avg_voice_call_duration_den           = Value(48-1)
    val v_4g_srvcc_to_utran_ho_sr_num              = Value(49-1)
    val v_4g_srvcc_to_utran_ho_sr_den              = Value(50-1)
    val v_4g_srvcc_to_geran_ho_sr_num              = Value(51-1)
    val v_4g_srvcc_to_geran_ho_sr_den              = Value(52-1)
    val v_4g_srvcc_to_utran_porosity_num           = Value(53-1)
    val v_4g_srvcc_to_utran_porosity_den           = Value(54-1)
    val v_4g_srvcc_to_geran_porosity_num           = Value(55-1)
    val v_4g_srvcc_to_geran_porosity_den           = Value(56-1)
    val v_4g_dl_pdcp_packet_error_loss_rate_qci_1_num = Value(57-1)
    val v_4g_dl_pdcp_packet_error_loss_rate_qci_1_den = Value(58-1)
    val v_4g_ul_pdcp_packet_error_loss_rate_qci_1_num = Value(59-1)
    val v_4g_ul_pdcp_packet_error_loss_rate_qci_1_den = Value(60-1)
    val v_4g_dl_latency_qci_1                      = Value(61-1)
    val v_4g_dl_latency_qci_1_num                  = Value(62-1)
    val v_4g_dl_latency_qci_1_den                  = Value(63-1)
    val v_4g_dl_thput_qci_1                        = Value(64-1)
    val v_4g_dl_thput_qci_1_num                    = Value(65-1)
    val v_4g_dl_thput_qci_1_den                    = Value(66-1)
    val v_4g_dl_lte_utilisation_num                = Value(67-1)
    val v_4g_ul_lte_utilisation_num                = Value(68-1)
    val v_4g_dl_lte_utilisation_denom              = Value(69-1)
    val v_4g_ul_lte_utilisation_denom              = Value(70-1)
    val lte_dl_utilisation_num                     = Value(71-1)
    val lte_dl_utilisation_den                     = Value(72-1)
    val lte_ul_utilisation_num                     = Value(73-1)
    val lte_ul_utilisation_den                     = Value(74-1)
    val v_s1_srr_den                               = Value(75-1)
    val v_s1_srr_num                               = Value(76-1)
    val s12_4g_irat_handover_den                   = Value(77-1)
    val s12_4g_irat_handover_num                   = Value(78-1)
    val s12_4g_service_dr_eri_mme_num              = Value(79-1)
    val t_4g_tti_utilisation                       = Value(80-1)
    val t_4g_user_average_throughput               = Value(81-1)
    val v_4g_avg_simultaneous_user_qci1            = Value(82-1)
    val v_4g_max_simultaneous_user_qci1            = Value(83-1)
    val v_4g_dl_avg_active_users_vfgroup           = Value(84-1)
    val v_4g_dl_thput_vfgroup_denom                = Value(85-1)
    val v_4g_dl_thput_vfgroup_num                  = Value(86-1)
    val v_4g_erab_dcr_radio_qci_5_den              = Value(87-1)
    val v_4g_erab_dcr_radio_qci_5_num              = Value(88-1)
    val v_4g_inter_freq_ho_sr_volte_den            = Value(89-1)
    val v_4g_inter_freq_ho_sr_volte_num            = Value(90-1)
    val v_4g_intra_freq_ho_sr_volte_den            = Value(91-1)
    val v_4g_intra_freq_ho_sr_volte_num            = Value(92-1)
    val v_4g_srvcc_to_utran_prep_sr                = Value(93-1)
    val v_4g_voice_traffic                         = Value(94-1)
    val v_4g_cre_rej                               = Value(95-1)
    val v_4g_dl_ca_throughput_den                  = Value(96-1)
    val v_4g_dl_ca_throughput_num                  = Value(97-1)
    val v_4g_number_dl_ca_users                    = Value(98-1)
    val v_4g_scell_configuration_sr_den            = Value(99-1)
    val v_4g_scell_configuration_sr_num            = Value(100-1)
    val s12_4g_erab_dcr_e2e_qci_1_den              = Value(101-1)
    val s12_4g_erab_dcr_e2e_qci_1_num              = Value(102-1)
    val t_4g_data_user_ave_thput_kbps_den          = Value(103-1)
    val t_4g_data_user_ave_thput_kbps_num          = Value(104-1)
    val v_4g_data_available_prbs                   = Value(105-1)
    val v_4g_data_cell_activity_secs               = Value(106-1)
    val v_4g_data_dl_cqi_ave                       = Value(107-1)
    val v_4g_data_dl_mcs_ave_ex_256_qam            = Value(108-1)
    val v_4g_data_prbs_used_by_pdsch               = Value(109-1)
    val v_4g_data_rank_ind_ave_dl_ue_reported      = Value(110-1)
    val v_4g_data_thput_dl_cell_kbps               = Value(111-1)
    val v_4g_data_thput_dl_user_ca_kbps            = Value(112-1)
    val v_4g_data_thput_dl_user_non_ca_kbps        = Value(113-1)
    val v_4g_data_traffic_dl_ca_kbits              = Value(114-1)
    val v_4g_data_traffic_dl_mac_layer_kbits       = Value(115-1)
    val v_4g_voice_volte_cssr_group_v7r_den        = Value(116-1)
    val v_4g_voice_volte_cssr_group_v7r_num        = Value(117-1)
    val v_4g_voice_volte_dcr_group_v5r_den         = Value(118-1)
    val v_4g_voice_volte_dcr_group_v5r_num         = Value(119-1)
    val s12_4g_erab_sr_qci_1_den                   = Value(120-1)
    val s12_4g_erab_sr_qci_1_num                   = Value(121-1)
    val s12_4g_dl_avg_active_users                 = Value(122-1)
    val csr                                        = Value(123-1)
    val magnetipd4g_kitgen                         = Value(124-1)
    val ne_status                                  = Value(125-1)
    val cellowner                                  = Value(126-1)
    val mycom_id                                   = Value(127-1)
    val magnet_cell_type                           = Value(128-1)
    val degrees_latitude                           = Value(129-1)
    val degrees_longitude                          = Value(130-1)
    val magnetipd_3g_4g_vendor                     = Value(131-1)
    val dt                                         = Value(132-1)
}
