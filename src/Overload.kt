
fun main( args : Array<String>) {

    var shoes = Shoes()

    shoes.getDetails("Black")

}

class Shoes{

    fun getDetails( color : String){

        println("The Shoes color $color")
    }

    fun getDetails( size : Int){

        println("The size of Shoes $size")
    }

}