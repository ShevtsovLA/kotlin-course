package org.shevtsovla.kotlincourse.lesson22

fun String.funA(arg1: String, arg2: Int): Boolean {
    return true
}

fun List<Int>.funB(arg1: String?) {}

fun<K, V> Map<K, V>.funC(key: K, value: V): Boolean {
    return true
}

fun Double?.funD(arg1: Double, arg2: String?): Double {
    return 0.0
}

fun <T> Set<T>.funE(arg: T): List<T> {
    return listOf()
}

fun Double.format(): String {
    return "%.2f".format(this)
}

fun String.count(): Int {
    return split(" ").size
}

fun<T> T.createList(n: Int): List<T> {
//    val list = mutableListOf<T>()
//    for (i in 0 until n) {
//        list.add(this)
//    }
//    return list.toList()

    return (0 until n).map { this }
}

fun main() {
    println("What?".funA("What?", 1))

    listOf(1, 2, 3).funB(null)

    val num: Map<String, Int> = mapOf("a" to 1, "b" to 2, "c" to 3)
    num.funC<String, Any>("b", 3)

    var num2: Double? = null
    println(num2.funD(0.3, null))

    println(setOf(1, 2, 3).funE(8))

    var num3: Double = 43.73218
    println(num3.format())

    var str: String = "Just a string."
    println(str.split(" ").size)
    println(str.count())

    var str2 = "abc"
    var list1 = listOf(str2)
    var list2 = listOf(str2, str2, str2)
    println(str2.createList(1))
    println(str2.createList(3))

}