package org.allen.scala.lesson3

class Implicit {

}

class A{

}

class RichA(a : A) {
  def rich {
    println("So rich ...")
  }
}

object Implicit extends App{

  implicit def a2RichA(a:A) = new RichA(a)

  val b = new A
  b.rich

  def testParam(implicit name :String){
    println(name)
  }

  implicit val name = "Implicited!!!"
  testParam
  testParam("Spark!!!")

  implicit class Calculator(x : Int){
    def add(a : Int) : Int = x + a;
  }

  println(2.add(3))
}
