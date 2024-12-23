package org.shevtsovla.kotlincourse.lesson31.homework31

import org.shevtsovla.kotlincourse.lesson30.homework.CharacterTypes

data class Employee(
    val name: String,
    val employed: Boolean,
    val birthday: String,
    val position: CharacterTypes,
    val listOfSubordinates: List<Employee> = listOf(),
)
