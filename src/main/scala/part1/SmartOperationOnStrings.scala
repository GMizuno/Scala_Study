package part1

object SmartOperationOnStrings extends App  {
  val str: String = "Hello, I am learning Scala"

  println(str.charAt(2))
  println(str.charAt(3))
  println(str.substring(7, 11))
  println(str.split(" "))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace("Hello", "Ola"))
  println(str.toUpperCase())
  println(str.toLowerCase)
  println(str.length)

  val numberstring = "45"
  val num = numberstring.toInt
  println('a' +: numberstring :+ 'b')
  println('a' + numberstring + 'b')


  println(str.reverse)
  println(str.take(2))

  // String interpolators

  // s-interpolation
  val name = "Mizuno"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old" // f-strings in python
  val anotherGretting = s"Hello, my name is $name and I am ${age + 1} years old"
  val greeting2 = s"${greeting}, Jumping line\n${anotherGretting}"

  println(greeting)
  println(anotherGretting)
  println(greeting2)

  // f-interpolation
  val speed = 1.2f
  val myth = f"$name%s can eat $speed%2.2f" // format in python
  val myth2 = f"$name%s can eat $speed%2.10f"
  val myth3 = f"$name%s can eat $speed%10.10f"
  val myth4 = f"$name%s can eat $speed%10.2f"
  println(myth)
  println(myth2)
  println(myth4)

  // raw-interpolation
  println(raw"This is a \n new line")
  val escape = "This is a \n new line"
  println(raw"$escape")
}
