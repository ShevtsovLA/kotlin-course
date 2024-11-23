package org.shevtsovla.kotlincourse.lesson24

import java.io.File
import java.io.IOException
import kotlin.NullPointerException

fun main() {

    try {
        // Код, который может выбросить исключение
        val t = null
        t!! // преобразование nullble в notnullble
        println("!!")
        val r = listOf(1)
        r[2]
    } catch (e: NullPointerException) {
        // Обработка конкретного типа исключения
        println("NullPointerException")
    } catch (e: RuntimeException) {
        // Обработка всех остальных исключений
        println("ArrayIndexOutOfBoundsException")
        throw IOException(e)
    } finally {
        // Блок, который выполняется всегда, независимо от наличия исключения
        println("finally block")
    }

//    try {
//        // Код, который может выбросить исключения
//    } catch (e: Exception) {
//        when(e) {
//            is ExceptionA, is ExceptionB -> {
//                // Обработка исключений ExceptionA или ExceptionB
//                println("Обработано исключение типа A или B")
//            }
//            else -> throw e // Перебрасываем исключение дальше, если оно не соответствует обработанным типам
//        }
//    }

    try {
        val i = "1" as Double
    } catch (e: Throwable) {
        println("Throwable")
    }

    val i = "1,0".toDouble()
    println(i)

//    setAge(-1)

    val file = File("пам")
//    println(file.readText())
    file.createNewFile()

    val j = file.inputStream()
    j.close()
    j.read()

    val list = mutableListOf("")
    try {
        while (true) {
            list.add("пам")
        }
    } catch (e: Throwable) {
        println("память______________________________________")
    }

    try {
        stack()
    } catch (e: Throwable) {
        println("StackOverFlow")
    }
}

fun setAge(age: Int) {
    check(age >= 0) {
        "текст ошибки"
    }
}

fun stack() {
    stack()
}

class OrderExc(message: String) : RuntimeException(message) {}
