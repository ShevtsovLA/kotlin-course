package org.shevtsovla.kotlincourse.lesson24.homework24

fun main() {

    //NullPointerException
    try {
        val a = null
        a!!
//    } catch (e: Throwable) {
//    println("NullPointerException")
//    }

        //ArrayIndexOutOfBoundsException
//    try {
        val b = listOf(1, 2, 3)
        b[3]
//    } catch (e: Throwable) {
//        println("ArrayIndexOutOfBoundsException")
//    }

        //ClassCastException
//    try {
        val c = 1.1 as String
//    } catch (e: Throwable) {
//        println("ClassCastException")
//    }

        //NumberFormatException
//    try {
        val d = "1,2".toDouble()
        println(d)
//    } catch (e: Throwable) {
//        println("NumberFormatException")
//    }

        //IllegalArgumentException
//    try {
        function1(131)
//    } catch (e: Throwable) {
//        println("IllegalArgumentException")
//    }

        //IllegalStateException
//    try {
        function2(99)
//    } catch (e: Throwable) {
//        println("IllegalStateException")
//    }

        //OutOfMemoryError
//    try {
        val g = mutableListOf("")
        while (true) {
            g.add("раз")
        }
//    } catch (e: Throwable) {
//        println("OutOfMemoryError")
//    }

        //StackOverflowError
//    try {
        function3()
//    } catch (e: Throwable) {
//        println("StackOverflowError")
//    }
    } catch (e: Exception) {
        when (e) {
            is NullPointerException -> println("NullPointerException")
            is ArrayIndexOutOfBoundsException -> println("ArrayIndexOutOfBoundsException")
            is ClassCastException -> println("ClassCastException")
            is NumberFormatException -> println("NumberFormatException")
            is IllegalArgumentException -> println("IllegalArgumentException")
            is IllegalStateException -> println("IllegalStateException")
            is OutOfMemoryError -> println("OutOfMemoryError")
            is StackOverflowError -> println("StackOverflowError")
        }

    }

    try {
        throw CustomException("Какое-то исключение")
    } catch (e: CustomException) {
        println("Обработано исключение: ${e.message}")
    }

    try {
        val h = listOf(1, 2, 3)
        println(h[3])
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException")
        throw AnotherCustomExeption(e)
    }

}

fun function1(e: Int) { //IllegalArgumentException
    require(e <= 100)
}

fun function2(f: Int) { //IllegalStateException
    check(f >= 100)
}

fun function3() {
    function3()
}

