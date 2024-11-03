package org.shevtsovla.kotlincourse.lesson17.homework

open class Furniture(
    val material: String,
    val color: String)


class Chair(
    material: String,
    color: String,
    val hasArmrest: Boolean
) : Furniture(material, color)


open class Table(
    material: String,
    color: String,
    val shape: String
) : Furniture(material, color)


class Desk(
    material: String,
    color: String,
    shape: String,
    val numDrawers: Int
) : Table(material, color, shape)
