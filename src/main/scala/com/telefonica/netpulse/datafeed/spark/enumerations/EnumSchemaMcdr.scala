package com.telefonica.incas.experimental.datafeed

//Please note, character 'c' is padded to the left of field name in case  1.Name starts with Number 2.Name of field is type
object enumSchemaMcdr extends Enumeration {
type enumSchemaMcdr = Value

    val recordtype                                 = Value(1-1)
    val servedimsi                                 = Value(2-1)
    val gwaddress                                  = Value(3-1)
    val chargingid                                 = Value(4-1)
    val servingnodeaddress                         = Value(5-1)
    val accesspointnameni                          = Value(6-1)
    val pdppdntype                                 = Value(7-1)
    val servedpdppdnaddress                        = Value(8-1)
    val dynamicaddressflag                         = Value(9-1)
    val recordopeningtime                          = Value(10-1)
    val duration                                   = Value(11-1)
    val causeforrecclosing                         = Value(12-1)
    val recordsequencenumber                       = Value(13-1)
    val nodeid                                     = Value(14-1)
    val localsequencenumber                        = Value(15-1)
    val apnselectionmode                           = Value(16-1)
    val servedmsisdn                               = Value(17-1)
    val chargingcharacteristics                    = Value(18-1)
    val chchselectionmode                          = Value(19-1)
    val servedimeisv                               = Value(20-1)
    val rattype                                    = Value(21-1)
    val event_005_tac                              = Value(22-1)
    val event_005_eci                              = Value(23-1)
    val ratinggroup                                = Value(24-1)
    val resultcode                                 = Value(25-1)
    val timeoffirstusage                           = Value(26-1)
    val timeoflastusage                            = Value(27-1)
    val timeusage                                  = Value(28-1)
    val serviceconditionchange                     = Value(29-1)
    val qosinformationneg                          = Value(30-1)
    val datavolumefbcuplink                        = Value(31-1)
    val datavolumefbcdownlink                      = Value(32-1)
    val timeofreport                               = Value(33-1)
    val failurehandlingcontinue                    = Value(34-1)
    val serviceidentifier                          = Value(35-1)
    val servingnodetype                            = Value(36-1)
    val starttime                                  = Value(37-1)
    val stoptime                                   = Value(38-1)
    val pdnconnectionid                            = Value(39-1)
    val sgsnchange                                 = Value(40-1)
    val remotepdpaddress                           = Value(41-1)
    val qosrequested                               = Value(42-1)
    val qosnegotiated                              = Value(43-1)
    val datavolumegprsuplink                       = Value(44-1)
    val datavolumegprsdownlink                     = Value(45-1)
    val changecondition                            = Value(46-1)
    val changetime                                 = Value(47-1)
    val diagnostics                                = Value(48-1)
    val recordextensions                           = Value(49-1)
    val packetvolumegprsuplink                     = Value(50-1)
    val packetvolumegprsdownlink                   = Value(51-1)
    val msclassmark                                = Value(52-1)
    val routingarea                                = Value(53-1)
    val locationarea                               = Value(54-1)
    val cellidentity                               = Value(55-1)
    val accesspointnameoi                          = Value(56-1)
    val camelinformationpdp                        = Value(57-1)
    val systemtype                                 = Value(58-1)
    val pmnidentifier                              = Value(59-1)
    val dt                                         = Value(60-1)
    val hour                                       = Value(61-1)
    val csp                                        = Value(62-1)
}
