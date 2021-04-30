
fun main( args : Array<String>) {

    Home("Black")
    Home(3)

}


class Home{ // call second

    var doorColor : String = ""
    var room : Int = 0
    var windowColor : String = ""

    constructor(doorColor : String){
        this.doorColor = doorColor
        print("DoorColor : $doorColor")
    }

    constructor(room : Int){
        this.room = room
    }
}