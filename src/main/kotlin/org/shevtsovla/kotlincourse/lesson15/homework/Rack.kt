package org.shevtsovla.kotlincourse.lesson15.homework

class Rack (val amount: Int) {

    private val shelves: MutableList<MutableList<String>> = mutableListOf()

    fun addShelf(shelf: MutableList<String>): Boolean {
        return if (shelves.size < amount) {
            shelves.add(shelf)
            true
        } else {
            false
        }
    }



}