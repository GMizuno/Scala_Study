package part3

import scala.collection.View.Collect
import scala.util.Random

object Sequences extends App{

  // Seq
  val aSequence = Seq(1,2,3,4) // Is a List
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence.head) // println(aSequence(0))
  println(aSequence ++ Seq(5,6,7,1,2,3,4))
  println(aSequence.sorted)

  // Range
  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)

  val aRange2: Seq[Int] = 1 until 10
  aRange2.foreach(println)

  (1 to 10).foreach(x => println("Hello"))


  val aList = List(1,2,3)
  val prepended = 43::aList
  println(prepended)

  val append = 43 +: aList :+ 4000
  println(append)
  val apple5  = List.fill(5)("apple")
  println(apple5)

  // Arrays
  val numbers = Array(1,2,3,4)
  val threeElements = Array.ofDim[Int](3)
  println(threeElements)
  threeElements.foreach(println)

  // mutation
  numbers(2) = 0 // syntax sugar for numbers.update(2,0)
  println(numbers.mkString(" "))

  val numberSeq: Seq[Int] = numbers // Implicit conversion
  println(numberSeq)

  // vectors
  val vector: Vector[Int] = Vector(1,2,3)
  println(vector)

  // Vector vs Lists

  val maxRuns = 1000
  val maxCapacity = 1_000_000

  def getWriteTime(collect: Seq[Int]): Double = {
    val r = new Random()
    val times = for {
      it <- 1 to maxRuns
    } yield {
      val curentTime = System.nanoTime()

      collect.updated(r.nextInt(maxCapacity), r.nextInt())

      System.nanoTime() - curentTime
    }

    times.sum * 1.0 / maxRuns
  }

  val numberList = (1 to maxCapacity).toList
  val numberVector = (1 to maxCapacity).toVector

  // keeps references to tail
  // uptading an element in the middle takes long
  println(getWriteTime(numberList))

  // depth of tree is small
  // needs to replace an entire 32-element chunk
  println(getWriteTime(numberVector))

}
