CREATE EXTERNAL TABLE `mobility_topk_v1`(
  `userid` string, 
  `gyration` double, 
  `bbdiagonal` double, 
  `topduration` double, 
  `topkduration` double, 
  `sectorid1` string, 
  `timesector1` double, 
  `sectorid2` string, 
  `timesector2` double, 
  `sectorid3` string, 
  `timesector3` double, 
  `sectorid4` string, 
  `timesector4` double, 
  `sectorid5` string, 
  `timesector5` double, 
  `sectorid6` string, 
  `timesector6` double, 
  `sectorid7` string, 
  `timesector7` double, 
  `sectorid8` string, 
  `timesector8` double, 
  `sectorid9` string, 
  `timesector9` double, 
  `sectorid10` string, 
  `timesector10` double, 
  `sectorid11` string, 
  `timesector11` double, 
  `sectorid12` string, 
  `timesector12` double, 
  `sectorid13` string, 
  `timesector13` double, 
  `sectorid14` string, 
  `timesector14` double, 
  `sectorid15` string, 
  `timesector15` double, 
  `sectorid16` string, 
  `timesector16` double, 
  `sectorid17` string, 
  `timesector17` double, 
  `sectorid18` string, 
  `timesector18` double, 
  `sectorid19` string, 
  `timesector19` double, 
  `sectorid20` string, 
  `timesector20` double)
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
  'hdfs://udsnameservice/data/CSI_INCAS/Mobility/v1/topk'
TBLPROPERTIES (
  'transient_lastDdlTime'='1502717580')
