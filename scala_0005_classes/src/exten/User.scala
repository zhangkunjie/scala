package exten

/**
  * @author Administrator
  * @date 2017-12-24-下午2:12
  */
class User(val name: String) {
  def greet: String = s"Hello from $name"
  override def toString: String = s"User($name)"
}
