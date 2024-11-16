package org.shevtsovla.kotlincourse.lesson21.homework21

class StringValidator : Validator<String?> {
    override fun validate(value: String?): Boolean {
        return !value.isNullOrBlank()
    }
}