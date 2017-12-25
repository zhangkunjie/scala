package bound

/**
  * @author Administrator
  * @date 2017-12-25-下午3:31
  */
class PerferCard extends Card {
  type UserType = PreferredCustomer

  def verify(u: PreferredCustomer): Boolean = true
}
