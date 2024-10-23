package org.shevtsovla.kotlincourse.lesson15

class Car(
    val brand: String,
    val model: String
) {
    companion object {
        val brandList = listOf("Audi", "VW", "BMW", "Lada")
    }

    fun sayMyName() {
        println("I am $brand $model.")
    }

}