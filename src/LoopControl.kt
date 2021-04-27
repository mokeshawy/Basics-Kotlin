fun main( args : Array<String>) {


    // Break

//    for( count in 1..10){  // this loop start 1 to 10 hear work break when loop start 1 to 5 only no continue to 10
//
//        println("Hello $count")
//        if(count==5){
//            break
//        }
//    }

    // Continue
//    for( count in 1..10){
//
//        if(count==5){
//            continue
//        }
//        println("Hello $count")
//    }


   loop@ for( count1 in 1..10){

        for( count2 in 1..4)
        if(count1>=4){
            break@loop
        }
        println("Hello $count1")
    }

}