package allen.scala.lesson6

import java.io.{IOException, FileNotFoundException, FileReader}

/**
 * Created by Administrator on 2015/10/30.
 */
class TryCatchClass {

}

object TryCatchClass extends App {
  try {
    val f = new FileReader("input.txt")
    // Use and close file
  } catch {
    case ex: FileNotFoundException => println("Handle missing file, error: " + ex.getMessage)
    case ex: IOException => println("Handle other I/O error: " + ex.getMessage)
  } finally {
    println("in finally")
  }

  val num =
    try {
      val i = 1/0
      1
    } catch {
      case ex : Exception => 2
    } finally {
      3
    }
  println(num)

}
