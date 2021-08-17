package app

fun <T> displayCollection(collection: Collection<T>){
    for (element in collection) println(element)
}

fun main() {
    displayCollection(listOf("Muhammad", "Rezki", "Ananda"))
    displayCollection(setOf("Muhammad", "Rezki", "Ananda"))
    displayCollection(mapOf("Nama" to "Nando").entries)
}