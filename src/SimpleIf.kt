fun main( args : Array<String>) {


//    print("Enter number : ")
//    var number = readLine()!!.toInt()
//
//    if( number >= 5 && number <=100){
//
//        print("Success")
//
//    }else{
//        print("Not Allowed")
//    }


    print("Enter your grade")
    var grade = readLine()!!.toInt()

    if( grade>=50 && grade<=100){
        if(grade>=47){
            grade = grade+5
            print("the grade is $grade")
        }else{
            print("fill")
        }
        println("Excellent $grade")

    }else{
        if(grade>=45){
            grade = grade+5
            print("the grade is $grade")
        }else{
            print("fill")
        }
    }
}