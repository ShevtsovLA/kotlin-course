package org.shevtsovla.kotlincourse.lesson21.homework21

class ListValidator<T : Number?> : Validator<List<T?>> {
    override fun validate(value: List<T?>): Boolean {
        return value.all {
            it != null
            && it.toDouble() != 0.0
        }
    }
}