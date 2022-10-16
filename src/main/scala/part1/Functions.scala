package part1

object Functions extends App {

  def Function1(a: String, b: Int): String = { // COMPILER CAN INFER THE TYPE RETURNED
    a + "" + b
  }

  println(Function1("asasas", 3))
  println(Function1)

  // CAN NOT REMOVE RETURN TYPE, BECAUSE OF RECURSION
  def RepeatFunction(string: String, n: Int): String = { // USE RECURSION TO REPLACE FOR LOOPS
    if (n == 1) string
    else string + RepeatFunction(string, n - 1)
  }

  println(RepeatFunction("asasas", 3))

  def FunctionWithSideEffects(string: String): Unit = println(string)

  def BigFunction(n: Int): Int = {
    def SmallerFunction(a: Int, b: Int): Int = a + b

    SmallerFunction(n, n - 1)
  }

  println(BigFunction(10))

  def Factorial(n: Int): Int = {
    if (n <= 0) 1
    else Factorial(n - 1) * n
  }

  println(Factorial(1))
  println(Factorial(9))
  println(Factorial(10))

  def Fib(n: Int): Int = {
    if (n <= 2) 1
    else Fib(n - 1) + Fib(n - 2)
  }

  println(Fib(8))
  println(Fib(30))
}
