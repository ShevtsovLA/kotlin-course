package org.shevtsovla.kotlincourse.lesson18.homework

abstract class Printer() {
    abstract fun print(text: String)

    protected fun splitText(text: String): List<String>{
        return text.split(" ")
    }
}

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = splitText(text)
        for (word in words) {
            println("${Colors.BLACK}${Background.WHITE}$word${Colors.RESET}${Background.RESET}")
        }
    }
}

class InkjetPrinter : Printer() {
    override fun print(text: String) {
        val words = splitText(text)
        var colorIndex = 0
        for (word in words) {
            val (textColor, backgroundColor) = Colors.colorPairs[colorIndex]
            println("$textColor$backgroundColor$word${Colors.RESET}")
            colorIndex = (colorIndex + 1) % Colors.colorPairs.size
        }
    }
}

fun main() {
    val text = "Возьми и съешь ещё этих мягких французских булок."

    val laserPrinter = LaserPrinter()
    val inkjetPrinter = InkjetPrinter()

    println("\nВывод лазерного принтера:")
    laserPrinter.print(text)

    println("\nВывод струйного принтера:")
    inkjetPrinter.print(text)

}