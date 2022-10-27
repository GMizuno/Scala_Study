package part2

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit
  }

  // Anonymous Class
  val funnyAnimal = new Animal:
    override def eat: Unit = println("aaaaaaa")

  /* Equivalent
  class AnonymousClasses$$anon$1 extends Animal {
    override def eat: Unit = println("aaaaaaa")
  }
  val funnyAnimal = new AnonymousClasses$$anon$1()
  */

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi, my name is Jim, how can i be of services")
  }

  jim.sayHi
  println(jim.getClass)
}

