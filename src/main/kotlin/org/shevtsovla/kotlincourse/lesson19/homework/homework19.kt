package org.shevtsovla.kotlincourse.lesson19.homework

fun main() {
    val child = ChildrenClass(
        "privateVal",
        "protectedVal",
        "publicVal"
    )
    child.publicField = "Антонио Бандерас"
    child.updateProtectedField("Леонардо Ди Каприо")
    child.setPrivateField("Александр Молокович")
    println(child.getAll())

}