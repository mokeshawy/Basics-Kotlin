
fun main( args : Array<String>) {

    var computer = Dell("14x15","Red")
    computer.getDetails("14x16")

}

open class Computer( screen : String , color : String){

    open fun getDetails( screen: String){

        println("The have $screen")
    }
}

class Dell( screen: String , color: String) : Computer( screen , color){

    override fun getDetails(screen: String) {
        super.getDetails(screen)
        var type = "Dell latitude E5400"
        println("The screen for dell $screen , $type")
    }
}

class Hp( screen: String , color: String) : Computer( screen , color){


}