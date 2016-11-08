package kr.oddly.ct02.part2

import scala.io.StdIn._

/**
  * Created by nezah on 08/11/2016.
  */
object Count {
  def main(args: Array[String]): Unit = {
    val input = readLine("What is the input string? ")
    val cnt = input.length()
    println(input + " has " + cnt + " characters.")
  }
}
