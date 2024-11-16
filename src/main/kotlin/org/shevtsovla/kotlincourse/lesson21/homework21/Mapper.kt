package org.shevtsovla.kotlincourse.lesson21.homework21

interface Mapper<T, R> {
    fun mapper(element: T): R
    fun mapperList(element: List<T>): List<R>
}