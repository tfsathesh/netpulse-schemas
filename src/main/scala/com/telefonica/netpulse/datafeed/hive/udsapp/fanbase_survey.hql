CREATE EXTERNAL TABLE `fanbase_survey`(
  `emsisdn` string COMMENT 'Msisdn', 
  `subscr_id` bigint COMMENT 'Unique reference generated within Nucleus for the MPN', 
  `survey_id` bigint COMMENT 'This is the internal Nucleus key that uniquely identifies the survey instance', 
  `script_id` int COMMENT 'The internal Nucleus key of the related survey script', 
  `survey_dt` date COMMENT 'Date survey invitation was sent, if the survey invitation is not available then this will be response date', 
  `survey_tm` bigint COMMENT 'Time survey invitation was sent,  if the survey invitation is not available then this will be response time', 
  `survey_cd` string COMMENT 'This is the unique identifier of the survey instance within the Fanbase database', 
  `script_name` string COMMENT 'The name of the survey', 
  `script_desc` string COMMENT 'The description of the survey', 
  `survey_meth_name` string COMMENT 'The medium through which the survey was conducted, currently SMS and email')
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/fanbase/survey'
TBLPROPERTIES (
  'last_modified_by'='hdfs', 
  'last_modified_time'='1557837038', 
  'transient_lastDdlTime'='1557837039')
