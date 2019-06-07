CREATE EXTERNAL TABLE `atoll`(
  `csr` string, 
  `db_record_id` string, 
  `cell_identity` string, 
  `transmitter_id` string, 
  `latitude` bigint, 
  `longitude` bigint, 
  `altitude` bigint, 
  `region` string, 
  `bts_name` string, 
  `site_type` string, 
  `prediction_radius` bigint, 
  `prediction_resolution` bigint, 
  `number_of_antenna` bigint, 
  `cell_type` string, 
  `antenna_name` string, 
  `height` float, 
  `tilt` float, 
  `azimuth` float, 
  `electrical_tilt` float, 
  `antenna_dx` string, 
  `antenna_dy` string, 
  `antenna_frequency` bigint, 
  `beamwidth` float, 
  `gain` float, 
  `vertical_beamwidth` float, 
  `ipd_p0` string, 
  `site_name` string, 
  `migration_status` string)
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY ',' 
  LINES TERMINATED BY '\n' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/atoll'
TBLPROPERTIES (
  'transient_lastDdlTime'='1547662473')
