package bound

/**
  * @author Administrator
  * @date 2017-12-25-下午3:22
  */
class GiftCard extends Card {
  type UserType = Customer

  def verify(u: Customer) = true

}
