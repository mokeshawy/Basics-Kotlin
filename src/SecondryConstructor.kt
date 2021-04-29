
fun main( args : Array<String>) {

    Home("Black")

}


class Home{ // call second

    var doorColor : String = ""
    var room : Int = 0
    var windowColor : String = ""

    constructor(doorColor : String){
        this.doorColor = doorColor
        print("DoorColor : $doorColor")
    }

    init {  // call first
        this.doorColor
    }
}