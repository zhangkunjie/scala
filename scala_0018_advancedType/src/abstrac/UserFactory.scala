package abstrac

/**
  * @author Administrator
  * @date 2017-12-25-下午2:23
  */
trait UserFactory extends Factory {
  type A = User
  override def create: User = new User("")
}
