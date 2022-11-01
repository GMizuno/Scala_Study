package part2

object CaseClasses extends App { //CaseClases = CC

  case class Person(name: String, age: Int)
  class Person2(name: String, age: Int)

  // 1 - Class parameters are fields
  val jim = new Person("Jim", 34)
  val jim2 = new Person2("Jim", 34)
  println(jim.name)

  // 2 - sensible toString
  println(jim.toString)
  println(jim)

  println(jim2.toString)
  println(jim2)

  // 3 - equals and hashCode implemente OOTB (Out of the box)
  val jim3 = new Person("Jim", 34)
  println(jim == jim3)
  println(jim == jim2)

  // 4 - CC have handy copy method
  val jim4 = jim.copy(age = 45)
  println(jim4)

  // 5 - CC have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)
  println(mary)

  // 6 - CC are serializable -> usefull in some frameworks Akka

  // 7 - CC Have extractor pattners = CC can be used in Pattern Matching

  case object Uk {
    def name: String = "The UK of GB adn NI"
  }

}
