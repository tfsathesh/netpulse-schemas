package com.telefonica.incas.experimental.datafeed


import org.apache.spark.sql.types._

object DFSchemaBillshock {

  val dFSchemaBillshock = StructType(
    List(
      StructField("recordtype", StringType, nullable = true),
      StructField("localsequencenumber", StringType, nullable = true),
      StructField("servedimsi", StringType, nullable = true),
      StructField("ggsnaddress", StringType, nullable = true),
      StructField("chargingid", StringType, nullable = true),
      StructField("listofsgsnaddress", StringType, nullable = true),
      StructField("accesspointname", StringType, nullable = true),
      StructField("pdptype", StringType, nullable = true),
      StructField("servedpdpaddress", StringType, nullable = true),
      StructField("remotepdpaddress", StringType, nullable = true),
      StructField("dynamicaddressflag", StringType, nullable = true),
      StructField("gosrequested", StringType, nullable = true),
      StructField("gosnegotiated", StringType, nullable = true),
      StructField("datavolumegprsuplink", StringType, nullable = true),
      StructField("datavolumegprsdownlink", StringType, nullable = true),
      StructField("changecondition", StringType, nullable = true),
      StructField("changetime", StringType, nullable = true),
      StructField("recordopeningtime", StringType, nullable = true),
      StructField("duration", StringType, nullable = true),
      StructField("causeforrecclosing", StringType, nullable = true),
      StructField("diagnostics", StringType, nullable = true),
      StructField("recordsequencenumber", StringType, nullable = true),
      StructField("nodeid", StringType, nullable = true),
      StructField("packetvolumegprsuplink", StringType, nullable = true),
      StructField("packetvolumegprsdownlink", StringType, nullable = true),
      StructField("servedimei", StringType, nullable = true),
      StructField("msclassmark", StringType, nullable = true),
      StructField("routingarea", StringType, nullable = true),
      StructField("locationarea", StringType, nullable = true),
      StructField("celldentity", StringType, nullable = true),
      StructField("sgsnchange", StringType, nullable = true),
      StructField("apnselectionmode", StringType, nullable = true),
      StructField("accesspointnameoi", StringType, nullable = true),
      StructField("chargingcharacteristics", StringType, nullable = true),
      StructField("camelinformationpdd", StringType, nullable = true),
      StructField("systemtype", StringType, nullable = true),
      StructField("rattype", StringType, nullable = true),
      StructField("chchselectionmode", StringType, nullable = true),
      StructField("pmnidentifier", StringType, nullable = true),
      StructField("userlocationinformation", StringType, nullable = true),
      StructField("emsisdn", StringType, nullable = true),
      StructField("dt", StringType, nullable = true),
      StructField("hour", IntegerType, nullable = true),
      StructField("csp", StringType, nullable = true)
    ))
}
