package org.shevtsovla.kotlincourse.lesson13

fun main() {

    val collection = listOf(1, 3, 4, 7, 9, 5)
    if (collection.size < 5) {
        println("ok")
    } else {
        println("!ok")
    }
    collection.isEmpty()
    collection.isNotEmpty()

    val defaultValue = collection.getOrElse(6) { 0 }
    println(defaultValue)




}