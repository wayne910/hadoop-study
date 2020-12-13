package scstd

class Animal {

  var animalName:String = "Nothing"

  def setAnimalName(name:String): Unit ={
    animalName = name
  }

  def getAnimalName:String={
    animalName
  }

  def isAnimalNameSet:Boolean={
    if(getAnimalName=="Nothing") false else true
  }
}

object Animal{
  def main(args:Array[String]): Unit ={
    val obj:Animal = new Animal
    var flag:Boolean = false
    obj.setAnimalName("Dog")
    println(flag)
    flag = obj.isAnimalNameSet
    println(flag)
  }
}