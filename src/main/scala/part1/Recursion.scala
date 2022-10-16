package part1

import scala.annotation.tailrec
import scala.jdk.Accumulator

object Recursion extends App {

  def Factorial(n: Int): Int = {
    if (n <= 0) 1
    else {

      println("Factorial n " + n + " need Factorial " + (n - 1))
      val result = Factorial(n - 1) * n

      println("Computed Factorial " + n)

      result
    }
  }

  def NewFactorial(n: Int): BigInt = {
    @tailrec // Not necessary, but is good to put
    def FactorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else FactorialHelper(x - 1, x * accumulator) // Tail Recursion = use recursive call as the LAST expression
    }

    FactorialHelper(n,1 )
  }
  println(Factorial(10))
  // println(Factorial(5000)) // Error => Stack Memory
  println(NewFactorial(2000)) // Replace For Loops for Tail Recursion to avoid error in memory

  @tailrec
  def ConcatenateString(x: String, n: Int, accumulator: String): String = {
    if (n <= 0) accumulator
    else ConcatenateString(x, n-1, x+accumulator)
  }

  ConcatenateString("Hello", 10, "")

  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t-1,n % t != 0 && isStillPrime)
    }

    isPrimeTailRec(n/2, true)
  }

  println(isPrime(2003))

  def Fib(n: Int): Int = {
    def FibTailRec(i: Int, last: Int, NextToLast: Int): Int = {
      if (i >= n) last
      else FibTailRec(i + 1, last + NextToLast, last)
    }

    if (n <= 2) 1
    else FibTailRec(2, 1, 1)
  }

  println(Fib(8))
  println(Fib(10))

}
