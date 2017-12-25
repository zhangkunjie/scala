package com.scala.objects.traits

/**
  * @author Administrator
  * @date 2017-12-24-下午9:30
  */
trait A extends Base {
  override def toString: String = {
    "A->" + super.toString
  }
}
