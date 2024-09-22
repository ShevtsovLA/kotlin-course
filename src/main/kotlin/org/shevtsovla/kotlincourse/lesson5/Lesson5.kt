package org.shevtsovla.kotlincourse.lesson5

fun main() {

}

fun printDampedSoundIntensity(initialIntensity: Double, c: Double?){
    var effectiveDampingCoefficient = c ?: 0.5
    println(initialIntensity * effectiveDampingCoefficient)
}

fun printSiteLang(lang: String?){
    val defaultLang: String = "Eng"
    println(lang ?: defaultLang)
}


