object patterns {


  def main(args: Array[String]): Unit={
   /* 1
    12
    123
    1234
    12345*/
    for(i<-1 to 5){
      for(j<-1 to i){
        print(j)
      }
      println()
    }
/*
    *
    **
    ***
    ****
    *****
    */
    for(i<-1 to 5){
      for(j<-1 to i){
        print("*")
      }
      println()
    }

    for(i<-1 to 5){
      for(j<-1 to 4){
        print("*")
      }
      println()
    }
    /*
    *****
    ****
    ***
    **
    *
    */
    for(i<-5 to 1 by -1){
      for(j<-1 to i){
        print("*")
      }
      println()
    }

    for(i<-5 to 1 by -1){
      for(j<-1 to i){
        print("*")
      }
      println()
    }
/*
    *
    *-*
    *-*-*
    *-*-*-*
    *-*-*-*-*
    */

    for (i <- 1 to 5) {
      for (j <- 1 to i) {
        print("*")
        if (j < i) print("-")
      }
      println()
    }
    /*
          *
        * * *
      * * * * *
        * * *
          *
    */
    for (i <- 1 to 3) {
      val numSpaces = 3 - i
      val numStars = 2 * i - 1
      val line = " " * numSpaces + "* " * numStars
      println(line)
    }
    for (i <- 3 to 1 by -1) {
      val numSpaces = 3 - i
      val numStars = 2 * i - 1
      val line = " " * numSpaces + "* " * numStars
      println(line)
    }


  }

}
