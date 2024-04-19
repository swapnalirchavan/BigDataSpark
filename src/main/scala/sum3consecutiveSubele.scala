object sum3consecutiveSubele extends App{
  val arr: Array[Int] = Array(10, 20, 30, 40, 50)
  var result = 0
  var k=3
  var newArray: Array[Int] = Array.empty[Int]

  if (arr.isEmpty || arr.length == 1) {
    Array.empty[Int]
  } else {
    for(i<-0 to arr.length-k) {
      result=0
      for (j <- i until k) {
        result = result+arr(j)
      }
      println(s"Result:"+result)
      k=k+1
      newArray = newArray :+result
    }
  }
  var max=newArray(0)
/*  to: This method includes the upper bound of the range.
  For example, 0 to 5 would include 0, 1, 2, 3, 4, and 5.
  until: This method does not include the upper bound of the range.
  For example, 0 until 5 would include 0, 1, 2, 3, and 4, but not 5.*/
  for(i<-0 until newArray.length) {
    if (newArray(i) > max) {
      max = newArray(i)
    }
  }
  println("until--Max of sum:"+max)

  for(i<-0 to newArray.length-1) {
    if (newArray(i) > max) {
      max = newArray(i)
    }
  }
  println("to---Max of sum:"+max)

}