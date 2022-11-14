package part3

object Options extends App{ // Avoid Null pointer

  val myFirstOption: Option[Int] = Some(4)
  val myFirstOption2: Option[Int] = None

  println(myFirstOption)
  println(myFirstOption2)

  // usafeull unsafe Api
  def unsafeMethod(): String = null
  val result = Option(unsafeMethod())
  println(result)


  // chained methods
  def backupMethod(): String = "A valid result"
  val chainedResult = Option(unsafeMethod()).orElse(Option(backupMethod()))
  println(chainedResult)

  // design UNSAFE API
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")
  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()
  println(betterChainedResult)
}
