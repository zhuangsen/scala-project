package com.zs.scala

/**
  * Created by madison on 6/16/17.
  */
object Functional_Objects_6 {

  //  6.1 A specification for class Rational
  val oneHalf = new Rational(1, 2) //oneHalf: Rational = 1/2

  val twoThirds = new Rational(2, 3) //twoThirds: Rational = 2/3

  (oneHalf / 7) + (1 - twoThirds) //res0: Rational = 17/42


  class Rational(n: Int, d: Int) {
    println("Created " + n + "/" + d)
    require(d != 0)

    private val g = gcd(n.abs, d.abs)

    val numer: Int = n
    val denom: Int = d

    override def toString = n + "/" + d

    //    def add(that: Rational): Rational =
    //      new Rational(n * that.d + that.n * d, d * that.d)

    def add(that: Rational): Rational =
      new Rational(
        numer * that.denom + that.numer * denom,
        denom * that.denom
      )

    def lessThan(that: Rational) =
      this.numer * that.denom < that.numer * this.denom

    def max(that: Rational) =
      if (this.lessThan(that)) that else this

    private def gcd(a: Int, b: Int): Int =
      if (b == 0) a else gcd(b, a % b)
  }

}



