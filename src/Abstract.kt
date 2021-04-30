
fun main( args : Array<String>) {

   var apple = Apple("6S" , "Black","Included")
    apple.getDetails("6S" , "Black","Included")
}

abstract class Phone( model : String , color : String){

    abstract fun getData( model: String , color: String)
}

class Apple(model: String , color: String , appleCharger : String) : Phone(model , color){

    fun getDetails( model: String , color: String , appleCharger: String){

        println("Model =$model\nColor =$color\nAppleCharger =$appleCharger\n")
    }

    override fun getData(model: String, color: String) {
        TODO("Not yet implemented")
    }
}