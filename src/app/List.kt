package app

fun main() {
     val list: List<String> = listOf("Muhammad", "Rezki", "Ananda")
    println(list[0])
    println(list[1])
    println(list[2])
    println(list.indexOf("Rezki"))
    println(list.indexOf("Ananda"))
    println(list.contains("Muhammad"))
    println(list.containsAll(listOf("Rezki", "Nando")))
    println(list.isEmpty())
    println(list.isNotEmpty())
}