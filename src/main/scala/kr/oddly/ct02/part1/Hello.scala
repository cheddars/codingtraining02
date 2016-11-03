package kr.oddly.ct02.part1

import scala.io.StdIn._

object Hello {
  def main(args: Array[String]): Unit = {
    val name = readLine("What is your name? ")
    println("Hello, " + name + ", nice to meet you!")
  }
}