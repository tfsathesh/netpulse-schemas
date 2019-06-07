CREATE EXTERNAL TABLE `dpi_datasum`(
  `event_id` string COMMENT 'The DPI can (but doesn\'t yet) include control plane events. It could change in the future but for now will only be data usage', 
  `event_result` string COMMENT 'Result of the event procedure (currently all is success for data events)', 
  `date` int, 
  `time_hour` int COMMENT 'Hour within the log', 
  `time_minute` int COMMENT 'Minute within the log', 
  `time_second` int COMMENT 'Second within the log', 
  `time_millisecond` int COMMENT 'Millisecond within the log', 
  `duration` int COMMENT 'Session duration. This value cannot be currently used for analytics - this does not represent a duration of the data session. The data aggregated for 5min from the timestamp.', 
  `default_bearer_id` int COMMENT 'Default bearer is a tunnel between the EnodeB and the PGW - resources are shared with others. A dedicated bearer would be for VoLTE', 
  `pdn_id` bigint COMMENT 'Packet Data Network ID, based on Charging ID', 
  `rule_space` int COMMENT 'RuleSpace content filtering rule name, defined as an ASCII string', 
  `imsi` bigint COMMENT 'imsi of user making request', 
  `imeisv` bigint COMMENT 'imeisv of the device being used for the request', 
  `msisdn` int COMMENT 'msisdn of the user making the request - this is not populated for data sessions and needs to be enriched from the UserCatalogue in the future.', 
  `mcc` int COMMENT 'country code - ca be joined with udsuser.mcctocountry to derive country names', 
  `mnc` int COMMENT 'Mobile network code. A mobile country code (MCC) is used in combination with a mobile network code (MNC) (a combination known as an ”MCC/MNC tuple”) to uniquely identify a mobile network operator (carrier) using the GSM', 
  `rating_group` int COMMENT 'Every APN has a charged UK, charged roaming and a free usage groups. These numbers refer to these charging profiles.', 
  `service_ul_bytes` int COMMENT 'Upload bytes for transaction', 
  `service_dl_bytes` int COMMENT 'Download bytes for transaction', 
  `service_time_seconds` int)
PARTITIONED BY ( 
  `dt` string, 
  `hour` string, 
  `loc` string, 
  `csp` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/ebm/datasum'
TBLPROPERTIES (
  'transient_lastDdlTime'='1556810008')
