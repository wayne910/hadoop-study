package StreamingDemo

import org.apache.spark.{SparkConf, SparkContext}

object Hello extends App {


  val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Hello Scala")

  val sc = new SparkContext(sparkConf)

  val dataFile = sc.textFile("/home/master/Desktop/app/data/tbStock.txt")

  val words = dataFile.flatMap(_.split(" "))

  val word2Count = words.map((_, 1))

  val result = word2Count.reduceByKey(_ + _)

  result.saveAsTextFile("/home/master/Desktop/app/data/tbtest.txt")

  sc.stop()

}
