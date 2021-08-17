package app

fun <T> displayMutableCollection(collection: MutableCollection<T>){
    for (element in collection) println(element)
}

fun main() {
    displayMutableCollection(mutableListOf("Muhammad", "Rezki", "Ananda"))
    displayMutableCollection(mutableSetOf("Muhammad", "Rezki", "Ananda"))
    displayMutableCollection(mutableMapOf("Nama" to "Nando").entries)
}