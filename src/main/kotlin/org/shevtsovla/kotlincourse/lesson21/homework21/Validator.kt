package org.shevtsovla.kotlincourse.lesson21.homework21

interface Validator<T> {
    fun validate(value: T): Boolean
}