CREATE EXTERNAL TABLE `fanbase_profile`(
  `msisdn` string COMMENT 'MPN', 
  `subscr_id` bigint COMMENT 'Unique reference generated within Nucleus for the MPN', 
  `email_address` string COMMENT '"Best email address with subscriptionPAYM and P&G only. The email address is blanked during the feed ingesition."', 
  `age_band` string COMMENT '"Standard customer age banding within Nucleus standard PAYM and P&G only"', 
  `gender` string COMMENT 'PAYM and P&G only', 
  `postal_sector` string COMMENT '"First 4 digits of post code (4 digits or first 3 digits + space)', 
  `handset_model` string COMMENT 'For the most Current handset of the subscriber', 
  `handset_manufacturer` string COMMENT 'For the most Current handset of the subscriber', 
  `needs_segment_name` string COMMENT '"Marketing segment.', 
  `smart_phone_ind` string COMMENT 'Flag to indicate if the most Current handset of the subscriber is a smartphone', 
  `operating_system_name` string COMMENT 'For the most Current handset of the subscriber', 
  `lte_subscr_ind` string COMMENT 'Flag to indicate if the subscription is a 4G one', 
  `bill_cycle_day` int COMMENT 'Billing day. Only populated for PAYM and Business', 
  `avg_3_mths_spend` float COMMENT 'Average Spend inclusive of VAT for the last 3 months', 
  `avg_3_mths_calls_usage` int COMMENT 'Average voice call duration in minutes for the last 3 months', 
  `avg_3_mths_sms_usage` int COMMENT 'Average number of SMS and MMS for the last 3 months', 
  `avg_3_mths_data_usage` int COMMENT 'Average data call size in Megabytes for the last 3 months', 
  `avg_3_mths_intl_calls_usage` int COMMENT 'Average voice call duration in minutes for international calls for the last 3 months', 
  `avg_3_mths_roam_calls_usage` int COMMENT 'Average voice call duration in minutes for Roaming calls for the last 3 months', 
  `avg_3_mths_roam_sms_usage` int COMMENT 'Average number of SMS and MMS while Roaming for the last 3 months', 
  `avg_3_mths_roam_data_usage` int COMMENT 'Average data call size in Megabytes while Roaming for the last 3 months', 
  `data_bolton_ind` string COMMENT 'Flag to indicate if the subscription holds a data BoltON', 
  `insurance_bolton_ind` string COMMENT 'Flag to indicate if the subscription holds an Insurance BoltON ', 
  `o2travel_optin_ind` string COMMENT 'Flag to indicate if the subscription holds a BoltON for O2 Travel ', 
  `pm_registered_ind` string COMMENT 'Flag to indicate if the subscription is registered for Priority Moments', 
  `connection_dt` date COMMENT '"P&G: The start date of the account subscription', 
  `contract_start_dt` date COMMENT 'Contract Start Date for the subscription. Populated for PAYM and Business only', 
  `contract_end_dt` date COMMENT 'Contract End Date for the subscription. Populated for PAYM and Business only', 
  `contract_term_mths` int COMMENT 'The term of the contract in months', 
  `upgrade_dt` date COMMENT 'For Consumer Pay Monthly this is the last resign date for SME&Corp this is the last handset upgrade date', 
  `cust_tenure_mths` int COMMENT 'The number of Months since the Tenure Date (i.e. When the subscription began its tenure).', 
  `pay_and_go_migrated_ind` string COMMENT 'Flag to indicate that the subscription migrated from P&G. Populated for PAYM only', 
  `pay_and_go_migrated_dt` date COMMENT 'Date the subscription migrated from P&G. Populated for PAYM only', 
  `ported_in_ind` string COMMENT 'Flag to indicate that the subscription ported in from another service provider', 
  `ported_in_dt` date COMMENT 'The date the subscription was ported in from another  service provider.', 
  `ported_in_from_netwk_name` string COMMENT 'The service provider that the subscription ported from', 
  `disconnection_dt` string COMMENT 'The latest date the subscription status was no longer Active', 
  `tariff_name` string COMMENT 'The name of the most current Tariff', 
  `sim_only_ind` string COMMENT 'Flag to indicate if the subscription is SIM Only', 
  `acquisition_channel_name` string COMMENT 'This description identifying the lowest level in the Channel Hierarchy', 
  `billing_system_name` string COMMENT 'The organisational segment of the subscription', 
  `last_billing_date` date COMMENT 'For DISE and Postpay only. The last invoice date', 
  `event_desc` string COMMENT 'Desc of the event (first 50 Chars)', 
  `contact_event_type_cd` string COMMENT 'Type of the contact event', 
  `event_start_dt` date COMMENT 'Date of the event', 
  `campaign_cd` string COMMENT '"A code that uniquely identifies the campaign.', 
  `texts_optin_ind` string COMMENT 'An indicator to show whether the Customer has either Opted in (i.e. Value=Y, Permission to contact customer) or Opted out (i.e. Value=N, Do not contact customer) from receiving communications via the TEXT Channel.  If we cannot determine the Permission bas', 
  `email_optin_ind` string COMMENT 'An indicator to show whether the Customer has either Opted in (i.e. Value=Y, Permission to contact customer) or Opted out (i.e. Value=N, Do not contact customer) from receiving communications via the EMAIL Channel.  If we cannot determine the Permission ba', 
  `phone_optin_ind` string COMMENT 'An indicator to show whether the Customer has either Opted in (i.e. Value=Y, Permission to contact customer) or Opted out (i.e. Value=N, Do not contact customer) from receiving communications via the PHONE Channel.  If we cannot determine the Permission ba', 
  `post_optin_ind` string COMMENT 'An indicator to show whether the Customer has either Opted in (i.e. Value=Y, Permission to contact customer) or Opted out (i.e. Value=N, Do not contact customer) from receiving communications via the POST Channel.  If we cannot determine the Permission bas', 
  `all_marketing_optin_ind` string COMMENT 'An indicator to show whether the Customer has either Opted in (i.e. Value=Y, Permission to contact customer) or Opted out (i.e. Value=N, Do not contact customer) from receiving ALL Marketing communications.  If we cannot determine the Permission based on t')
PARTITIONED BY ( 
  `dt` string)
ROW FORMAT DELIMITED 
  FIELDS TERMINATED BY '\t' 
STORED AS INPUTFORMAT 
  'org.apache.hadoop.mapred.TextInputFormat' 
OUTPUTFORMAT 
  'org.apache.hadoop.hive.ql.io.HiveIgnoreKeyTextOutputFormat'
LOCATION
  'hdfs://udsnameservice/data/fanbase/profile'
TBLPROPERTIES (
  'last_modified_by'='hdfs', 
  'last_modified_time'='1557913145', 
  'transient_lastDdlTime'='1557913145')
