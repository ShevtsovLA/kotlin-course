package org.shevtsovla.kotlincourse.lesson22.homework22

fun Long?.function4(): String {
    return "string"
}

fun main() {

    val long: Long? = null
    println(long.function4())
}