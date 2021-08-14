package app

import data.Person

fun main() {
    val set: Set<Person> = setOf(
        Person("Muhammad"), Person("Rezki"), Person("Ananda"), Person("Rezki")
    )

    println(set.size)
    println(set.contains(Person("Rezki")))

    for (person in set) {
        println(person)
    }
}