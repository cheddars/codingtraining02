package kr.oddly.ct02.part3

import scala.io.StdIn._

/**
  * Created by nezah on 14/11/2016.
  */
object Quote {
  def main(args: Array[String]): Unit = {
    val said = readLine("What is the quote? ")
    val who = readLine("Who said it? ")
    println(who + " says, \"" + said + "\"")
  }
}
