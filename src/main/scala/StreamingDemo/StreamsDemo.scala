package StreamingDemo

import org.apache.spark.SparkConf
import org.apache.spark.streaming.{Seconds, StreamingContext}

object StreamsDemo {
  def main(args: Array[String]): Unit = {
    if (args.length < 2) {
      System.err.println("Usage: NetworkWordCount <hostname> <port>")
      System.exit(1)
    }
  }


  val conf = new SparkConf().setMaster("local[2]").setAppName("NetworkdCount")

  val ssc = new StreamingContext(conf, Seconds(1))

  val lines = ssc.socketTextStream("localhost", 9999)
  val words = lines.flatMap(_.split(" "))

  val pairs = words.map(word => (word, 1))
  val wordCounts = pairs.reduceByKey(_ + _)
  wordCounts.print()
  ssc.start()
  ssc.awaitTermination()
}
