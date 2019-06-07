CREATE EXTERNAL TABLE `ascom1`(
  `time` string COMMENT 'from deserializer', 
  `latitude` string COMMENT 'from deserializer', 
  `longitude` string COMMENT 'from deserializer', 
  `dat` string COMMENT 'from deserializer', 
  `equipment` string COMMENT 'from deserializer', 
  `logfile` string COMMENT 'from deserializer', 
  `operator` string COMMENT 'from deserializer', 
  `region` string COMMENT 'from deserializer', 
  `udr` string COMMENT 'from deserializer', 
  `url` string COMMENT 'from deserializer', 
  `technology` string COMMENT 'from deserializer', 
  `status` string COMMENT 'from deserializer', 
  `type` string COMMENT 'from deserializer', 
  `technology_detail` string COMMENT 'from deserializer', 
  `duration_method_a` string COMMENT 'from deserializer', 
  `throughput_method_a` string COMMENT 'from deserializer', 
  `page_size` string COMMENT 'from deserializer', 
  `sample_initiated_on_4g` string COMMENT 'from deserializer', 
  `city` string COMMENT 'from deserializer', 
  `http_session_time` string COMMENT 'from deserializer', 
  `sample_initiated_on_3g` string COMMENT 'from deserializer', 
  `sample_initiated_on_2g` string COMMENT 'from deserializer', 
  `start_time` string COMMENT 'from deserializer', 
  `reportstatus` string COMMENT 'from deserializer', 
  `route_type` string COMMENT 'from deserializer', 
  `startlatitude` string COMMENT 'from deserializer', 
  `startlongitude` string COMMENT 'from deserializer', 
  `imei` string COMMENT 'from deserializer', 
  `imsi` string COMMENT 'from deserializer', 
  `channel` string COMMENT 'from deserializer', 
  `technologylist` string COMMENT 'from deserializer', 
  `errorcause` string COMMENT 'from deserializer', 
  `firstsignalstrength` string COMMENT 'from deserializer', 
  `lastsignalstrength` string COMMENT 'from deserializer', 
  `arithavgsignalstrength` string COMMENT 'from deserializer', 
  `logavgsignalstrength` string COMMENT 'from deserializer', 
  `route_part` string COMMENT 'from deserializer', 
  `beacon_area` string COMMENT 'from deserializer', 
  `original_udr` string COMMENT 'from deserializer', 
  `callid` string COMMENT 'from deserializer', 
  `trueregion` string COMMENT 'from deserializer', 
  `notes` string COMMENT 'from deserializer', 
  `reportperiod` string COMMENT 'from deserializer', 
  `currentset` string COMMENT 'from deserializer', 
  `msisdn` string COMMENT 'from deserializer')
PARTITIONED BY ( 
  `dt` int)
ROW FORMAT SERDE 
  'org.apache.hadoop.hive.serde2.OpenCSVSerde' 
WITH SERDEPROPERTIES ( 
  'quoteChar'='\"', 
  'separatorChar'=',') 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/ascom'
TBLPROPERTIES (
  'skip.header.line.count'='1', 
  'transient_lastDdlTime'='1490626203')
