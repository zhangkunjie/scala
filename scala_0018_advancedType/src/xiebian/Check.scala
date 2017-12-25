package xiebian

/**
  * @author Administrator
  * @date 2017-12-25-下午3:59
  */
//减号：定义逆变类型
class Check[-A] {
  //协变类型不能作为方法的输入参数，但是逆变类型可以
  def check(a: A)= {}
}
