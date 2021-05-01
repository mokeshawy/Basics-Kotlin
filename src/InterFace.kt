
fun main( args : Array<String>) {

    var details = DetailsInterFace()

    println(details.age)
    println(details.getDetails())



    var myMultipleInheritance = MyMultipleInheritance()

    myMultipleInheritance.getDataFromA()
    myMultipleInheritance.getDataFromB()

}

interface MyInterFace{

    var age : Int

    fun getDetails() : String
}


class DetailsInterFace() : MyInterFace{
    override var age: Int = 34

    override fun getDetails(): String {

        return "Hello InterFace"
    }

}


interface MultipleInheritanceA{

    fun getDataFromA()
}

interface MultipleInheritanceB{

    fun getDataFromB()
}

class MyMultipleInheritance() : MultipleInheritanceA , MultipleInheritanceB{
    override fun getDataFromA() {

        println("Hello A")
    }

    override fun getDataFromB() {
        println("Hello B")
    }

}