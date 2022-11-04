package part2

import part1.DefautArgs.factorial
import part1.DefautArgs.facimport

// import part1.DefautArgs.{factorial, facimport => alias_fact}

object PackageImport extends App {

  val fac: Int = factorial(10)
  println(fac)

  println(facimport)


}
