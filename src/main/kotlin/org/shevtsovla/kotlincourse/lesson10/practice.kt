package org.shevtsovla.kotlincourse.lesson10

fun main() {
    val arr1 = Array (100) { 0 }
    val arr2 = doubleArrayOf(1.0, 2.0, 3.0, 4.0, 5.0)
    val arr3 = Array (10) { 0 }
    arr3[0] = 10
    for (i in arr3.indices) {
        arr3[i] = (i + 1) * 10
    }
    println(arr3.toList())

    val arr4 = arrayOf("s", "15", "dop", "1s5")
    for (i in arr4.indices) {
        arr4[i] = " "
    }
    println(arr4.toList())

    val arr5 = arrayOf(2, 3, 4)
    val arr6 = arrayOf(5, 6, 7)
    val arr7 = Array (3) { 0 }
    for (i in arr7.indices) {
        arr7[i] = arr5[i] + arr6[i]
    }
    println(arr7.toList())

    val list1 = listOf<Int>()

    val list2 = listOf("sd", "1f", "fd7")
    for (i in list2) {
        println(i)
    }

    val list3 = mutableListOf<Float>()
    list3.add(13.15f)
    list3.add(68.9f)
    list3.remove(13.15f)
    list3.removeAt(0)
    println(list3)

    val set1 = setOf<Int>()
    val set2 = setOf(1, 23, 451, 68, 97)
    val set3 = mutableSetOf(25, 63, 48)
    set3.add(34)
    set3.remove(63)
    for (i in set3) {
        println(i * i)
    }

    val set4 = setOf(1, 2, 3)
    val set5 = setOf(3, 5, 6, 7)
    val set6 = mutableSetOf<Int>()
    for (elem in set4) {
        set6.add(elem)
    }
    for (elem in set5) {
        set6.add(elem)
    }
    println(set6)

}

fun findNumber (set1: Set<Int>, num: Int): Boolean {
    for (elem in set1) {
        if (elem in set1) {
            return true
        }
    }
    return false
}