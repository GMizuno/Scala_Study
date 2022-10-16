@main
def main(): Unit = {
  println("Hello world!, Scala")
  soma_1(x)
  soma_1(y)
  soma_1(pi)
}

val x = 1
val y = 10101010
val pi = 3
def soma_1(x: Int): Unit = println(x + 1)