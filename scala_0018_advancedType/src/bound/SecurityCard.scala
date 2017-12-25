package bound

/**
  * @author Administrator
  * @date 2017-12-25-下午3:20
  */
class SecurityCard extends Card {
  type UserType = Admin

  def verify(u: Admin) = true

}
