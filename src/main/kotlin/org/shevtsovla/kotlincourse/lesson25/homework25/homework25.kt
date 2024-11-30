package org.shevtsovla.kotlincourse.lesson25.homework25

const val const = "Констанция! Констанция!"

fun main() {

    println("---Задание 1---")

    val function1 = fun () {
        println(const)
    }
    function1()

    val function11: () -> Unit = {
        println(const)
    }
    function11()

    val function12 = {
        println(const)
    }
    function12()

    println("\n---Задание 2---")

    val function2 = fun (list: List<Int>): Double {
        require(list.isNotEmpty())
        return list.average()
    }

    val function21: (List<Int>) -> Double = {
        require(it.isNotEmpty())
        it.average()
    }

    val function22 = { list: List<Int> ->
        require(list.isNotEmpty())
        list.average()
    }
    //println(function22(listOf())) IllegalArgumentException
    println(function22(listOf(1, 2, 3, 4)))

    println("\n---Задание 3---")

    val function3 = fun (list: List<String>, a: Int): List<String> {
        if (list.isEmpty()) {
            throw Exception("Список пуст.")
        }
        return list.filter{ it.length >= a }

    }
    println(function3(listOf("Что", "ты", "такое", "котлин"), 2))
    //println(function3(listOf(), 12))

    val function31: (List<String>, Int) -> List<String> = { list, a ->
        if (list.isEmpty()) {
            throw Exception("Список пуст.")
        }
        list.filter{ it.length >= a }

    }
    println(function31(listOf("Что", "ты", "такое", "котлин"), 2))
    //println(function31(listOf(), 12))

    println("\n---Задание 4---")

    val function32 = { list: List<String>, a: Int ->
        if (list.isEmpty()) {
            throw Exception("Список пуст.")
        }
        list.filter{ it.length >= a }

    }
    println(function32(listOf("Что", "ты", "такое", "котлин"), 6))
    //println(function32(listOf(), 12))


    val function4 = fun (number: Long): Int {
        return number.toString().sumOf { it.digitToInt() }
    }
    println(function4(123456789L))

    val function41: (Long) -> Int = { number ->
        number.toString().sumOf { it.digitToInt() }
    }
    println(function41(987654321L))

    val function42 = { number: Long ->
        number.toString().sumOf { it.digitToInt() }
    }
    println(function42(111111111L))

    println("\n---Задание 5---")

    val function5 = fun List<Int>.(): List<Int> {
        return this.distinct()
    }
    println(function5(listOf(1, 2, 3, 4, 4)))

    val function51: List<Int>.() -> List<Int> = {
        this.distinct()
    }
    println(function51(listOf(1, 1, 2, 2, 3, 3)))

    println("\n---Задание 6---")

    val function6 = fun Map<String, Int>.(a: Int): List<String> {
        val result = this.filter { (key, value) ->
            key.length < value && key.length > a
        }.keys.toList()
        if (result.isEmpty()) {
            throw IllegalStateException("Список ключей пуст.")
        }
        return result
    }
    println(function6(mapOf("abc" to 4, "abcd" to 5, "cba" to 6), 3))

    val function61: Map<String, Int>.(Int) -> List<String> ={ a ->
        val result = this.filter { (key, value) ->
            key.length < value && key.length > a
        }.keys.toList()
        if (result.isEmpty()) {
            throw IllegalStateException("Список ключей пуст.")
        }
        result
    }
    println(function61(mapOf("abc" to 4, "abcd" to 5, "cba" to 6), 3))
    //println(function61(mapOf(), 0))












}

fun function1() {
    println(const)
}

fun function2(list: List<Int>): Double {
    require(list.isNotEmpty())
    return list.average()
}

fun function3(list: List<String>, a: Int): List<String> {
    if (list.isEmpty()) {
        throw Exception("Список пуст.")
    }
    return list.filter{ it.length >= a }

}

fun function4(number: Long): Int {
    return number.toString().sumOf { it.digitToInt() }
}

fun List<Int>.function5(): List<Int> {
    return this.distinct()
}

fun Map<String, Int>.function6(a: Int): List<String> {
    val result = this.filter { (key, value) ->
        key.length < value && key.length > a
    }.keys.toList()
    if (result.isEmpty()) {
        throw IllegalStateException("Список ключей пуст.")
    }
    return result
}