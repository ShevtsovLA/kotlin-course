package org.shevtsovla.kotlincourse.lesson23
fun main() {

    val obj: Any = "Hello, World!"

    if (obj is String) {
        println("Объект является строкой")
    }

    if (obj !is Int) {
        println("Объект не является целым числом")
    }

    if (obj is String) {
        // obj автоматически приведён к String
        println(obj.uppercase()) // Метод toUpperCase() доступен, т.к. obj теперь String
    }

    val num: Any = 123
//    val str: String = num as String

    val safeStr: String? = num as? String

    val t = if (num is String) {
        num as String
    } else {
        null
    }

    println(safeStr)

    val nullableStr: String? = "Kotlin"
    val nonNullableStr: String = nullableStr as String

    println(nonNullableStr)

    val mixedList: List<Any> = listOf("Kotlin", 42, 3.14, "Java", true)

    for (item in mixedList) {
        when (item) {
            is String -> println("$item - строка длиной ${item.length}")
            is Int -> println("$item - целое число")
            is Double -> println("$item - вещественное число")
            else -> println("Неизвестный тип")
        }
    }

    val flyingCar = FlyingCar()
    val car = Car()

    checkCapabilities(flyingCar)
    checkCapabilities(car)
}

interface Drivable {
    fun drive()
}

interface Flyable {
    fun fly()
}

class FlyingCar : Drivable, Flyable {
    override fun drive() {
        println("Едет как автомобиль")
    }

    override fun fly() {
        println("Летит как самолёт")
    }
}

class Car : Drivable {
    override fun drive() {
        println("Едет как автомобиль")
    }
}

fun checkCapabilities(drivable: Drivable) {
    drivable.drive()

    if (drivable is Flyable) {
        println("Этот объект также может летать!")
        drivable.fly()
    } else {
        println("Этот объект не может летать.")
    }
}
