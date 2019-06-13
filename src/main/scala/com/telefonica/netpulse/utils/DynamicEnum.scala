package com.telefonica.netpulse.utils

import scala.language.dynamics


class DynamicEnum(fieldsAndTypesMap: Map[Int, (String, String)]) extends Enumeration with Dynamic {
  type Type = Value
  //fields.foreach(name => Value(name))

  for (elem <- fieldsAndTypesMap.keys) {
      Value(fieldsAndTypesMap.get(elem).get._1)
  }
    def selectDynamic(name:String) = withName(name)
}
