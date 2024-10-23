package org.shevtsovla.kotlincourse.lesson15.homework

class Concert(
    val band: String,
    val place: String,
    val price: Int,
    val capacity: Int
) {
    private var soldTickets = 1499

    fun details() {
        println("Soon at $place $band will take new show! Ticket price - $price.")
    }

    fun buyTicket() {
        if (soldTickets < capacity) {
            println(++soldTickets)
        } else {
            println("Sold out!")
        }
    }
}