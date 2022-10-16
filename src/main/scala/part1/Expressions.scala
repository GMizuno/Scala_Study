package part1

object Expressions extends App {

  val x = 1 + 2
  println(x)
  println(x - 2)
  println(x * 2)
  println(x / 2)
  println(x * 2)
  // Other expressions &, |, <<, >>, >>>

  println(x == 1)
  // Other expressions !=, >, >=, <, <=

  println(!(x == 1))
  // Other expressions !, &&, ||

  var var1 = 2
  var1 += 10 // also works with -, *, /
  println(var1)

  // IF Expression
  val condition = true
  val conditionedvalue = if (condition) 5 else 3
  println(conditionedvalue)

  // While => NEVER WRITE THIS AGAIN, in Scala everything is a expression (Functional Programming)
  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }

  val NewValue = (var1 = 30000) // Unit == void => return ()
  println(NewValue)
  println(var1)

  i = 0
  val while_value = while (i < 10) {
    println(i)
    i += 1
  }
  println(while_value) // println is Unit
  println(println(1))

  val CodeBlock = {  // Code Block is Expression, the value os blcok is last expresision
    val y1 = 2  // Local variable (exist inside the block)
    var x = y1 + 200 // x was defined in the begining, does not affect

    if (x > 2) "hello" else "goodbye"
  }

  println(CodeBlock)
  // error z += 10
}
