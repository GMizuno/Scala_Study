package part2

object OOBasics extends App{
  val person = new Person("Mizuno", 27)
  println(person)
  println(person.age)
  // println(person.name) => Error
  println(person.x)
  person.greet("Gabriel")
  person.greetThis("Gabriel")
  person.greet()
}

// Classes parameters are not fields (can not acess person.age) class Person(name: String, age: Int)
// Classes filed can be acess class Person(name: String, val age: Int)
class Person(name: String, val age: Int) { // Constructor => __init__ in Python
  val x = 2 // Field can be acess

  println(x + 1)

  def greet(name: String): Unit = println(s"Hi $name")
  def greetThis(name: String): Unit = println(s"Hi ${this.name}") // Parameter name is unnecessary
  def greet(): Unit = println(s"Hi $name") // Overloading

  // Multiple constructors => Not use
  def this(name: String) = this(name, 0)
  def this() = this("Perez", 30)
}

