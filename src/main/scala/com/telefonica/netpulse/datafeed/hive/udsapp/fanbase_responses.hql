CREATE EXTERNAL TABLE `fanbase_responses`(
  `msisdn` string COMMENT 'Msisdn', 
  `subscr_id` bigint COMMENT 'Unique reference generated within Nucleus for the MPN', 
  `survey_id` bigint COMMENT 'This is the internal Nucleus key that uniquely identifies the survey instance', 
  `script_id` int COMMENT 'The internal Nucleus key of the related survey script', 
  `script_question_id` int COMMENT 'The internal system key of the survey question', 
  `script_question_cd` string COMMENT 'The question sequence as loaded from Fanbase (not necessarily chronological or logical sequence due to conditionality, although true for most surveys. For actual sequence refer to questioning routeing definition from CMR Team)', 
  `script_question_name` string COMMENT 'A short name of the question', 
  `script_question_desc` string COMMENT 'Detail decsription of the Question', 
  `survey_response_dt` date COMMENT 'Date survey response was deemed completed (ie all mandatory questions answered)', 
  `survey_response_val` string COMMENT 'Actual customer response (may be truncated if the answer exceeds a 500 characters)')
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/fanbase/responses'
TBLPROPERTIES (
  'last_modified_by'='hdfs', 
  'last_modified_time'='1557835041', 
  'transient_lastDdlTime'='1557835041')
