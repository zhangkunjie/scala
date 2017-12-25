package com.scala.classes.anonymo

/**
  * @author Administrator
  * @date 2017-12-24-下午3:33
  */
class Listening {
  var listener: Listener = null

  def register(l: Listener) {
    listener = l
  }

  def sendNotification() {
    listener.trigger
  }

}
