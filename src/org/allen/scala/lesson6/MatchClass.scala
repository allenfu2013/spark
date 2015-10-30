package allen.scala.lesson6

/**
 * Created by Administrator on 2015/10/30.
 */
class MatchClass {

}

object MatchClass extends App {
  val category = 1
  val desc =
    category match {
      case 1 => "SMS"
      case 2 => "IMSG"
      case _ => "UNKNOWN"
    }
  println(desc)
}