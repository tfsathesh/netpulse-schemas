CREATE EXTERNAL TABLE `devicedb`(
  `emsisdn` string, 
  `imsi` string, 
  `imei` string, 
  `marketing_name` string, 
  `internal_model_name` string, 
  `manufacturer` string, 
  `bands` string, 
  `allocation_date` string, 
  `brand_name` string, 
  `model_name` string, 
  `operating_system` string, 
  `nfc` string, 
  `bluetooth` string, 
  `wlan` string, 
  `device_type` string, 
  `service_provider_id` string, 
  `tariff_offering_id` string, 
  `billing_system` string)
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
  LINES TERMINATED BY '\n' 
STORED AS INPUTFORMAT 
  'com.hadoop.mapred.DeprecatedLzoTextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/DeviceDB'
TBLPROPERTIES (
  'last_modified_by'='udsldr', 
  'last_modified_time'='1483977134', 
  'transient_lastDdlTime'='1483977134')
