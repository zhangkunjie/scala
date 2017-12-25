package com.scala.objects.traits

/**
  * @author Administrator
  * @date 2017-12-24-下午9:32
  */
class D extends A with B with C {
  override def toString: String = {
    "D->" + super.toString
  }

}
