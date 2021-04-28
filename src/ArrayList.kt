fun main( args : Array<String>) {

    // ArrayList

    var arrayList = ArrayList<String>()

                // add element in arrayList
    arrayList.add("Mohamed")
    arrayList.add("Eid")
    arrayList.add("Ahmed")
    arrayList.add("Eid")
    arrayList.add("Keshawy")
    arrayList[1] = "Anas"       // update elements 1

    println("With out index")
    for( item in arrayList){

        println(item)
    }

    println("With index")
                                // this size will get number of elements from array
    for( index in 0..arrayList.size -1){

        println(arrayList[index])
    }

    // Search element in array
    println("Enter element")
    var search = readLine()!!.toString()
    if( arrayList.contains(search) ){

        print("Search Found")
    }else{
        print("Search Not found")
    }


}