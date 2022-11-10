package part3

object MapFlatmapFilter extends App {

  val list = List(1, 2, 3)
  println(list)
  println(list.head)
  println(list.tail)

  println(list.map(_ + 1))
  println(list.map(_ + " is a number "))

  println(list.filter(_ % 2 == 0))

  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  list.foreach(println)

  val numbers = List(1, 2, 3, 4)
  val chars = List('a', 'b', 'c')
  val colors = List("blacks", "white")

  val combinations = numbers.flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(combinations)

  val combinations2 = for {
    n <- numbers
    c <- chars
    color <- colors
  }
  yield "" + c + n + "-" + color

  println(combinations2)

  val combinations3 = for {
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  }
  yield "" + c + n + "-" + color

  println(combinations3)


  val mult2 = list.map {
    x => x * 2
  }
  println(mult2)
}
