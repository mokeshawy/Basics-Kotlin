/*

                    Operations rules | Priorities rules

1 - 	 ( )            it has priority first

2 -	      ^             it has priority second

3 - 	* ,  /          it has priority third

4 -	    + ,  -          Fourth , it has priority

5 -      =              it has priority fifth

 */
fun main(args : Array<String>) {

//    var num1 : Double = 30.3
//    var num2 : Double = 20.5
//
//    var sum1 = num1 + num2 // operation plus tow number
//    println("Sum : $sum1")
//
//
//    println("Enter Num1")
//    var inputNum1 : Double = readLine()!!.toDouble()
//    println("Enter num2")
//    var inputNum2 : Double = readLine()!!.toDouble()
//
//    var sum2 = inputNum1 + inputNum2 // operation plus tow number from enter input
//    println("Sum : $sum2")

    // Calculator operations
//    println("Enter Calc1 : ")
//    var calc1 : Int = readLine()!!.toInt()
//
//    println("Enter Calc2 : ")
//    var calc2 : Int = readLine()!!.toInt()
//
//    var sum3 : Int? = null
//    sum3 = calc1 + calc2
//    println(sum3)
//
//    sum3 = calc1 - calc2
//    println(sum3)
//
//    sum3 = calc1 * calc2
//    println(sum3)


    var n1 = 4
    var n2 = 10
    var n3 = 30

    var sum4 : Int? = null

            //2        // 1      // 3
    sum4 = n1   +     n2*n3     -3

                // 1   // 2   // 3
   // sum4 = (n1 + n2 )  *n3   - 3 //

             //2    // 1
    //sum4 = n1 + n2/n3

                //1     //2      // 3
    //sum4 = (n1 + n2) / n3       - 1
    print(sum4)


}