package org.shevtsovla.kotlincourse.lesson15

class Wind (val speed: Int) {

    fun convertSped (): Int {
        return speed * 1000 / 3600
    }
}