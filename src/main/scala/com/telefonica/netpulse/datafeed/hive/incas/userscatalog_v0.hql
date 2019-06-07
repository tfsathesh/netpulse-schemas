CREATE EXTERNAL TABLE `userscatalog_v0`(
  `userid` string, 
  `imsi` string, 
  `imei` string, 
  `svset` string, 
  `date` string, 
  `csp` string, 
  `collisions` string, 
  `useridpairingtimecnt` int, 
  `datafeedmask` int, 
  `is2g` int, 
  `is3g` int, 
  `is4g` int, 
  `isdata2g` int, 
  `isdata3g` int, 
  `isdata4g` int, 
  `isvoice2g` int, 
  `isvoice3g` int, 
  `isvoice4g` int, 
  `tac2g` int, 
  `tac3g` int, 
  `tac4g` int, 
  `tac4gtdd` int, 
  `tacmanufacturer` string, 
  `tacmodelname` string, 
  `tacos` string, 
  `countryiso` string, 
  `operator` string, 
  `apnstrcnt` int, 
  `apnstr` string)
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/CSI_INCAS/UsersCatalog/v0'
TBLPROPERTIES (
  'transient_lastDdlTime'='1527354591')
