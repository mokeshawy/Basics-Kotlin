
fun main(args : Array<String>) {


    var hash = HashSet<String>()

    hash.add("Kotlin")
    hash.add("Java")
    hash.add("Android")
    hash.add("Android")
    hash.add("Android")
    hash.add("Google")
    hash.remove("Kotlin")
    hash.clear()
    println(hash.size)
    println(hash.isEmpty())
    println(hash)

}