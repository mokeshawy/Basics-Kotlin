fun main( args : Array<String>) {

   // showNumber(20 , 30) // call the show number
   // showNumber(50 , 100)

    var resultSuNumber1 = sumNumber(10 , 40)
    print(resultSuNumber1)

}

fun showNumber( number1 : Int , number2 : Int){     // fun show number

    println( number1)
    println(number2)


}
                                        // when you have return value writ colon and writ Datatype of return
fun sumNumber( num1 : Int , num2 : Int) : Int{

    var sum = num1 + num2

    return sum
}