
fun main( args : Array<String>) {

    println("Enter number :")
    var number = readLine()!!.toInt()

    when(number){

        1->{
            print("Good morning")
        }
        2->{
            print("Good after non")
        }
        3,4->{
            print("Good night")
        }

        // from 10 to 40
        in 10..40->{
            print("Good")
        }
        else ->{
            print("Out")
        }
    }
}