fun main(args : Array<String>) {

    var map = HashMap<Int , String>()

    map[1] = "Mohamed"
    map[2] = "Eid"
    map[3] = "Ahmed"
    map[4] = "Eid"
    map[5] = "Keshawy"

    map[1] = "Anas" // when we need update value do not need change the key change value only

    println(map[3]) // print costume value

    println(map)    // print all key whit value

                    // keys from map
    for( key in map.keys){      // print all value from map by keys

        println(map[key])
    }


}