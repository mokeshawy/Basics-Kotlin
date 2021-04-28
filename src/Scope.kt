
    var ageForMohamed = 34 // this public variable because writ out local block
    // you can use it in any block

fun main( args : Array<String>) {

    // this local block code when writ any variable her will create private

    // this private variable
    var age = 34 // when you need print this variable will print her in main fun only because this local block

    println("from Main fun")
    println(ageForMohamed)

    show() // call show

}

fun show(){

    // this local block code when writ any variable her will create private

    println("from Show fun")
    print(ageForMohamed)
}