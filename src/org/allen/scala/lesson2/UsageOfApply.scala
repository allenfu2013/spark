package org.allen.scala.lesson2

class UsageOfApply {

}

class ApplyTest {
  def apply() = "this apply is in Class"

  def test {
    println("test")
  }
}

object ApplyTest {
  var count = 0

  def apply() = new ApplyTest

  def static {
    println("I am a static method!!!")
  }

  def inc = {
    count = count + 1
  }
}

object UsageOfApply extends App {
  val apply = new ApplyTest
  apply.test
  ApplyTest.static

  val a = ApplyTest()
  a.test

  val app = new ApplyTest
  println(app())

  for (i <- 1 to 10) {
    ApplyTest.inc
  }
  println(ApplyTest.count)
}
