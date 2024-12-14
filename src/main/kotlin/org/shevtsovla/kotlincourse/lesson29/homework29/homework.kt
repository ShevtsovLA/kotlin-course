package org.shevtsovla.kotlincourse.lesson29.homework29

import java.time.Instant
import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter
import java.time.temporal.Temporal
import java.time.*



fun main() {

    val timeMark = Instant.now()
    println(timeMark)

    val myBirthday = LocalDate.of(1995, 12, 7)

    val timeMark1 = LocalDate.now()
    val difference = Period.between(myBirthday, timeMark1)
    println(difference.years)

    val dateTimeForFormating = LocalDateTime.of(2024, 12, 14, 11, 23,42)
    println(formatDate(dateTimeForFormating))
    println(formatDateByIso(dateTimeForFormating))

    println(identifyGeneration(myBirthday))
    println(identifyGeneration(LocalDate.of(1997, 7, 12)))
    println(identifyGeneration(LocalDate.of(1964, 12, 31)))
    println(identifyGeneration(LocalDate.of(1997, 1, 1)))

    val formatDateToMonthAndDay = DateTimeFormatter.ofPattern("MM-dd")
    val date1 = LocalDate.of(2023, 2, 25)
    val date2 = LocalDate.of(2024, 2, 25)
    println(date1.plusDays(10).format(formatDateToMonthAndDay))
    println(date2.plusDays(10).format(formatDateToMonthAndDay))


}

fun formatDate (arg: Temporal) {
    when (arg) {
        is LocalDate -> arg.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
        is LocalTime -> arg.format(DateTimeFormatter.ofPattern("HH:mm:ss"))
        is LocalDateTime -> arg.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"))
        is ZonedDateTime -> arg.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ZZZ"))
        is OffsetDateTime -> arg.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss ZZZ"))
        else -> arg.toString()
    }.also { println(it) }
}

fun formatDateByIso(arg: Temporal) {
    when (arg) {
        is LocalDate -> arg.format(DateTimeFormatter.ISO_LOCAL_DATE)
        is LocalTime -> arg.format(DateTimeFormatter.ISO_DATE_TIME)
        is LocalDateTime -> arg.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
        is ZonedDateTime -> arg.format(DateTimeFormatter.ISO_ZONED_DATE_TIME)
        is OffsetDateTime -> arg.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME)
        else -> arg.toString()
    }.also { println(it) }
}

private val boomerStart = LocalDate.of(1946, 1,1)
private val boomerEnd = LocalDate.of(1964, 12, 31)
private val zoomerStart = LocalDate.of(1997, 1, 1)
private val zoomerEnd = LocalDate.of(2012, 12, 31)

fun identifyGeneration (date: LocalDate): String {
    return when {
        date.isAfter(
            boomerStart.minusDays(1)) && date.isBefore(boomerEnd.plusDays(1)
            ) -> "Бумер"
        date.isAfter(
            zoomerStart.minusDays(1)) && date.isBefore(zoomerEnd.plusDays(1)
            ) -> "Зумер"
        else -> "Не определено"
    }
}
