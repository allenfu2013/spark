package org.allen.scala.lesson2

class OOPInScala {

}

class Person {
  //"_" stands for placeholder
  var name: String = _
  var age = 29
  //private filed
  private[this] val gender = "male";

  def this(name : String, age : Int) {
    this()
    this.name = name
    this.age = age
  }

  def getGender(): String = {
    gender
  }

  val university = "BJU"
}

/**
 * Constructor
 * @param name
 * @param age
 * @param gender   private
 */
class Student(val name: String, val age: Int, gender: String) {
  println("this is the primary constructor!")
  var height: Double = _

  def this(name: String, age: Int, gender: String, height: Double) {
    this(name, age, gender)
    this.height = height
  }
}

class Teacher(name : String, age : Int, var major : String) extends Person(name, age){
  println("this is the subclass of Person, major is: " + major)

  override def toString: String = "Override toString method ..."

  override val university: String = "USTC"
}

object OOPInScala {
  def main(args: Array[String]) {
    val p = new Person
    p.name = "allen"
    println(p.name + ":" + p.age + ":" + p.getGender())

    val s = new Student("allen", 29, "male")
    println(s.name + ":" + s.age)

    val ss = new Student("allen", 29, "male", 1.75)
    println(ss.name + ":" + ss.age + ":" + ss.height)

    val t = new Teacher("rain", 35, "computer")
    println(t.toString)
    println(t.university)
  }
}
