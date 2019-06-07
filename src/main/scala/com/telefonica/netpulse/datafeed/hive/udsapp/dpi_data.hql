CREATE EXTERNAL TABLE `dpi_data`(
  `event_id` string COMMENT 'The DPI can (but doesnt yet) include control plane events. It could change in the future but for now will only be data usage', 
  `event_result` string COMMENT 'Result of the event procedure', 
  `date` int, 
  `time_hour` int COMMENT 'our within the log', 
  `time_minute` int COMMENT 'Minute within the log', 
  `time_second` int COMMENT 'Second within the log', 
  `time_millisecond` int COMMENT 'Millisecond within the log', 
  `duration` int COMMENT 'Session duration', 
  `default_bearer_id` int COMMENT 'Default bearer is the tunnel between the EnodeB and the PGW - resources are shared with others. A dedicated bearer would be for VoLTE', 
  `pdn_id` bigint COMMENT 'Packet Data Network ID, based on Charging ID', 
  `rule_space` int COMMENT 'RuleSpace content filtering rule name, defined as an ASCII string', 
  `imsi` bigint COMMENT 'imsi of user making request', 
  `imeisv` bigint COMMENT 'imeisv of the device being used for the requet', 
  `msisdn` int COMMENT 'msisdn of the user making the request. Not populated by the feed - needs to be enriched in the future', 
  `mcc` int COMMENT 'country code - ca be joined with udsuser.mcctocountry to derive country names', 
  `mnc` int COMMENT 'Mobile network code. A mobile country code (MCC) is used in combination with a mobile network code (MNC) (a combination known as an "MCC/MNC tuple") to uniquely identify a mobile network operator (carrier) using the GSM', 
  `rating_group` int COMMENT 'Every APN has a charged UK, charged roaming and a free usage groups. These numbers refer to these charging profiles. Not populated in dpi_data - only present in dpi_datasum', 
  `protocol_category` string COMMENT 'Category of protocol (e.g. VoIP)', 
  `service_identifier` string COMMENT 'Service identifier within the category (e.g. Skype)', 
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
  'hdfs://udsnameservice/data/ebm/data'
TBLPROPERTIES (
  'last_modified_by'='hdfs', 
  'last_modified_time'='1557917796', 
  'transient_lastDdlTime'='1557917796')
