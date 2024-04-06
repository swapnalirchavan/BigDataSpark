object digitAdd {
  def main(args: Array[String]): Unit = {
    var number=121
    var sum = 0
    var n = number
    while (n > 0) {
      sum += n % 10
      n /= 10
    }
    sum
    println("Addition is:"+sum)
  }
}

