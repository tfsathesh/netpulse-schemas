CREATE EXTERNAL TABLE `calls2g3g_users_stats_v2`(
  `key` string, 
  `calls_all` bigint, 
  `calls_suc_all` bigint, 
  `calls_fail_all` bigint, 
  `calls_mo_all` bigint, 
  `calls_mt_all` bigint, 
  `calls_suc_2g` bigint, 
  `calls_fail_2g` bigint, 
  `calls_suc_3g` bigint, 
  `calls_fail_3g` bigint, 
  `calls_suc_mo_2g` bigint, 
  `calls_fail_mo_2g` bigint, 
  `calls_suc_mt_2g` bigint, 
  `calls_fail_mt_2g` bigint, 
  `calls_suc_mo_3g` bigint, 
  `calls_fail_mo_3g` bigint, 
  `calls_suc_mt_3g` bigint, 
  `calls_fail_mt_3g` bigint)
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/CSI_INCAS/Calls2G3G/v2/users/stats'
TBLPROPERTIES (
  'transient_lastDdlTime'='1533120025')
