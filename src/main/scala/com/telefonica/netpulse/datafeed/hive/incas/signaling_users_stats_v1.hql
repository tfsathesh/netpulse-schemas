CREATE EXTERNAL TABLE `signaling_users_stats_v1`(
  `userid` string, 
  `totevents` int, 
  `totvalid` int, 
  `totfailed` int, 
  `activate_valid_2g` int, 
  `attach_valid_2g` int, 
  `deactivate_valid_2g` int, 
  `detach_valid_2g` int, 
  `israu_valid_2g` int, 
  `rau_valid_2g` int, 
  `service_request_valid_2g` int, 
  `others_valid_2g` int, 
  `activate_valid_3g` int, 
  `attach_valid_3g` int, 
  `deactivate_valid_3g` int, 
  `detach_valid_3g` int, 
  `israu_valid_3g` int, 
  `rau_valid_3g` int, 
  `service_request_valid_3g` int, 
  `others_valid_3g` int, 
  `l_attach_valid_4g` int, 
  `l_dedicated_bearer_activate_valid_4g` int, 
  `l_dedicated_bearer_deactivate_valid_4g` int, 
  `l_detach_valid_4g` int, 
  `l_handover_valid_4g` int, 
  `l_pdn_connect_valid_4g` int, 
  `l_pdn_disconnect_valid_4g` int, 
  `l_service_request_valid_4g` int, 
  `l_tau_valid_4g` int, 
  `others_valid_4g` int, 
  `activate_fail_2g` int, 
  `attach_fail_2g` int, 
  `deactivate_fail_2g` int, 
  `detach_fail_2g` int, 
  `israu_fail_2g` int, 
  `rau_fail_2g` int, 
  `service_request_fail_2g` int, 
  `others_fail_2g` int, 
  `activate_fail_3g` int, 
  `attach_fail_3g` int, 
  `deactivate_fail_3g` int, 
  `detach_fail_3g` int, 
  `israu_fail_3g` int, 
  `rau_fail_3g` int, 
  `service_request_fail_3g` int, 
  `others_fail_3g` int, 
  `l_attach_fail_4g` int, 
  `l_dedicated_bearer_activate_fail_4g` int, 
  `l_dedicated_bearer_deactivate_fail_4g` int, 
  `l_detach_fail_4g` int, 
  `l_handover_fail_4g` int, 
  `l_pdn_connect_fail_4g` int, 
  `l_pdn_disconnect_fail_4g` int, 
  `l_service_request_fail_4g` int, 
  `l_tau_fail_4g` int, 
  `others_fail_4g` int)
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/CSI_INCAS/Signaling/v1/users/stats'
TBLPROPERTIES (
  'transient_lastDdlTime'='1502724041')
