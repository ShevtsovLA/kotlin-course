package org.shevtsovla.kotlincourse.lesson20.homework

abstract class TemperatureRegulatableAndOpenableDevice(
    override val maxTemperature: Int
) : ProgrammableDevice(), TemperatureRegulatable, Openable {

    protected var currentTemperature: Int = 0
    private var isOpen: Boolean = false

    override fun setTemperature(temp: Int) {
        if (!isOn()) {
            println("Устройство выключено. Включите его для установки температуры.")
            return
        }
        if (temp in 0..maxTemperature) {
            currentTemperature = temp
            println("Температура установлена на $currentTemperature°C.")
        } else {
            println("Недопустимая температура. Диапазон от 0 до $maxTemperature°C.")
        }
    }

    override fun open() {
        if (!isOpen) {
            isOpen = true
            println("Оборудование открыто.")
        } else {
            println("Оборудование уже открыто.")
        }
    }

    override fun close() {
        if (isOpen) {
            isOpen = false
            println("Оборудование закрыто.")
        } else {
            println("Оборудование уже закрыто.")
        }
    }

}