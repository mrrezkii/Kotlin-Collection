package app

fun <T> displayMutableListIterator(mutableIterator: MutableIterator<T>){
    while (mutableIterator.hasNext()) println(mutableIterator.next())
}

fun removeOddNumber(mutableIterator: MutableIterator<Int>){
    while (mutableIterator.hasNext()){
        val item = mutableIterator.next()
        if (item % 2 == 1) mutableIterator.remove()
    }
}

fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    removeOddNumber(mutableList.listIterator())
    displayMutableListIterator(mutableList.listIterator())
}