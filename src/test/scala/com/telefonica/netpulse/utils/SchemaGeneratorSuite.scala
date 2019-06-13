package com.telefonica.netpulse.utils


import com.holdenkarau.spark.testing.DataFrameSuiteBase
import com.telefonica.netpulse.datafeed.enumSchemaIpfr
import org.scalatest.FunSuite
import com.telefonica.netpulse.datafeed.DFSchemaIpfr


class SchemaGeneratorSuite extends FunSuite with DataFrameSuiteBase {

  override implicit def reuseContextIfPossible: Boolean = true

  test("verify Enum Schema Values - datatypes in source file") {

    val inputPath = this.getClass.getClassLoader.getResource("udsappipfr.txt").getPath
    val enum = SchemaGenerator.getEnumeration(inputPath)
    assert(enum.values.mkString(","), enumSchemaIpfr.values.mkString(","))
  }

  test("verify Enum Schema Values - without datatypes in source file") {
    val inputPath = this.getClass.getClassLoader.getResource("udsappipfrFields.txt").getPath
    val enum = SchemaGenerator.getEnumeration(inputPath)
    assert(enum.values.mkString(","), enumSchemaIpfr.values.mkString(","))
  }

  test("verify Enum Schema ids - without datatypes in source file") {
    val inputPath = this.getClass.getClassLoader.getResource("udsappipfrFields.txt").getPath
    val enum = SchemaGenerator.getEnumeration(inputPath)
    assert(enum.csp.id, enumSchemaIpfr.csp.id)
    assert(enum.manufacturer.id, enumSchemaIpfr.manufacturer.id)
  }

  test("verify DF Schema  -  datatypes in source file") {
    val inputPath = this.getClass.getClassLoader.getResource("udsappipfr.txt").getPath
    val dfSchema  = SchemaGenerator.getDFSchema(inputPath)
    assert(dfSchema,DFSchemaIpfr.dFSchemaIpfr)
  }

}


