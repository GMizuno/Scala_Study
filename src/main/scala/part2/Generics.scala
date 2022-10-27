package part2

import part2.AbstractDataTypes.Animal

object Generics extends App{

  class MyList[A] {
    // def add[B >: A](element: A): MyList[B] = ????
    /*
    A = Cat
    B = Animal
    */
  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  object MyList {
    // def empty[A]: MyList[A] = ????
  }

  // val emptyListOfInterger = MyList.empty[Int]

  // Variance Problem
  class Animal
  class Cat extends Animal
  class Dog extends Animal

  // 1 - List[Cat] extends List[Animal] = Covariance
  class CovariantList[+A]
  val animal: Animal = new Cat
  val animalList: CovariantList[Animal] = new CovariantList[Cat]
  // Question => animalList.add(new Dog) ??? => We return list of animal

  // 2 - Invariance
  class invariantList[A]
  val invariantAnimalList: invariantList[Animal] = new invariantList[Animal]

  // 3 = Contravaraince
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]


  // Bounded types
  class Cage[A <: Animal](animal: A)
  val cage = new Cage(new Dog)

  class Car
  // Error => val newCage = new Cage(new Car)
}
