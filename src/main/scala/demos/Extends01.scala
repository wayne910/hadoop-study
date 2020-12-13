package demos

object Extends01 {

  def main(args:Array[String]): Unit ={
    val student = new Student
    student.name="Json"
    student.studying()
    student.showInfo()
  }
}

class Persons{
  var name:String = _
  var age:Int = _
  def showInfo():Unit={
    println("Student Info :")
    println("name : "+this.name)
  }
}

class Student extends Persons{
  def studying(): Unit ={
    println(this.name+"Study Scala .....")
  }
}