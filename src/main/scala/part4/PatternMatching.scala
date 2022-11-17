package part4

import scala.util.Random

object PatternMatching extends App {

  val random = new Random()

  val x = random.nextInt(10)

  val description = x match {
    case 1 => "the ONE"
    case 2 => "double or nothing"
    case 3 => "third time is the charm"
    case _ => "something else" // __ = WILDCARD
  }

  println(x)
  println(description)

  // 1. Decompose values
  case class Person(name: String, age: Int)

  val bob = Person("Bob", 30)
  val greeting = bob match {
    case Person(n,a) if a < 21 => s"Hi, my names is $n and I am $a years old and I can not drink in the US"
    case Person(n,a) => s"Hi, my names is $n and I am $a years old"
    case _ => "I do not know who I am"
  }

  println(greeting)

  class Animal
  case class Dog(breed: String) extends Animal
  case class Parrot(greeting: String) extends Animal

  val animal: Animal = Dog("Terra Nova")
  animal match {
    case Dog(someBreed) => println(s"Mathced a dog of the $someBreed breed")
  }
}
