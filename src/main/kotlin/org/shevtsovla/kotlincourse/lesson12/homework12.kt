package org.shevtsovla.kotlincourse.lesson12

fun main() {
    println(multiplyByTwo(937437))
    println(isEven(7))
    println(printNumbersUntil(6))
    println(findFirstNegative(listOf(1, 2, -3, 4)))
    processList(listOf("Kotlin", "Is", "Fun", null, "Shit"))
    println(drawRectangle1(5, 5))
    println(drawRectangle2(5, 5))
}
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
//fun doNothing() {}
//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
//fun sum(a: Int, b: Int): Int {}
//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
//fun noReturn(string: String) {}
//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
//fun average(numbers: List<Int>): Double {}
//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
//fun getLength(string:String?): Int? {}
//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
//fun getNullableDouble(): Double? {}
//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
//fun processNullableList(numbers: List<Int>?) {}
//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
//fun intToString(n: Int): String? {}
//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
//fun getNullableStringList(): List<String?> {}
//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
//fun checkStringAndInt(s: String?, n: Int?): Boolean? {}

//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int) = a * 2

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(b: Int) = b % 2 == 0

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
//Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}
//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
//Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}
//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
//Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) return
        println(str)
    }
}

fun drawRectangle1(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")

    // Верхняя граница
    var topLine = "+"
    for (i in 1 until width - 1) {
        topLine += "-"
    }
    topLine += "+\n"
    print(topLine)

    // Боковые границы
    for (i in 1 until height - 1) {
        var middleLine = "|"
        for (j in 1 until width - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }

    // Нижняя граница
    var bottomLine = "+"
    for (i in 1 until width - 1) {
        bottomLine += "-"
    }
    bottomLine += "+\n"
    print(bottomLine)
}

fun drawRectangle2(width: Int, height: Int) {
    checkSize(width, height)

    printLine(createTopOrBottomLine(width))
    for (i in 1 until height - 1) {
        printLine(createMiddleLine(width))
    }
    printLine(createTopOrBottomLine(width))
}

private fun checkSize(width: Int, height: Int) {
    if (width <= 0) throw IllegalArgumentException("width должно быть положительным и больше нуля")
    if (height <= 0) throw IllegalArgumentException("height должно быть положительным и больше нуля")
}

private fun createTopOrBottomLine(width: Int): String {
    return "+" + "-".repeat(width - 2) + "+\n"
}

private fun createMiddleLine(width: Int): String {
    return "|" + " ".repeat(width - 2) + "|\n"
}

private fun printLine(line: String) {
    print(line)
}