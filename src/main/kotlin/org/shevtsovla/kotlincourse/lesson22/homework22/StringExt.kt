package org.shevtsovla.kotlincourse.lesson22.homework22

fun String.encrypt(base: Int): String {
    return map { it + base }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return map { it - base }.joinToString("")
}

fun main() {
    val string1 = "String"
    println(string1.encrypt(2))

    val string2 = "Hwem"
    println(string2.decrypt(2))
}