package part3

object TupleMap extends App{

  // tuple = finite orderes lists
  val aTuple2 = new Tuple2(2, "Hello Scala")
  println(aTuple2)

  val aTuple = (2, "Hello Scala")
  println(aTuple)

  println(aTuple._1)
  println(aTuple._2)
  println(aTuple.copy(_2 = "asdas"))
  println(aTuple.copy(_1 = "asdas"))
  println(aTuple.swap)

  // Maps - Associate keys with values (key -> value)

  val aMap: Map[String, Int] = Map()

  val phonebook = Map(("Jim", 555), "Dani" -> 789) //  -> is sugar
  println(phonebook)

  println(phonebook.contains("Jim"))
  println(phonebook.contains("Jims"))
  println(phonebook("Jim"))
  // erro => println(phonebook("Jims")). Use withDefaultValues do not thorw exectption

  val newPairing = "Mary" -> 678
  val newPhoneook = phonebook + newPairing
  println(newPhoneook)

  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2))

  println(phonebook.view.filterKeys(x => x.startsWith("J")).toMap)
  println(phonebook.view.mapValues(number => number * 10).toMap)

  val names = List("Bob", "Angela", "Mary")
  println(names.groupBy(name => name.charAt(0)))
}
