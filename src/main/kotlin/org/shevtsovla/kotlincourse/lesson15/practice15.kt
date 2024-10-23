package org.shevtsovla.kotlincourse.lesson15

fun main() {
    var lamp1 = Lamp(true)
    lamp1.switch()

    var wind = Wind(10)
    println(wind.convertSped())

    var car1 = Car(Car.brandList[3], "m5")
    car1.sayMyName()

    println("Спасибо за урок!")

}