package org.shevtsovla.kotlincourse.lesson22.homework22

fun Array<Int>.toPair(): Pair<Int, Int>? {
    return if (size >= 2) Pair(this[0], this[1]) else null
}

fun Char?.function1(arg1: Int, arg2: Int, arg3: Boolean) {

}

fun<T> MutableList<T>.function2(element: T?, index: Int): T? {
    return null
}

fun<K> Map<K, List<K>>?.function3(arg: Int): Map<String, K?>? {
    return mapOf()
}

fun Long?.function4(): String {
    return "string"
}

fun main() {
    val array = arrayOf(1, 2, 3, 4)
    println(array.toPair())

    val char: Char? = 'A'
    char.function1(1, 2, true)

    val mutableList = mutableListOf(1, 2, 3, 4)
    println(mutableList.function2(null, 5))

    val map = mapOf(
        1 to listOf(1, 11, 111),
        2 to listOf(2, 22, 222)
    )
    println(map.function3(2))

    val long: Long? = null
    println(long.function4())
}