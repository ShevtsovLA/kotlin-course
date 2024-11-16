package org.shevtsovla.kotlincourse.lesson22.homework22

import kotlin.math.absoluteValue

fun Number.within(other: Number, deviation: Number): Boolean {
    val actualDeviation = (this.toDouble() - other.toDouble()).absoluteValue
    return actualDeviation < deviation.toDouble()
}

fun main() {
    val num = 12.456387
    println(num.within(14853.46565, 1.4647))
}