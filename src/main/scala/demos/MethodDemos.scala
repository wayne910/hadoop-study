package demos

object MethodDemos {

  def main(args:Array[String]): Unit ={
    val dog = new Dogs
    println(dog.cal(13,223))
  }
}
class Dogs{
  private var sal:Double=_
  var food:String=_

  def cal(n1:Int,n2:Int):Int={
    return n1+n2
  }
}