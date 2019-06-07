package com.telefonica.netpulse.utils


import com.holdenkarau.spark.testing.DataFrameSuiteBase
import org.scalatest.FunSuite;

class SchemaGeneratorSuite extends FunSuite with DataFrameSuiteBase {

  override implicit def reuseContextIfPossible: Boolean = true

  test("verfy DF Schema Function") {
    assert(1,1)

  }
}