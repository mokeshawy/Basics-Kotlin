fun main( args : Array<String>){

    var name : String ="12345" // this variable is string

    var age : Int = name.toInt() // hear var age = name.toInt() this convert name to Integer value example
    println(age)

    var mString : String = "3.5"

    var mDouble : Double = mString.toDouble() // example convert from string to double
    println(mDouble)


    var mInteger : Int = 12349 // example convert from integer to double
    var mToString : String = mInteger.toString()
    println(mToString)

    var doubleData : Double = 3.5 // example convert from double to integer
    var intData : Int = doubleData.toInt()
    println(intData)
}