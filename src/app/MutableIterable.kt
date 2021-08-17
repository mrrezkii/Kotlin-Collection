package app

fun <T> displayMutableIterable(iterable: MutableIterable<T>){
    val iterator = iterable.iterator()
    while (iterator.hasNext()){
        val value = iterator.next()
        // iterator.remove()
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Muhammad", "Rezki", "Ananda"))
    displayMutableIterable(mutableSetOf("Muhammad", "Rezki", "Ananda"))
}