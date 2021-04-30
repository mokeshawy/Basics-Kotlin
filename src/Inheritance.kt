fun main( args : Array<String>) {

    //var bmw = Bmw(1990 , "Red" , 150)

    var audi = Audi(1987 , "Black" , 160 , "Good")
}

open class Car3( model : Int , color : String , speed : Int){

    init {
        println("Model =$model\n Color =$color\n Speed =$speed")
    }
}

class Bmw(model: Int , color: String , speed: Int) : Car3( model , color , speed){

    init{
        println("The BMW good car")
    }
}

class Audi(model: Int , color: String , speed: Int , turbo : String) : Car3(model , color , speed){

    init {
        println("Turbo = $turbo")
        println("The Audi good car")
    }
}
