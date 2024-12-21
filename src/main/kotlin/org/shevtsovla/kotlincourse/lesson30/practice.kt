package org.shevtsovla.kotlincourse.lesson30

enum class Seasons(val firstMonth: String, val isVolatileDuration: Boolean = false) {
    WINTER("December", true),
    SPRING("March"),
    SUMMER("June"),
    AUTUMN("September"),
    ;

    fun printInfo() {
        println("$this starts with $firstMonth. Season has ${if (isVolatileDuration) "volatile" else "not volatile"} duration.")
    }

    companion object {
        fun detectSeasonByMonth (month: String): Seasons {
            return Seasons.entries.firstOrNull { it.firstMonth == month } ?:
            throw IllegalArgumentException("This is not first month!")
        }
    }
}

interface HasValue {
    val value: String
}

interface HasAction {
    fun action()
}

enum class HomeDevices(
    override val value: String
): HasValue, HasAction {
    FRIDGE("Холодильник") {
        override fun action() {
            println("Freezing ice")
        }
    },
    WASHER("Стиралка") {
        override fun action() {
            println("Making brrrrrrr")
        }
    },
    TV("Телик"),
    ;

    override fun action() {
        println("Turning on $value")
    }
}


fun main() {

    Seasons.WINTER.printInfo()
    Seasons.AUTUMN.printInfo()
    //println(Seasons.detectSeasonByMonth("May"))

    HomeDevices.FRIDGE.action()
    HomeDevices.WASHER.action()
    HomeDevices.TV.action()

}

fun example(interface1: HasValue) {
    interface1.value
}