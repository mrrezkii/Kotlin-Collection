package app

fun main() {
    val mutableMap: MutableMap<String, String> = mutableMapOf()
    mutableMap["a"] = "Muhammad"
    mutableMap["b"] = "Rezki"
    mutableMap["c"] = "Ananda"
    mutableMap.put("d", "Muh")

    println(mutableMap["a"])
    println(mutableMap.get("b"))
    println(mutableMap["c"])
    println(mutableMap.getOrDefault("e", "Tidak ada"))
    println(mutableMap["e"])

    mutableMap.remove("b")

    for ((key, value) in mutableMap){
        println("$key to $value")
    }
}