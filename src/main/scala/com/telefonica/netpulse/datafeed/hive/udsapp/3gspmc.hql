CREATE EXTERNAL TABLE `3gspmc`(
  `datetimetimezone` string, 
  `ci` string, 
  `jvco_id` string, 
  `pmcelldowntimeman` bigint, 
  `pmcelldowntimeauto` bigint, 
  `avail_wcell_exists_in_rnw_db` bigint, 
  `avail_wcell_in_wo_state` bigint, 
  `avail_wcell_blocked_by_user` bigint, 
  `csr` string, 
  `mycom_id` string, 
  `bsc` string, 
  `magnet_cell_type` string, 
  `degrees_latitude` string, 
  `degrees_longitude` string, 
  `magnetipd_3g_4g_vendor` string)
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\;' 
  LINES TERMINATED BY '\n' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/proptima/spmc/3g'
TBLPROPERTIES (
  'last_modified_by'='udsldr', 
  'last_modified_time'='1549494821', 
  'transient_lastDdlTime'='1549494821')
