package demos

object Demos {

  def main(args:Array[String]): Unit ={
    val dog = new Dog
    println(dog.sum(1,4))
  }

}

class Dog{
  def sum(n1:Int,n2:Int): Int={
    n1+n2
  }
}