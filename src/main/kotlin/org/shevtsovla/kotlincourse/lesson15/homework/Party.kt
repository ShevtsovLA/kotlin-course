package org.shevtsovla.kotlincourse.lesson15.homework

class Party(
    var location: String,
    var attendees: Int
) {fun details() {
    println("The party will take place at $location and include $attendees persons.")
}
}