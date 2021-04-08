package org.safe2008.app

import org.safe2008.lib.Calculator

object Main{
  def main(args: Array[String]): Unit = {
    var cal = new Calculator()
    Console.println(cal.add(10, 100))
    Console.println("RUN RUN RUN RUN")
    // Console.println(sys.env.get("GITHUB_TOKEN"))
  }
}