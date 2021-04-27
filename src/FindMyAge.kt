import java.util.*

fun main(args : Array<String>) {

    println("Enter year of birth") // Calculate years of birth day
    var yearOfBirth : Int = readLine()!!.toInt()

    var year = Calendar.getInstance().get(Calendar.YEAR)

    var age = year - yearOfBirth

    println(age)
}