package kr.oddly.ct02.part1

import scala.io.StdIn._

object Hello {
  def main(args: Array[String]): Unit = {
    val name = getName()
    say(concat(name))
  }
  
  def getName(): String = {
    readLine("What is your name? ")
  }
  
  def concat(name: String): String = {
    "Hello, " + name + ", nice to meet you!"
  }
  
  def say(what: String) = {
    println(what)
  }
}