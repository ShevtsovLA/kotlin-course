package org.shevtsovla.kotlincourse.lesson22.homework22

fun<T> MutableList<T>.function2(element: T?, index: Int): T? {
    return null
}

fun main() {

    val mutableList = mutableListOf(1, 2, 3, 4)
    println(mutableList.function2(null, 5))
}