package part1

object CallFunctionByName extends App {
  def calledByValue(x: Long): Unit = {
    println("By value:" + x)
    Thread.sleep(2000L)
    println("By value:" + x)
  }

  def calledByName(x: => Long): Unit = {
    println("By name:" + x)
    Thread.sleep(2000L)
    println("By name:" + x)
  }

  calledByValue(System.nanoTime()) // Evaluate and pass as argument
  calledByName(System.nanoTime())  // Pass as function (so parameter is a Function) evaluate at moment is call. Useful in lazy stream

  def infinite(): Int = 1 + infinite()
  def printFrist(x: Int, y: => Int) = println(x)

  // Crash => printFrist(infinite(), 34)
  printFrist(34, infinite()) // Works, because y is call by name

}
