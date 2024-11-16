package org.shevtsovla.kotlincourse.lesson21.homework21

class OddValidator : Validator<Int> {
    override fun validate(value: Int): Boolean {
        return value % 2 == 0
    }
}