package demos

object ConDemo01 {

  def main(args:Array[String]): Unit ={
    val p1 = new Person("Tom")
    println(p1)
  }
}

class Person(inName:String,inAge:Int){
  var name:String = inName
  var age:Int = inAge
  age += 10
  println("~~~~~~~~~~~~~~~~~~~~~~~~~`")

  override def toString:String={
    "name="+this.name+"\t age"+this.age
  }
  println("Ok~~~~~~~~~~`")
  println("age="+age)

  def this(name:String){
    this("jack",10)
    this.name=name
  }
}

class A(){}