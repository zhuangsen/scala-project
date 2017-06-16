package com.zs.scala

/**
  * Created by madison on 6/16/17.
  */
object Basic_Types_and_Operations_5 {

  def main(args: Array[String]): Unit = {

    //    5.2 Literals
    val hex = 0x5
    println(hex)

    val hex2 = 0x00FF
    println(hex2)

    val magic = 0xcafebabe
    println(magic)

    val dec1 = 3
    println(dec1)

    val dec2 = 255
    println(dec2)

    val dec3 = 20
    println(dec3)

    val prog = 0XCAFEBABEL
    println(prog)

    val tower = 35L //tower: Long = 35
    println(tower)

    val of = 31l //tower: Long = 35
    println(of)

    val little: Short = 367 //little: Short = 367
    println(little)

    val littler: Byte = 38 //littler: Byte = 38
    println(littler)

    val big = 1.2345 //big: Double = 1.2345
    println(big)

    val bigger = 1.2345e1 //bigger: Double = 12.345
    println(bigger)

    val biggerStill = 123E45 //biggerStill: Double = 1.23E47
    println(biggerStill)

    val little1 = 1.2345F //little: Float = 1.2345
    println(little1)

    val littleBigger = 3e5f //littleBigger: Float = 300000.0
    println(littleBigger)

    val anotherDouble = 3e5 //anotherDouble: Double = 300000.0
    println(anotherDouble)

    val yetAnother = 3e5D //yetAnother: Double = 300000.0
    println(yetAnother)

    val a = 'A' //a: Char = A
    println(a)

    val d = '\u0041' //d: Char = A
    println(d)

    val f = '\u0044' //f: Char = D
    println(f)

    val B\u0041\u0044 = 1 //BAD: Int = 1
    println(B\u0041\u0044)

    val backslash = '\\' //backslash: Char = \
    println(backslash)

    val hello = "hello" //hello: String = hello
    print(hello)

    val escapes = "\\\"\'" //escapes: String = \"'
    println(escapes)

    println(
      """Welcome to Ultamix 3000.
             Type "HELP" for help.""")

    println(
      """|Welcome to Ultamix 3000.
         |Type "HELP" for help.""".stripMargin)

    def updateRecordByName(r: Symbol, value: Any) = {
      println("Symbol:" + r + ";value:" + value)
      // code goes here
    }

    //    updateRecordByName(favoriteAlbum, "OK Computer")
    updateRecordByName('favoriteAlbum, "OK Computer")

    val s = 'aSymbol //s: Symbol = 'aSymbol
    println(s)

    val nm = s.name //nm: String = aSymbol
    println(nm)

    val bool = true //bool: Boolean = true
    println(bool)

    val fool = false //fool: Boolean = false

    //    5.3 String interpolation
    val name = "reader"
    println(s"Hello, $name!")

    val str = s"The answer is ${6 * 7}." //res0: String = The answer is 42.
    println(str)

    println(raw"No\\\\escape!") // prints: No\z\z\z{\z}

    val strf = f"${math.Pi}%.5f" //res1: String = 3.14159
    println(strf)

    val pi = "Pi" //pi: String = Pi
    println(pi)

    val strf1 = f"pi is approximately ${math.Pi}%.8f." //res2: String = Pi is approximately 3.14159265.
    println(strf1)

    //    5.4 Operators are methods
    val sum = 1 + 2 // Scala invokes 1.+(2) sum: Int = 3
    println(sum)

    val sumMore = 1.+(2) //sumMore: Int = 3
    println(sumMore)

    val longSum = 1 + 2L // Scala invokes 1.+(2L) //longSum: Long = 3
    println(longSum)

    val sh = "Hello, world!" //s: String = Hello, world!
    println(sh)

    val si = sh indexOf 'o' // Scala invokes s.indexOf('o') //res0: Int = 4
    println(si)

    val sii = sh indexOf('o', 5) // Scala invokes s.indexOf('o', 5) //res1: Int = 8
    println(sii)

    println(-2.0) // Scala invokes (2.0).unary_-  //res2: Double = -2.0
    println((2.0).unary_-) //res3: Double = -2.0


    val ss = "Hello, world!" //s: String = Hello, world!

    println(ss.toLowerCase) //res4: String = hello, world!

    println(ss toLowerCase) //res5: String = hello, world!


    //    5.5 Arithmetic operations
    println(1.2 + 2.3) //res6: Double = 3.5

    println(3 - 1) //res7: Int = 2

    println('b' - 'a') //res8: Int = 1

    println(2L * 3L) //res9: Long = 6

    println(11 / 4) //res10: Int = 2

    println(11 % 4) //res11: Int = 3

    println(11.0f / 4.0f) //res12: Float = 2.75

    println(11.0 % 4.0) //res13: Double = 3.0

    println(math.IEEEremainder(11.0, 4.0)) //res14: Double = -1.0

    val neg = 1 + -3 //neg: Int = -2
    println(neg)

    val y = +3 //y: Int = 3
    println(y)

    println(-neg) //res15: Int = 2

    //    5.6 Relational and logical operations
    println(1 > 2) //res16: Boolean = false

    println(1 < 2) //res17: Boolean = true

    println(1.0 <= 1.0) //res18: Boolean = true

    println(3.5f >= 3.6f) //res19: Boolean = false

    println('a' >= 'A') //res20: Boolean = true

    val untrue = !true //untrue: Boolean = false
    println(untrue)

    val toBe = true
    println(toBe) //toBe: Boolean = true

    val question = toBe || !toBe
    println(question) //question: Boolean = true

    val paradox = toBe && !toBe
    println(paradox) //paradox: Boolean = false


    def salt() = {
      println("salt"); false
    }

    println(salt()) //salt: ()Boolean

    def pepper() = {
      println("pepper"); true
    } //pepper: ()Boolean
    println(pepper())

    println(pepper() && salt()) //res21: Boolean = false

    println(salt() && pepper()) //res22: Boolean = false


    println(salt() & pepper()) //res23: Boolean = false

//    5.7 Bitwise operations
    println(1 & 2) //res24: Int = 0

    println(1 | 2) //res25: Int = 3

    println(1 ^ 3) //res26: Int = 2

    println(~1) //res27: Int = -2

    println(-1 >> 31) //res28: Int = -1

    println(-1 >>> 31) //res29: Int = 1

    println(1 << 2) //res30: Int = 4

//    5.8 Object equality
    println(1 == 2) //res31: Boolean = false

    println(1 != 2) //res32: Boolean = true

    println(2 == 2) //res33: Boolean = true


    println(List(1, 2, 3) == List(1, 2, 3)) //res34: Boolean = true

    println(List(1, 2, 3) == List(4, 5, 6)) //res35: Boolean = false


    println(1 == 1.0) //res36: Boolean = true

    println(List(1, 2, 3) == "hello") //res37: Boolean = false


    println(List(1, 2, 3) == null) //res38: Boolean = false

    println(null == List(1, 2, 3)) //res39: Boolean = false


    println(("he" + "llo") == "hello") //res40: Boolean = true


//    5.9 Operator precedence and associativity


    println(2 << 2 + 2) //res41: Int = 32


    println(2 + 2 << 2) //res42: Int = 16


//    x = 1
//    y1 = 2
//    x *= y1 + 1
//    x *= (y1 + 1)
//    { val x = a; b.:::(x) }



  }
}
