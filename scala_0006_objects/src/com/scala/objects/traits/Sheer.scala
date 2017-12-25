package com.scala.objects.traits

/**
  * @author Administrator
  * @date 2017-12-24-下午9:46
  */
trait Sheer extends RGBColor {
  override def hex: String = s"${super.hex}33"
}
