package org.shevtsovla.kotlincourse.lesson30.homework

enum class TestStatus () {
    PASS,
    BROKEN,
    FAILURE,
    ;
}

enum class TypesOfResidentialRealEstate (val type: String) {
    HOUSE("Дом"),
    APARTMENT("Квартира"),
    ROOM("Комната"),
    ;
}

enum class SolarSystemPlanets (val distanceToTheSun: Double, val weight: Double) {
    MERCURY(0.4, 0.33),
    VENUS(0.7, 4.9),
    EARTH(1.0, 6.0),
    MARS(1.5, 0.6),
    JUPITER(5.2, 1900.0),
    SATURN(9.5, 570.0),
    URANUS(19.6, 87.0),
    NEPTUNE(30.0, 103.0),
    ;
}

fun printTypesOfResidentialRealEstate() {
    TypesOfResidentialRealEstate.entries
        .sortedBy { it.name.length }
        .forEach { println(it.type) }
}

fun testResult (test: () -> Unit): TestStatus {
    return try {
        test()
        TestStatus.PASS
    } catch (e: AssertionError) {
        TestStatus.FAILURE
    } catch (e: Exception) {
        TestStatus.BROKEN
    }
}

fun filter (function: (SolarSystemPlanets) -> Boolean): SolarSystemPlanets {
    return SolarSystemPlanets.entries.firstOrNull(function)
        ?: throw Exception ("Нет совпадений по указанным значениям")
}

fun main() {

    val firstPlanetStartingWithM = filter { it.name.startsWith("M") }
    println(firstPlanetStartingWithM)

    val noMatchingPlanet = filter { it.name.startsWith("Z") }
    println(noMatchingPlanet)

}