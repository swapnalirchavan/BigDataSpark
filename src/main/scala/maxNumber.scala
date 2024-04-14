object maxNumber {
def main(args:Array[String]): Unit = {
  val numbers = Array(10, 20, 30, 40, 50)

  var maxNumber = numbers(0)

  for (i <- 1 until numbers.length) {
    if (numbers(i) > maxNumber) {
      maxNumber = numbers(i)
    }
  }

  println("The maximum number is: " + maxNumber)

}
}
