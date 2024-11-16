package org.shevtsovla.kotlincourse.lesson21.homework21

class ListHolder<T> {
    var list: MutableList<T> = mutableListOf()
    fun addElement(element: T) {list.add(element)}
    fun getElements(): List<T> {
        return list.toList()
    }

}