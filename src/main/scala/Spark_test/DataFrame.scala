package Spark_test

import org.apache.spark.sql.SparkSession // Modify SBT

object DataFrame extends App {

  val spark = SparkSession.builder()
    .appName("TestSpark")
    .config("spark.master", "local")
    .getOrCreate()

}
