package org.shevtsovla.kotlincourse.lesson20.homework

class Kettle(
    maxTemperature: Int = 100,
    override val capacity: Int
) : TemperatureRegulatableAndOpenableDevice(maxTemperature),
    WaterContainer
{
    private var currentWaterLevel = 0
    private var isKettleOpen = false

    override fun open() {
        if (!isKettleOpen) {
            isKettleOpen = true
            println("Чайник открыт.")
        } else {
            println("Чайник уже открыт.")
        }
    }

    override fun close() {
        if (isKettleOpen) {
            isKettleOpen = false
            println("Чайник закрыт.")
        } else {
            println("Чайник уже закрыт.")
        }
    }


    override fun setTemperature(temp: Int) {
        if (isOn()) {
            super.setTemperature(temp)
        } else {
            println("Включи чайник!")
        }
    }

    override fun fillWater(amount: Int) {
        if (amount <= 0) {
            println("Неверное количество для заполнения: $amount")
            return
        }
        if (currentWaterLevel + amount > capacity) {
            println("Нельзя добавить $amount мл воды. Превышена ёмкость чайника!")
        } else {
            currentWaterLevel += amount
            println("Чайник заполнен на $amount мл. Текущий уровень воды: $currentWaterLevel мл.")
        }
    }

    override fun getWater(amount: Int) {
        if (amount <= 0) {
            println("Неверное количество для получения: $amount")
            return
        }
        if (currentWaterLevel < amount) {
            println("Недостаточно воды! Доступно только $currentWaterLevel мл.")
        } else {
            currentWaterLevel -= amount
            println("Получено $amount мл воды. Остаток: $currentWaterLevel мл.")
        }
    }

    fun boilWater() {
        if (!isOn()) {
            println("Чайник выключен.")
            return
        }

        if (currentWaterLevel == 0) {
            println("Просто добавь воды.")
            return
        }

        println("Начинается кипячение...")
        setTemperature(100)
        println("Вода вскипела. Чайник автоматически выключится.")
        powerOff()
    }
}