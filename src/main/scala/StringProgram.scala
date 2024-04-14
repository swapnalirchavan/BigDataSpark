object StringProgram {
  def main(args: Array[String]): Unit = {
    val a="swapnali is sweet girl"
    println(a(0))
    for(i<-a.length-1 to 0 by -1){
      print(a(i))
    }
    println()
    println("with rev function:"+a.reverse)
  }

}
