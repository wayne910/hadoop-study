package StreamingDemo

import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}

object HelloSQL {

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Hello Scala")
    val sc = new SparkContext(sparkConf)
    val spark = SparkSession.builder().appName("Spark SQL").config("Spark.option", "some-value").getOrCreate()

    import spark.implicits._
    val df = spark.read.json("/opt/spark/examples/src/main/resources/people.json")
    df.show()

    df.filter($"age" > 21).show()

    df.createOrReplaceTempView("persons")

    spark.sql("SELECT * FROM persons where age > 21").show()

    spark.stop()
  }
}
