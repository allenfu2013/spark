package allen.scala.lesson7

/**
 * Created by Administrator on 2015/10/31.
 */
class ClosureClass {

}

object ClosureClass extends App {
  def method1 = {
    def method2 = {
      println("in method2")
    }

    for (i <- 1 to 3) {
      method2
    }

  }

  method1

  def makeIncreaser(more: Int) = (x: Int) => x + more
  val inc1 = makeIncreaser(1)
  val inc999 = makeIncreaser(999)
  println(inc1(10))
  println(inc999(10))
}
