package app

import data.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()
    mutableSet.add(Person("Muhammad"))
    mutableSet.add(Person("Rezki"))
    mutableSet.add(Person("Ananda"))
    mutableSet.add(Person("Rezki"))

    for (person in mutableSet){
        println(person)
    }
}