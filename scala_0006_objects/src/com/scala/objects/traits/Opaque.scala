package com.scala.objects.traits

/**
  * @author Administrator
  * @date 2017-12-24-下午9:43
  */
trait Opaque extends  RGBColor{
  override def hex: String = s"${super.hex}FF"
}
