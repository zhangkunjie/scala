package typechange

/**
  * @author Administrator
  * @date 2017-12-25-下午3:59
  */
case class Item1[+A](a: A) {
  def get: A = a
  //协变类型不能作为方法的输入参数，但是逆变类型可以
  //def get(a:A): A = a
}
