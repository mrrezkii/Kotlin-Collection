package app

fun main() {
    val mutableList: MutableList<String> = mutableListOf()

    mutableList.add("Muhammad")
    mutableList.add("Rezki")
    mutableList.add("Ananda")

    println(mutableList[0])
    println(mutableList[1])
    println(mutableList[2])

    for (value in mutableList)
        println(value)
}