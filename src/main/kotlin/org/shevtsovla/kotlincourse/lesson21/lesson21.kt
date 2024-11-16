package org.shevtsovla.kotlincourse.lesson21

class BoxAny(private val item: Any) {
    fun getItem(): Any {
        return item
    }
}

class Box<TYPE>(private val item: TYPE) {

    fun getItem(): TYPE {
        return item
    }
}

fun main() {
    val appleBoxAny = BoxAny("Apple")
    val intBoxAny = BoxAny(42)

    println("В коробке: ${appleBoxAny.getItem()}") // В коробке: Apple
    println("В коробке: ${intBoxAny.getItem()}")   // В коробке: 42

    val appleBox = Box("Apple")
    val intBox = Box(42)

    println("В коробке: ${appleBox.getItem()}") // В коробке: Apple
    println("В коробке: ${intBox.getItem()}")   // В коробке: 42

    printItem("Hello")
    printItem(124)
    printItem(false)

    println(sum(5, 10))        // 15.0
    println(sum(3.5, 2.5))     // 6.0

    val gi = GenericIterator(2, listOf(3.5, 3f, 34L, 6))
    gi.elements[2]

}

fun <T> printItem(item: T): T {
    println("Элемент: $item")
    return item
}

fun <T: Number> sum(a: T, b: T): Double { // Number - Any в рамках чисел (класс, от которого наследуются Int, Double, Float, Long)
    return a.toDouble() + b.toDouble()
}

class GenericIterator<T : Number, R : Iterable<T>>(
    private val argument: T,
    val elements: R
) {

    fun printElements() {
        for (e in elements) {
            println(
                e.toString()
                    .repeat(argument.toInt())
            )
        }
    }
}