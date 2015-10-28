package org.allen.scala.lesson3

/**
 * Collection Operation
 */
class CollectionOperations {

}

object CollectionOperations extends App {
  //List
  val l = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
  l.foreach(x => print(x))
  println()
  println(l.filter(x => x % 2 == 0))
  println(l.filter(_ % 2 == 0))
  println(l.partition(_ % 2 == 0))

  val a = List(1, 2, 3)
  val b = List(4, 5, 6, 7)
  println(a zip b)
  println(a.zip(b))

  val c = List(List("a", "b"), List("c", "d"))
  println(c)
  println(c.flatten)

  val d = List(List(1, 2), List(3, 4))
  println(d.flatMap(x => x.map(_ * 2)))

  println("##################################")

  //Set
  val s = Set(1, 2, 3, 4, 5, 6, 7, 8, 9)
  s.foreach(x => print(x))
  println()

  println("##################################")

  //Map
  val m = Map("allen" -> 29, "hope" -> 30)
  println("allen: " + m.get("allen").get + ", hope: " + m.get("hope").get)
  println("rain: " + m.get("rain").getOrElse("unknown"))

  println("##################################")

  //Tuple
  val tuple = ("aaaa", "bbbb", "cccc")
  println(tuple._1 + ", " + tuple._2 + ", " + tuple._3)

  val tuple1 = "a" -> "b"
  println(tuple1._1 + ", " + tuple1._2)


}
