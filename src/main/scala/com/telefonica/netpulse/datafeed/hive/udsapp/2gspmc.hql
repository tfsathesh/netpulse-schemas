CREATE EXTERNAL TABLE `2gspmc`(
  `datetimetimezone` string, 
  `ci` string, 
  `jvco_id` string, 
  `bdwnacc` bigint, 
  `tdwnscan` bigint, 
  `bcch_uptime` bigint, 
  `ave_avail_tch_sum` bigint, 
  `bcch_downtime` bigint, 
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
  'hdfs://udsnameservice/data/proptima/spmc/2g'
TBLPROPERTIES (
  'last_modified_by'='udsldr', 
  'last_modified_time'='1549494809', 
  'transient_lastDdlTime'='1549494809')
