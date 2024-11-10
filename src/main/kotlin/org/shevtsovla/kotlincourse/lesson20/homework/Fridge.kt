package org.shevtsovla.kotlincourse.lesson20.homework

class Fridge(
    override val maxTemperature: Int
) : TemperatureRegulatableAndOpenableDevice(maxTemperature) {

    private var isDoorOpen = false

    override fun open() {
        if (!isDoorOpen) {
            isDoorOpen = true
            println("Холодильник открыт.")
        } else {
            println("Холодильник уже открыт.")
        }
    }

    override fun close() {
        if (isDoorOpen) {
            isDoorOpen = false
            println("Холодильник закрыт.")
        } else {
            println("Холодильник уже закрыт.")
        }
    }

    override fun programAction(action: String) {
        if (isOn()) {
            println("Выбираем режим $action")
        } else {
            println("Холодильник выключен.")
        }
    }

    override fun setTemperature(temp: Int) {
        if (isOn()) {
            super.setTemperature(temp)
        } else {
            println("Холодильник выключен.")
        }
    }
}
