package org.shevtsovla.kotlincourse.lesson17.homework

import kotlin.math.pow

open class GeometricFigure(
    val name: String
) {
    open fun getArea(): Double = 0.0
    open fun getPerimeter(): Double = 0.0
}
open class Polygon(
    name: String,
    val sides: Int
) : GeometricFigure(name)

class Triangle(
    val side1: Double,
    val side2: Double,
    val side3: Double
) : Polygon("Triangle", 3) {
    override fun getPerimeter(): Double = side1 + side2 + side3
}

class Quadrilateral(
    val side1: Double,
    val side2: Double,
    val side3: Double,
    val side4: Double
) : Polygon("Quadrilateral", 4) {
    override fun getPerimeter(): Double = side1 + side2 + side3 + side4
}

class Circle(
    val radius: Double
) : GeometricFigure("Circle") {
    override fun getArea(): Double = Math.PI * radius.pow(2.0)
    override fun getPerimeter(): Double = 2 * Math.PI * radius
}