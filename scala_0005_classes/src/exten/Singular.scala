package exten

/**
  * @author Administrator
  * @date 2017-12-24-下午3:07
  */
class Singular[A](element: A) extends Traversable[A] {
  def foreach[B](f: A => B) = f(element)
}
