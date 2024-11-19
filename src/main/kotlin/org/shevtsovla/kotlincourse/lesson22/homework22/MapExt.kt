package org.shevtsovla.kotlincourse.lesson22.homework22

fun<K> Map<K, List<K>>?.function3(arg: Int): Map<String, K?>? {
    return mapOf()
}

fun main() {
    val map = mapOf(
        1 to listOf(1, 11, 111),
        2 to listOf(2, 22, 222)
    )
    println(map.function3(2))
}