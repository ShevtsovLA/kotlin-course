package org.shevtsovla.kotlincourse.lesson20.homework

abstract class ProgrammableDevice : PowerableDevice(), Programmable {

    private var currentProgram: String? = null

    override fun programAction(action: String) {
        currentProgram = action
        println("Программа \"$action\" установлена.")
    }

    override fun execute() {
        if (isOn()) {
            if (currentProgram != null) {
                println("Выполняется программа \"$currentProgram\".")
            } else {
                println("Нет установленной программы для выполнения.")
            }
        } else {
            println("Оборудование выключено. Включите его, чтобы выполнить программу.")
        }
    }

    // Метод для сброса программы
    fun resetProgram() {
        currentProgram = null
        println("Программа сброшена.")
    }
}