package org.shevtsovla.kotlincourse.lesson21.homework21

fun<K, V> toMap (keys: List<K>, values: List<V>): Map<K, V> {
    val result: MutableMap<K, V> = mutableMapOf()
    for (i in 0 until minOf(keys.size, values.size)) {
        result[keys[i]] = values[i]
    }
    return result
}

fun<T> getMiddleElement(list: List<T>): T? {
    return if (list.isNotEmpty()) list[list.size / 2] else null
}
