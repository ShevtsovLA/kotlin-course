package org.shevtsovla.kotlincourse.lesson23

fun main () {

    val a: Any = "Any"
    println(a as String)

    //println(a as Int)

    if (a is String) {
        println(a)
    } else {
        println("It's not a string.")
    }

    if (a is Int) {
        println(a)
    } else {
        println("It's not a number.")
    }

    println(a as? Int ?: "It's not a number.")

    val b: Any = listOf("Julia", "will", "get", "well", "soon")
    //println(b as List<String>)
    //println((b as List<Int>).get(0))
    if (b is List<*>) {
        (b[0] as String).length
    }

    val c: String? = null
    println(c as? String)

}