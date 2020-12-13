package demos

import scala.collection.mutable.ArrayBuffer

object ArrBuffDemo01 {

  def main(args:Array[String]): Unit ={
    val arr01 = ArrayBuffer[Any](3,2,5)
    println("Arr01(1))"+arr01)
    for (i<- arr01){
      println(i)
    }
    println(arr01.length)
    println("arr01.hash="+arr01.hashCode())
  }
}
