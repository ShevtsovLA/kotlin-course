package org.shevtsovla.kotlincourse.lesson22.homework22

fun Array<Int>.toPair(): Pair<Int, Int>? {
    return if (size >= 2) Pair(this[0], this[1]) else null
}

fun main() {
    val array = arrayOf(1, 2, 3, 4)
    println(array.toPair())

}