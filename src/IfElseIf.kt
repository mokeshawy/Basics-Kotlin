fun main( array: Array<String>) {

    println("Enter grade")
    val grade = readLine()!!.toInt()

    if( grade >= 80 && grade<= 100){

        print("Excellent")

    }else if( grade >= 60 && grade <= 70 ){

        print("Good")

    }else if( grade >= 45 && grade<= 55){

        print("Acceptable")
    }else{
        print("fill")
    }

}