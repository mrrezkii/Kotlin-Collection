package app

fun main() {
    val pair = Pair("Muhammad", "Rezki")
    println(pair.first)
    println(pair.second)

    val pair2: Pair<String, String> = "Muhammad" to "Rezki"
    println(pair2.first)
    println(pair2.second)
}