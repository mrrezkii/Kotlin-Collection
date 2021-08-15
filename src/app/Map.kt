package app

fun main() {
    val map: Map<String, String> = mapOf(
        Pair("a", "Muhammad"),
        "b" to "Rezki",
        "c" to "Ananda"
    )

    println(map.size)
    println(map["a"])
    println(map["b"])
    println(map["c"])

    for ((key, value) in map){
        println("$key to $value")
    }

    println(map.entries)

}