package part2

import scala.Console.println

object Inheritance extends App{

  class Animal {
    val animalType = "Domestic"
    def eat(): Unit = println("Eat") // public
    private def sleep(): Unit = println("Sleep")
    def sleep2(): Unit = sleep()
    protected def run(): Unit = println("Run")
    final def test(): Unit = println("Teste") // Prevent to extend
  }

  class Cat extends Animal {
    def crunch(): Unit = {
      run()
      println("Crunch")
    }
  }

  val cat = new Cat
  cat.eat()
  // Error => cat.sleep
  cat.sleep2()
  // Error => cat.run()
  cat.crunch()

  class Person(name: String, age: Int) {
    def this(name: String) = this(name, 0)
  }
  // Error => class Adult(name: String, age: Int, idCard: String) extends Person
  class Adult(name: String, age: Int, idCard: String) extends Person(name, age) // Since we use this in Person, we could use Person(name)

  class Dog(override val animalType: String) extends Animal {
    override def eat(): Unit = {
      super.eat() // Call eat from father
      println("eat eat ")
    }
    override def run(): Unit = println("run run")
  }

  val dog = new Dog("K9")
  dog.eat()
  dog.run()
  dog.sleep2()
  println(dog.animalType)

  // Type substituion
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat()

}
