package org.shevtsovla.kotlincourse.lesson24.homework24

class AnotherCustomExeption(
    cause: ArrayIndexOutOfBoundsException
) : RuntimeException(
    cause
) {
}