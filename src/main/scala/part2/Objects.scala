package part2

object Objects{
  object Person {
    val N_EYES = 2

    def canFly: Boolean = false

    // factory method
    def apply(mother: Person, father: Person): Person = new Person("Bobssss")
  }

  // Companion class
  class Person(val name: String) {
    // instance-level functionality
  }
  def main(array: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.N_EYES + 100)
    println(Person.canFly)

    // Scala objects = Singleton Instance

    val mary = Person
    val john = Person

    println(mary == john)

    val mary2 = new Person("Mary")
    val john2 = new Person("John")

    println(mary2 == john2)
    // Error println(mary2.canFly)

    val bob = Person(mary2, john2)
    println(bob)
    println(bob.name)
  }
  
}
