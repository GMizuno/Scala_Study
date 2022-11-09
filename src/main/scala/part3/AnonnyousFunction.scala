package part3

object AnonnyousFunction extends App {

  // Anonynous function (LAMBDA)
  val doubler = (x: Int) => x * 2
  val doubler2: Int => Int = x => x * 2

  println(doubler(2))
  println(doubler2(4))

  // Multiple parameters
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b

  // no parameter
  val justDoSomething: () => Int = () => 3

  println(justDoSomething())
  println(justDoSomething)

  val stringToIny = { (str: String) => str.toString }

  // Syntatic sugar

  val niceIncrementer: Int => Int = _ + 1 // x => x + 1
  val niceAdder: (Int, Int) => Int = _ + _

  println(niceIncrementer(3))
  println(niceAdder(3, 4))

}
