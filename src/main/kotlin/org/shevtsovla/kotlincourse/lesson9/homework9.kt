package org.shevtsovla.kotlincourse.lesson9

//Поздравление с днём рождения!

fun main() {

    val name = "Саша"
    val celebration = "День рождения"
    val difficulties = 0
    println(congratulate(name, celebration, difficulties))
}

fun congratulate(name: String, celebration: String, difficulties: Int): String {
    val difficultiesPhrase = if (difficulties <= 0) "как можно меньше"
    else "не слишком много"

    return "Дорогой $name \n" +
            "У тебя сегодня $celebration! Желаю, чтобы в твоей жизни было $difficultiesPhrase трудностей и максимум радостных моментов. \n" +
            "Пусть каждый день радует стабильностью, успехами и новыми свершениями."

}