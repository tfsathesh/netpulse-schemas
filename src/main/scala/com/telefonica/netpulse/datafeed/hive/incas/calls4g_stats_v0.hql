CREATE EXTERNAL TABLE `calls4g_stats_v0`(
  `userid` string, 
  `cntactivate` int, 
  `cntdeactivate` int, 
  `cntrejectactivate` int, 
  `cntrejectdeactivate` int, 
  `percrejectactivate` double, 
  `percrejectdeactivate` double, 
  `cntcalls` int, 
  `cntcallsdowngrade` int, 
  `perccallsdowngrade` double, 
  `cntincomplete` int, 
  `percincompleteratio` double, 
  `totduration` int, 
  `totdurationdowngrade` int, 
  `percdurationdowngrade` double)
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/CSI_INCAS/Calls4G/v0/stats'
TBLPROPERTIES (
  'transient_lastDdlTime'='1504629102')
