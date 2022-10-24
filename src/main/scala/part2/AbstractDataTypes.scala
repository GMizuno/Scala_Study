package part2

object AbstractDataTypes extends App{

  abstract class Animal {
    val creatureType: String
    def eat(): Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Canine"
    override def eat(): Unit = println("eat eat")
  }

  trait Carnivore {
    def eat(animal: Animal): Unit
    val peferMeal: String = "fresh meat"
  }

  class Crocodile extends Animal with Carnivore {
    val creatureType: String = "Croc"
    def eat(): Unit = println("Waiting to eat")
    def eat(animal: Animal): Unit = println(s"eat eat eat eat ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  croc.eat()
  croc.eat(dog)

  // 1 - Traits do not have constructos parameters
  // 2 - Multiple traits may be inherited by the smae class
  // 3 - traits = behavior, abstract class = "thing"
}
