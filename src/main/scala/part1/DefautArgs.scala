package part1

import scala.annotation.tailrec

object DefautArgs extends App {

  @tailrec
  def factorial(n: Int, acc: Int = 1): Int = { // Very similar to Python, include order of parametres (acc: Int = 1, n: Int => Wrong)
    if (n <= 1) acc
    else factorial(n - 1, n * acc)
  }

  val fac10 = factorial(10)
  println(fac10)

  val fac10mod = factorial(10, 2)
  println(fac10mod)

  val fac10_2 = factorial(n = 10, acc = 1)
  println(fac10_2)

  val facimport = factorial(3)
}
