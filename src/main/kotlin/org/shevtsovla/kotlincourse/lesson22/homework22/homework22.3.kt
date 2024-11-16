package org.shevtsovla.kotlincourse.lesson22.homework22

fun<A, B> Pair<A, B>.revert(): Pair<B, A> {
    return Pair(this.second, this.first)
}

fun main() {
    val pair1 = Pair(1, "a")
    println(pair1.revert())

    val pair2 = Pair(1.1, null)
    println(pair2.revert())
}
