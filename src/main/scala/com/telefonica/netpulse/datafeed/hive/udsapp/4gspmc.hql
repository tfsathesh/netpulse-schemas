CREATE EXTERNAL TABLE `4gspmc`(
  `datetimetimezone` string, 
  `ci` string, 
  `jvco_id` string, 
  `pmcelldowntimeman` bigint, 
  `pmcelldowntimeauto` bigint, 
  `lcelav_samples_cell_avail` bigint, 
  `lcelav_samples_cell_plan_unavail` bigint, 
  `lcelav_denom_cell_avail` bigint, 
  `csr` string, 
  `mycom_id` string, 
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
  'hdfs://udsnameservice/data/proptima/spmc/4g'
TBLPROPERTIES (
  'last_modified_by'='udsldr', 
  'last_modified_time'='1549494896', 
  'transient_lastDdlTime'='1549494896')
