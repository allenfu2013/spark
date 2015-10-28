package org.allen.scala.lesson2

class AbstractClass {

}

abstract class Person1 {
  def speak

  val name : String
  var age : Int
}

class Worker extends Person1 {
  def speak {
    println("Hello everyone!!!")
  }

  val name = "allen"
  var age = 29
}

object AbstractClass extends App{
  val w = new Worker
  w.speak
  println(w.name + ":" + w.age)
}