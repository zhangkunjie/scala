package com.scala.objects.traits

/**
  * @author Administrator
  * @date 2017-12-24-下午9:31
  */
trait B extends Base{
  override def toString: String = {
    "->" + super.toString

  }

}
