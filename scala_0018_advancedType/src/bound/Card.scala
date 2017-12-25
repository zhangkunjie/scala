package bound

/**
  * @author Administrator
  * @date 2017-12-25-下午3:16
  */
//抽象类
abstract class Card {
  //上界
  type UserType <: BaseUser

  def verify(u: UserType): Boolean
}
