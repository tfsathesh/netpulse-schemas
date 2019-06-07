CREATE EXTERNAL TABLE `ftaggregated_scored_v2`(
  `userid` string, 
  `predclass` int, 
  `probclass0` double, 
  `probclass1` double)
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/CSI_INCAS/ftaggregated.scored/nomid/v2/days=7'
TBLPROPERTIES (
  'transient_lastDdlTime'='1505725818')
