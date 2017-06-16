package com.zs.scala

/**
  * Created by madison on 6/16/17.
  */
object Classes_and_Objects_4 {

  def main(args: Array[String]): Unit = {

    //    4.1 Classes, fields, and methods

    class ChecksumAccumulator {
      //      var sum = 0
      private var sum = 0

      //      def add(b: Byte): Unit = {
      ////        b = 1     // This won't compile, because b is a val
      //        sum += b
      //      }
      //
      //      def checksum(): Int = {
      //        return ~(sum & 0xFF) + 1
      //      }

      def add(b: Byte) = sum += b

      def checksum() = ~(sum & 0xFF) + 1

      //      def add(b: Byte): Unit = { sum += b }
      //      def checksum(): Int = ~(sum & 0xFF) + 1
    }
    val acc = new ChecksumAccumulator
    val csa = new ChecksumAccumulator
    //    acc.sum = 3// Won't compile, because sum is private

    // Won't compile, because acc is a val
    //    acc = new ChecksumAccumulator


    println(new ChecksumAccumulator)

    //    4.2 Semicolon inference

    val s = "hello"
    println(s)

    //    if (x < 2)
    //      println("too small")
    //    else
    //      println("ok")

    //    4.3 Singleton objects


    import scala.collection.mutable

    object ChecksumAccumulator {

      private val cache = mutable.Map.empty[String, Int]

      def calculate(s: String): Int =
        if (cache.contains(s))
          cache(s)
        else {
          val acc = new ChecksumAccumulator
          for (c <- s)
            acc.add(c.toByte)
          val cs = acc.checksum()
          cache += (s -> cs)
          cs
        }
    }
    println(ChecksumAccumulator.calculate("Every value is an object."))

    //    4.4 A Scala application
//    import ChecksumAccumulator.calculate
//
//    object Summer {
//      def main(args: Array[String]) = {
//        for (arg <- args)
//          println(arg + ": " + calculate(arg))
//      }
//    }
//
////    4.5 The App trait
//    import ChecksumAccumulator.calculate
//
//    object FallWinterSpringSummer extends App {
//
//      for (season <- List("fall", "winter", "spring"))
//        println(season + ": " + calculate(season))
//    }

  }
}
