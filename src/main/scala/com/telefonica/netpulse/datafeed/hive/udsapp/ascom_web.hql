CREATE EXTERNAL TABLE `ascom_web`(
  `ascom_imsi` bigint, 
  `ascom_url` string, 
  `web_domain` string, 
  `web_url` string, 
  `ascom_endtime_with_http` timestamp, 
  `ascom_endtime_with_duration_method_a` timestamp, 
  `diff_ascom_endtime_httpweb_timestamp_time` bigint, 
  `diff_ascom_endtime_duration_method_a_web_timestamp_time` bigint, 
  `web_timestamp` timestamp)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
  LINES TERMINATED BY '\n' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/temp'
TBLPROPERTIES (
  'COLUMN_STATS_ACCURATE'='false', 
  'numFiles'='0', 
  'numRows'='-1', 
  'rawDataSize'='-1', 
  'totalSize'='0', 
  'transient_lastDdlTime'='1490956104')
