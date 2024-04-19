object sumAllNumbers extends App{
  val arr: Array[Int] = Array(10, 20, 30, 40, 50)
  var result = 0
  if (arr.isEmpty || arr.length == 1) {
    Array.empty[Int]
  } else {

    for (i <- 0 until arr.length) {
      result = result+arr(i)
      println(s"Result:"+result)
    }
  }
println("final sum is:"+result)
}


