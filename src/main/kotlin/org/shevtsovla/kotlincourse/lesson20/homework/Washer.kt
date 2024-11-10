package org.shevtsovla.kotlincourse.lesson20.homework

class Washer(
    maxTemperature: Int
) : TemperatureRegulatableAndOpenableDevice(maxTemperature), Drainable, Timable {

    private var isDrainConnected = false
    private var isDoorOpen = false

    override fun open() {
        if (!isDoorOpen) {
            isDoorOpen = true
            println("Стиралка открыта.")
        } else {
            println("Стиралка уже открыта.")
        }
    }

    override fun close() {
        if (isDoorOpen) {
            isDoorOpen = false
            println("Стиралка закрыта.")
        } else {
            println("Стиралка уже закрыта.")
        }
    }

    override fun programAction(action: String) {
        if (isOn()) {
            println("Выбираем режим стирки: $action")
        } else {
            println("Стиралка выключена.")
        }
    }

    override fun setTemperature(temp: Int) {
        if (isOn()) {
            super.setTemperature(temp)
        } else {
            println("Стиралка выключена.")
        }
    }

    override fun connectToDrain() {
        isDrainConnected = true
        println("Стиралка подключена к сливу.")
    }

    override fun drain() {
        if (isOn()) {
            println("Слив воды.")
        } else {
            println("Стиралка выключена.")
        }
    }

    override fun setTimer(time: Int) {
        if (isOn()) {
            println("Установлен таймер на $time минут.")
        } else {
            println("Стиралка выключена.")
        }
    }


}