fun main( args : Array<String>) {

    var msg = " Welcome to Cairo"

    for( index in 0..msg.length -1){

        println("Index ${index}= ${msg[index]}")
    }

    var name = "Mohamed"

    var welcomeName = name + msg

    println(welcomeName)

    println(welcomeName.toLowerCase()) // change to lower case

    println(welcomeName.toUpperCase())  // change to upper case

    println(msg.trim())  // delete space

    println(welcomeName.split(","))  // Add commas based on the on the space between words
    println(welcomeName.split(" "))  // The division of the sentence is the basis for the space between words
}