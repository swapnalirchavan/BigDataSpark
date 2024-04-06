object palindrome {
  def main(args:Array[String]):Unit={
   var number=121
    var copy=number
    var rev=0
  var rem=0
  while(number!=0){
    rem=number%10
    rev=rev*10+rem
    number=number/10
  }
    println("Reverse is :"+rev)
    if(rev==copy){
      println("Number is palindrome")
    }
    else{
      println("number is not palindrome")
    }
  }

}
