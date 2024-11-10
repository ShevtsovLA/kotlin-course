package org.shevtsovla.kotlincourse.lesson20.homework

class Oven(
    maxTemperature: Int
) : TemperatureRegulatableAndOpenableDevice(maxTemperature),
Timable
{

    private var timer = 0
    private var isDoorOpen = false

    override fun open() {
        if (!isDoorOpen) {
            isDoorOpen = true
            println("Духовка открыта.")
        } else {
            println("Духовка уже открыта.")
        }
    }

    override fun close() {
        if (isDoorOpen) {
            isDoorOpen = false
            println("Духовка закрыта.")
        } else {
            println("Духовка уже закрыта.")
        }
    }

    override fun programAction(action: String) {
        if (isOn()) {
            println("Установите режим работы духовки: $action")
        } else {
            println("Духовка выключена.")
        }
    }

    override fun setTemperature(temp: Int) {
        if (isOn()) {
            super.setTemperature(temp)
        } else {
            println("Духовка выключена.")
        }
    }

    override fun setTimer(time: Int) {
        if (isOn()) {
            timer = time
            println("Таймер установлен на $timer минут.")
        } else {
            println("Духовка выключена.")
        }
    }
}