package org.shevtsovla.kotlincourse.lesson18.homework

import kotlin.math.pow

abstract class Shape() {
    open fun area(): Double {
        return 0.0
    }
}
class Circle(
    val radius: Double
) : Shape() {
    override fun area(): Double {
        return Math.PI * radius.pow(2.0)
    }
}

class Square(
    val side: Double
) : Shape() {
    override fun area(): Double {
        return side.pow(2.0)
    }
}

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val angleAB: Double
) : Shape() {
    override fun area(): Double{
        return 0.5 * sideA * sideB * Math.sin(Math.toRadians(angleAB))
    }
}

fun main() {
    val shapes = listOf(
        Circle(6.9),
        Square(4.7),
        Triangle(4.7, 5.2, 60.0)
    )
    shapes.forEach { println(it.area())}
}