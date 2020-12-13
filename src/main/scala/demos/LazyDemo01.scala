package demos

object LazyDemo01 {

  def sum(n1:Int,n2:Int): Int ={
   println("Sum() is Working")
    return n1+n2
  }

  def main(args:Array[String]): Unit ={
    lazy val res = sum(10,34)
    println("-------------------")
    println("Res="+res)
  }
}
