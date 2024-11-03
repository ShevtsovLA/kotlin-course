package org.shevtsovla.kotlincourse.lesson15.homework

class Shelf(val capacity: Int)

{
    private val items: MutableList<String> = mutableListOf()

    fun addItem(item: String): Boolean {
    return canAccommodate(item) && items.add(item)
    }

    fun removeItem(item: String): Boolean {
        return items.remove(item)

    }

    fun canAccommodate(item: String): Boolean {
        return items.sumOf{it.length} + item.length <= capacity
    }

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

    fun getList(): List<String> {
        return items.toList()
    }

}