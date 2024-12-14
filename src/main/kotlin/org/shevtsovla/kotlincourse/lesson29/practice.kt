package org.shevtsovla.kotlincourse.lesson29

import java.time.*

fun main() {

    val currentTime = Instant.now()
    val myTime = Instant.ofEpochSecond(123456789)
    println(myTime)

    val dayOne = LocalDate.of(2024, 9, 1)
    val dayTwo = LocalDate.of(2025, 5, 31)
    val difference = Period.between(dayOne, dayTwo)
    println(difference)

    val dayThree = Period.of(4, 2, 228)
    println(dayTwo.plus(dayThree))

    val schedule = ZonedDateTime.of(2024, 12, 16,  10, 0, 0, 0, ZoneId.of("Europe/Moscow"))
    println(schedule)

    println(dayThree.multipliedBy(2))

}