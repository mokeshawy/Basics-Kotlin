fun main( args : Array<String>) {

    // Array an array set contains some elements

//    var arrayString = Array<String>(5){""}       // example array with element string
//
//    arrayString[0] = "Mohamed"
//    arrayString[1] = "Eid"
//    arrayString[2] = "Ahmed"
//    arrayString[3] = "Eid"
//    arrayString[4] = "Keshawy"
//
//    for (item in 0..4){
//
//        println(arrayString[item])
//    }


    var arrayItem = Array<Int>(5){0}        // example for array have Integer element and enter element by input and print by for loop

    var i=0
    for (index in 0..4){
        println("Enter index of array : ")
        arrayItem[index] = readLine()!!.toInt()

        println(i++)
    }

    for (item in arrayItem){

        println(item)

    }
}