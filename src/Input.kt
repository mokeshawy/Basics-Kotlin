fun main(args : Array<String>){

    print("Enter name : ")
    var name : String = readLine()!! // when you need entry value from input using readLine()
    println(name)

    print("Enter Age : ")
    var age : Int = readLine()!!.toInt() // make input whit Int type
    println(age)

    print("Enter Avg : ")
    var avg : Double = readLine()!!.toDouble() // make input whit Double type
    println(avg)

    print("title : ")
    var title : String? = null

    title = readLine()
    print(title)
}