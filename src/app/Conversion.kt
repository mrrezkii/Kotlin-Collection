package app

fun main() {
    val array = arrayOf(1,1,3,4,3,2,1,6,8,0,6,6,4,3)
    val range = 1..100

    val list = array.toList()
    val set = array.toSet()

    val mutableList = range.toMutableList()
    val mutableSet = range.toMutableSet()

    val listToMutableList = list.toMutableList()
    val setToMutableSet = set.toMutableSet()

    val sortedSet = array.toSortedSet()
}