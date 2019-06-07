CREATE EXTERNAL TABLE `mobility_stats_v1`(
  `userid` string, 
  `numevents` int, 
  `numeventsnolocation` int, 
  `numsectors` int, 
  `numsectorsnolocation` int, 
  `numhandovers` int, 
  `totduration` double, 
  `avgduration` double, 
  `gyration` double, 
  `entropy` double, 
  `entropynorm` double, 
  `bbdiagonal` double, 
  `xcentroid` double, 
  `ycentroid` double)
PARTITIONED BY ( 
  `dt` string, 
  `hour` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/CSI_INCAS/Mobility/v1/stats'
TBLPROPERTIES (
  'transient_lastDdlTime'='1502717541')
