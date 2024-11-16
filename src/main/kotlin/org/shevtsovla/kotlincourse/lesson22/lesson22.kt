package org.shevtsovla.kotlincourse.lesson22

fun main() {
    val result = "String with spaces".removeSpaces()
    println(result)

    val s: List<Int?> = listOf(1, null)
    s.isElementsNullOrEmpty()
}

fun String.removeSpaces(): String {
    return replace(" ", "")
}

fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}
