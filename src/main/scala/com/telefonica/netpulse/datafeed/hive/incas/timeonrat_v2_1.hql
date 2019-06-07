CREATE EXTERNAL TABLE `timeonrat_v2_1`(
  `key` string, 
  `totevents` int, 
  `filtered` int, 
  `in2g` double, 
  `in3g` double, 
  `in4g` double, 
  `avg2gup` double, 
  `avg3gdown` double, 
  `avg3gup` double, 
  `avg4gdown` double, 
  `tottrans` int, 
  `trans2g3g` int, 
  `trans2g4g` int, 
  `trans3g2g` int, 
  `trans3g4g` int, 
  `trans4g2g` int)
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/CSI_INCAS/TimeOnRat/v2.1'
TBLPROPERTIES (
  'transient_lastDdlTime'='1500885656')
