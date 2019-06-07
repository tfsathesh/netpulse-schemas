CREATE EXTERNAL TABLE `ftaggregated_scored_v3`(
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
  'hdfs://udsnameservice/data/CSI_INCAS/ftaggregated.scored/nomid/v3.withvoice-sep18/days=7'
TBLPROPERTIES (
  'transient_lastDdlTime'='1538824955')
