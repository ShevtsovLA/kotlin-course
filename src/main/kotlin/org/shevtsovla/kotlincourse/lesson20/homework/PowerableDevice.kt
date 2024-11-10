package org.shevtsovla.kotlincourse.lesson20.homework

abstract class PowerableDevice() : Powerable {

    private var isPoweredOn: Boolean = false

    override fun powerOn() {
        if (!isPoweredOn) {
            isPoweredOn = true
            println("Оборудование включено.")
        } else {
            println("Оборудование уже включено.")
        }
    }

    override fun powerOff() {
        if (isPoweredOn) {
            isPoweredOn = false
            println("Оборудование выключено.")
        } else {
            println("Оборудование уже выключено.")
        }
    }

    // Дополнительный метод для проверки состояния оборудования
    fun isOn(): Boolean {
        return isPoweredOn
    }
}