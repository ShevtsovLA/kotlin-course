package org.shevtsovla.kotlincourse.lesson15.homework

class Emotion(
    var type: String,
    var intensity: Int
) {fun express() {
    val description = when (intensity) {
        in 1..3 -> "слабая"
        in 4..6 -> "средняя"
        in 7..10 -> "сильная"
        else -> "неизвестная"
    }
    println("Эмоция: $type, Интенсивность: $description.")
}
}