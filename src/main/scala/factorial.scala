object factorial {
  def main(args:Array[String]):Unit={
    val number = 3
    var factorial = 1

    if (number >= 1) {
      for (i <- 1 to number) {
        factorial *= i
      }
    }
    println("factorial:"+factorial)
  }
}
