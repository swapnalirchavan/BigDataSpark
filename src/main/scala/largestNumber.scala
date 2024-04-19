object largestNumber extends App {
  val arr = Array(10, 20, 13, 90, 34)
  var max = arr(0)
  for (i <- 1 until arr.length) {
    if (arr(i) > max) {
      max = arr(i)
    }
  }
  println("largest number is: " + max)
}
