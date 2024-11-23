package org.shevtsovla.kotlincourse.lesson23.homework23

import kotlin.math.pow

fun main() {


    println("---Task 1---")
    analyzeDataType("string")
    analyzeDataType(42)
    analyzeDataType(listOf("a", "b", "c"))
    analyzeDataType(mapOf("a" to 1, "b" to 2))
    analyzeDataType(1.47f)

    println("\n---Task 2---")
    println(safeCastToList(555))
    println(safeCastToList(listOf(1, 1, 1)))

    println("\n---Task 3---")
    println(getStringLengthOrZero(null))
    println(getStringLengthOrZero(135))
    println(getStringLengthOrZero("That,s Britney, bitch!"))

    println("\n---Task 4---")
    println(numberSquared(13))
    println(numberSquared(3.14))
    println(numberSquared("42"))
    println(numberSquared("Сорок два"))
    println(numberSquared('3'))

    println("\n---Task 5---")
    println(sumIntOrDoubleValues(listOf(1, 1.1, 2, 2.2)))
    println(sumIntOrDoubleValues(listOf(1, 2, "2", 3L, 5, 0.64f)))

    println("\n---Task 6---")
    println(tryCastToListAndPrint(listOf("Hello", "there", "!")))
    println(tryCastToListAndPrint(listOf(1, 2, 3, "4")))
    println(tryCastToListAndPrint("General Kenobi!"))


}

fun analyzeDataType(value: Any) {
    when (value) {
        is String -> println("Это строка: $value")
        is Int -> println("Это целое число: $value")
        is List<*> -> println("Это список, количество элементов: ${value.size}")
        is Map<*, *> -> println("Это карта, количество пар: ${value.size}")
        else -> println("Неизвестный тип данных")
    }
}

fun safeCastToList(value: Any): Int {
    return (value as? List<*>)?.size ?: -1
}

fun getStringLengthOrZero(value: Any?): Int {
    return (value as? String)?.length ?: 0
}

fun numberSquared (value: Any): Double {
    return when (value) {
        is Number -> value.toDouble().pow(2.0)
        is String -> value.toDoubleOrNull()?.pow(2.0) ?: 0.0
        else -> 0.0
    }
}

fun sumIntOrDoubleValues (value: List<Any>): Double {
    return value.filter { it is Int || it is Double }
        .sumOf {
            when (it) {
                is Int -> it.toDouble()
                is Double -> it
                else -> 0.0
            }
        }
}

fun tryCastToListAndPrint (value: Any) {
    (value as? List<*>)?.forEach {
        val result = (it as? String) ?: "Элемент не является строкой."
        println(result)
    } ?: println("Ошибка: значение не является списком.")
}

