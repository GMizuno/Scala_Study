package part2

import scala.language.postfixOps

object SyntaticSugar extends App{

  class Person(val name: String, favmovie: String) { // inside object avoid conflict

    def likes(movie: String): Boolean = movie == favmovie
    def hangOutWith(person: Person): String = s"${this.name} is hanging out wiht ${person.name}"
    def +(person: Person): String = s"${this.name} is hanging out wiht ${person.name}"
    def unary_! : String = s"${this.name}!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favmovie"
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // Infix notation = operator notation (syntatics sugars)

  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)
  println(mary + tom) // All operators ar methods
  println(mary.+(tom))

  val x = -1 // prefix notation
  val y = 1.unary_- // equivalent x = -1 = > only work wiht ~ + - !
  println(!mary)

  println(mary.isAlive)
  println(mary isAlive) // postfix notation

  println(mary.apply())
  println(mary()) // apply method, when method calls like a function the compiler looks to method call apply
}
