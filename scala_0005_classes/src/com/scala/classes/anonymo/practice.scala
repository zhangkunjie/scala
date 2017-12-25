package com.scala.classes.anonymo

/**
  * @author Administrator
  * @date 2017-12-24-下午3:36
  */
object practice {
  def main(args: Array[String]): Unit = {
    val notification = new Listening
    notification.register(
      new Listener {
        override def trigger: Unit = {
          println(s"Trigger at ${new java.util.Date()}")
        }
      }
    )
    notification.sendNotification()
  }
}
