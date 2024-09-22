package org.shevtsovla.kotlincourse.lesson5

fun main() {
    printDampedSoundIntensity(100.0, 0.75)
    printDampedSoundIntensity(100.0, null)
    calculateDeliveryCost(75.6, 34.3)
    calculateDeliveryCost(89.9, null)
    recordPressure("")
    recordPressure(null)
}


fun printDampedSoundIntensity(initialIntensity: Double, coefficient: Double?){
        val factor = coefficient ?: 0.5
        println(initialIntensity * factor)
}

fun calculateDeliveryCost(cost: Double, cargo: Double?) {
        val value = cargo ?: 50.0
        val insurance = value * 0.005
        println(cost + insurance)
}

fun recordPressure(report: String?) {
        println(report ?: throw Exception(""))
}

