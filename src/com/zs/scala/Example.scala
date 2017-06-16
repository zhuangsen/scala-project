package com.zs.scala

import java.math.BigInteger

/**
  * Created by madison on 6/16/17.
  */
object Example {

  def main(args: Array[String]): Unit = {

    //  1.1 A language that grows on you
    var capital = Map("US" -> "Washington", "France" -> "Paris")

    capital += ("Japan" -> "Tokyo")

    println(capital("France"))

    //    def factorial(x: BigInt): BigInt =
    //      if (x == 0) 1 else x * factorial(x - 1)


    def factorial(x: BigInteger): BigInteger =
      if (x == BigInteger.ZERO)
        BigInteger.ONE
      else
        x.multiply(factorial(x.subtract(BigInteger.ONE)))

    //        def receive = {
    //          case Msg1 =>"" // handle Msg1
    //          case Msg2 =>"" // handle Msg2
    //        }


    //    1.2 What makes Scala scalable?


    //    val xs = 1 to 3
    //    val it = xs.iterator
    //    eventually {
    //      it.next() shouldBe 3
    //    }


    //    Step 1. Use lists

    val oneTwo = List(1, 2)
    val threeFour = List(3, 4)
    val oneTwoThreeFour = oneTwo ::: threeFour
    println(oneTwo + " and " + threeFour + " were not mutated.")
    println("Thus, " + oneTwoThreeFour + " is a new list.")

    //    val twoThree = List(2, 3)
    //    val oneTwoThree = 1 :: twoThree
    //    println(oneTwoThree)

    val oneTwoThree = 1 :: 2 :: 3 :: Nil
    println(oneTwoThree)


    //    Step 2. Use tuples

    val pair = (99, "Luftballons")
    println(pair._1)
    println(pair._2)

    //    Step 3. Use sets and maps
    var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))
    println(jetSet)

    import scala.collection.mutable

    val movieSet = mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)


    import scala.collection.immutable.HashSet

    val hashSet = HashSet("Tomatoes", "Chilies")
    println(hashSet + "Coriander")


    import scala.collection.mutable

    val treasureMap = mutable.Map[Int, String]()
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))
    println(treasureMap)

    val romanNumeral = Map(
      1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
    )
    println(romanNumeral(4))
    println(romanNumeral)


    //    Step 4. Learn to recognize the functional style

    //    def printArgs(args: Array[String]): Unit = {
    //      var i = 0
    //      while (i < args.length) {
    //        println(args(i))
    //        i += 1
    //      }
    //    }

    //    def printArgs(args: Array[String]): Unit = {
    //      for (arg <- args)
    //        println(arg)
    //    }

    def printArgs(args: Array[String]): Unit = {
      args.foreach(println)
    }

    def formatArgs(args: Array[String]) = args.mkString("\n")

    //    println(formatArgs(args))
    val res = formatArgs(Array("zero", "one", "two"))
    assert(res == "zero\none\ntwo")
    println(res)


    printArgs(Array("zero", "one", "two"))

    //    Step 5. Read lines from a file
    import scala.io.Source

    if (args.length > 0) {

      for (line <- Source.fromFile(args(0)).getLines())
        println(line.length + " " + line)
    }
    else
      Console.err.println("Please enter filename")

    val lines = Source.fromFile(args(0)).getLines().toList

    def widthOfLength(s: String) = s.length.toString.length

    var maxWidth = 0
    for (line <- lines)
      maxWidth = maxWidth.max(widthOfLength(line))

    println("maxWidth:" + maxWidth)

    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b
    )
    println("longestLine:" + longestLine)


    val maxWidth2 = widthOfLength(longestLine)
    for (line <- lines) {
      val numSpaces = maxWidth2 - widthOfLength(line)
      val padding = " " * numSpaces
      println(padding + line.length + " | " + line)
    }



    if (args.length > 0) {

      val lines = Source.fromFile(args(0)).getLines().toList

      val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b
      )
      val maxWidth = widthOfLength(longestLine)

      for (line <- lines) {
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        println(padding + line.length + " | " + line)
      }
    }
    else
      Console.err.println("Please enter filename")
  }

}
