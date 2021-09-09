package app

fun main() {
    listOf("Muhammad", "Rezki", "Ananda").forEach {
        println(it)
    }

    mutableListOf("Muhammad", "Rezki", "Ananda").forEachIndexed { index, s ->
        println("$index : $s")
    }
}