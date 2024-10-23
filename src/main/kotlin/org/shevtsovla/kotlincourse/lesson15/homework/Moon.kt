package org.shevtsovla.kotlincourse.lesson15.homework

object Moon {
    var phase: String = "First quarter"
        set(value) {
            field = value
            isVisible = value.lowercase() != "new moon"
        }

    private var isVisible: Boolean = true

    fun showPhase() {
        if (isVisible) {
            println("Луна видна. Текущая фаза: $phase.")
        } else {
            println("Луну не видно.")
        }
    }


}