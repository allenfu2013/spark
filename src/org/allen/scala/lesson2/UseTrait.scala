package org.allen.scala.lesson2

class UseTrait {

}

trait Logger {
  def log(msg: String) {
    println("log: " + msg)
  }
}

class ConcreteLogger extends Logger {
  def concreteLog {
    log("It's me!")
  }
}

trait traitLogger {
  def log(msg: String)
}

trait ConsoleLogger extends traitLogger {
  override def log(msg: String) {
    println(msg)
  }
}

class Test extends ConsoleLogger {
  def test() {
    log("Here is Spark!")
  }
}

trait FLogger {
  def log(msg: String) {
    println("Log content is: " + msg)
  }
}

trait MessageLogger extends FLogger {
  override def log(msg: String) {
    println("Log message is: " + msg)
  }
}

abstract class Account {
  def save
}

class MyAccount extends Account with FLogger {
  def save {
    log("1000")
  }
}

object UseTrait extends App {
  val logger = new ConcreteLogger
  logger.concreteLog

  val log = new Test
  log.test

  val acc = new MyAccount
  acc.save

  val acc1 = new MyAccount with MessageLogger
  acc1.save
}
