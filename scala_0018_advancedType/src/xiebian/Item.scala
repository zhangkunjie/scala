package xiebian

/**
  * @author Administrator
  * @date 2017-12-25-下午3:59
  */
case class Item[A](a: A) {
  def get: A = a
}
