package allen.scala.lesson5

import scala.io.Source

/**
 * Created by Administrator on 2015/10/29.
 */
class ScalaIO {

}

object ScalaIO extends App{
  for(line <- Source.fromFile("E:\\Work\\github\\spark\\README.md").getLines()){
    println(line.length + " " + line)
  }
}
