package org.shevtsovla.kotlincourse.lesson10

fun main() {
    // массивы
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { "" }
    val emptyNullableArray: Array<Int?> = arrayOfNulls<Int>(5)

    // списки
    val readOnlyList: List<String> = listOf("a", "b", "c")

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")

    // множества
    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5, 5)

    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    // методы
    mutableList.add("u1")
    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |")
    }

    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

    var index = list.lastIndex
    while (index >= 0) {
        println("${list[index--]}")
    }

}