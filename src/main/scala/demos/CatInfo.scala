package demos

object CatInfo {

  def main(args:Array[String]): Unit ={
    val cat = new Cat
    cat.name = "little Bai"
    cat.age = 8
    cat.color = "Black"
    printf("\n Cat info:%s %d %s",cat.name,cat.age,cat.color)
  }
}

class Cat{
  var name:String = ""
  var age:Int=_
  var color:String=_
}