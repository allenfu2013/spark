package org.allen.scala.lesson1

class HelloScala {

}

object HelloScala{

  def hello(name : String) : String = {
    "Hello " + name
  }

  def helloScala() {
    println("Hello scala")
  }

  def add = (x : Int, y : Int) => x + y

  def sum(x : Int)(y : Int) = x + y

  def variableParameter(s: String*){
    s.foreach(x => println(x))
  }

  def helloDefault(name : String = "Scala") : String = {
    "Hello " + name
  }

  def main (args: Array[String]){
    println("Hello Scala!!!")
    println(hello("Scala"))
    helloScala
    println(add(1, 2))
    println(sum(1)(2))
    variableParameter("I", "Love", "SPARK")
    println(helloDefault())

    val max = 1
    val result = if(max>0) 1 else 0
    println(result)

    var (n, r) = (10, 0)
    while(n > 0) {
      r = r + n
      n = n - 1
    }
    println(r)

    for (i <- 1 to 10){
      println(i)
    }

    for (i <- 1 until 10){
      println(i)
    }

    for (i <- 1 to 10 if i % 2 == 0){
      println(i)
    }

    val l = List(1,2)
    l.foreach(x => println(x))

    val newL = l.map((x:Int) => 2*x)
    newL.foreach(x=>println(x))
  }
}
