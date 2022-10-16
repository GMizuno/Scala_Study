package part1

object ValuesVariablesType extends App {
  val x: Int = 42 // Val are immutable (Type is optional)
  println(x)

  val s1: String = "Studing Scala"
  val s2: String = "Studying is fun"

  val b1: Boolean = false
  val b2: Boolean = true

  val c: Char = 'a'

  val y: Int = x
  val short: Short = 4144
  val long: Long = 123144123131412
  val f: Float = 2.0f
  val d: Double = 2.111111

  // Type follows concepts from Java

  var x1: Int = 4 // Var ar mutable, prefer vals over vars
  println(x1)
  x1 = 1000 // compiler infert types (val or var)
  println(x1)
}



