package kr.oddly.ct02.part1

import scala.io.StdIn._

object Hello {
  def main(args: Array[String]): Unit = {
    println("Hello, " + readLine("What is your name? ") + ", nice to meet you!")
  }
}