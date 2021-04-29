
fun main( args : Array<String>) {

    // Call class Primary Constructor
    var car1 = CarClass("BMW",1990 , 130.30 , 100000 , "Mohamed")

    //var car2 = CarClass("Audi",1980 , 140.30 , 140000 , "Anas")

    var calculator = Calculator()
    println(calculator.sum1(1 , 4))


    // Default call class
    var car = Car()
    car.speed = 140
    car.model = "BMW"
    car.color = "Green"
    car.getCarDetails()


    var person = Person("Mohamed" , 34)
    person.age = 30 //==> her we can change value because age in class var
    // first name can read only no change because have a val in class
    println(person.firstName)
    println(person.age)


    var person2 = Person2() // will print default value
    var person3 = Person2("Mohamed")    // will change name and print default value for age

}


// Class Primary constructor
class CarClass ( var type : String , var model : Int , var price : Double , var milesDriver : Int , var owner : String ){

    init {      // initializer block
        println("type :$type\n model :$model\n price :$price\n miles :$milesDriver\n owner :$owner")
    }
}

class Calculator {
    fun sum1( number1 : Int , number2 : Int) :Int{

        var sum1 = number1 + number2
        return sum1
    }
}

class Car{

    var speed : Int = 0
    var model : String = ""
    var color : String = ""

    fun getCarDetails(){

        println("Type: $speed\n Model: $model\n Color: $color\n")
    }

}

class Person( val firstName : String, var age : Int){

}


class Person2( val firstName : String = "Unknown" , var age : Int = 0){ // with default value

    init {
        println("First Name: $firstName , Age :$age")
    }
}

