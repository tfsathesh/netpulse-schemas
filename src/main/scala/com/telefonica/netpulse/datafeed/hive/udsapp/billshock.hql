CREATE EXTERNAL TABLE `billshock`(
  `recordtype` string, 
  `localsequencenumber` string, 
  `servedimsi` string, 
  `ggsnaddress` string, 
  `chargingid` string, 
  `listofsgsnaddress` string, 
  `accesspointname` string, 
  `pdptype` string, 
  `servedpdpaddress` string, 
  `remotepdpaddress` string, 
  `dynamicaddressflag` string, 
  `gosrequested` string, 
  `gosnegotiated` string, 
  `datavolumegprsuplink` string, 
  `datavolumegprsdownlink` string, 
  `changecondition` string, 
  `changetime` string, 
  `recordopeningtime` string, 
  `duration` string, 
  `causeforrecclosing` string, 
  `diagnostics` string, 
  `recordsequencenumber` string, 
  `nodeid` string, 
  `packetvolumegprsuplink` string, 
  `packetvolumegprsdownlink` string, 
  `servedimei` string, 
  `msclassmark` string, 
  `routingarea` string, 
  `locationarea` string, 
  `celldentity` string, 
  `sgsnchange` string, 
  `apnselectionmode` string, 
  `accesspointnameoi` string, 
  `chargingcharacteristics` string, 
  `camelinformationpdd` string, 
  `systemtype` string, 
  `rattype` string, 
  `chchselectionmode` string, 
  `pmnidentifier` string, 
  `userlocationinformation` string, 
  `emsisdn` string)
PARTITIONED BY ( 
  `dt` string, 
  `hour` int, 
  `csp` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'com.hadoop.mapred.DeprecatedLzoTextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/nucleus/billshock'
TBLPROPERTIES (
  'last_modified_by'='udsldr', 
  'last_modified_time'='1482912242', 
  'transient_lastDdlTime'='1482912242')
