package org.shevtsovla.kotlincourse.lesson15

data class User(val id: Int, val name: String)

fun main() {
    val user1 = User(1, "James")
    val user2 = user1.copy(name = "Sam")

    println(user1) // Output: User(id=1, name=James)
    println(user2) // Output: User(id=1, name=Sam)

}
