object prime {
def main(args:Array[String]):Unit={
  val number=11
  var count=0
  for(i<-1 to number) {
    if (number % i == 0) {
      count = count + 1
    }
  }
  if (count == 2) {
    println("Number is prime number")
  } else {
    println("Number is not a prime number")
  }
}
}
