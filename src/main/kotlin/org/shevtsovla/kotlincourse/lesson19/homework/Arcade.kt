package org.shevtsovla.kotlincourse.lesson19.homework

class Arcade(
    val color: String = "color",
    val model: String = "model",
    private var isOn: Boolean = false,
    private var isOsBooted: Boolean = false,
    private var gameList: List<String> = listOf(""),
    var hasJoystick: Boolean = false,
    private var balanceOfProceeds: Double = 0.0,
    val owner: String = "Owner",
    val supportPhoneNumber: String = "8(800)555-35-35"
    ) {

    fun turnOn(){
        isOn = true
    }

    fun turnOff() {
        shutdownOs()
        isOn = false
    }

    private fun bootOs() {
        if (isOn && !isOsBooted) {
            isOsBooted = true
            println("Операционная система загружена.")
        } else if (!isOn) {
            println("Включите автомат перед загрузкой ОС.")
        } else {
            println("ОС уже загружена.")
        }
    }

    private fun shutdownOs() {
        if (isOsBooted) {
            isOsBooted = false
            println("Завершение работы.")
        } else {
            println("ОС не была загружена.")
        }
    }

    fun showGameList(): List<String> {
        return gameList
    }

    fun startGame(gameName: String) {
        if (gameName in gameList) {
            println("Игра $gameName запущена.")
        } else {
            println("Игра $gameName недоступна")
        }
    }

    fun payToWin(cost: Double): Boolean {
        return if (cost >= 19.99) {
            balanceOfProceeds += cost
            println("Сеанс оплачен.")
            true
        } else {
            println("Недостаточно средств.")
            false
        }
    }

    fun openSafeAndWithdrawCash(amount: Double): Boolean {
        return if (amount <= balanceOfProceeds) {
            balanceOfProceeds -= amount
            println("Выдано из сейфа: $amount.")
            true
        } else {
            println("Недостаточно средств в сейфе.")
            false
        }
    }

    protected fun payWinnings(amount: Double): Boolean {
        return openSafeAndWithdrawCash(amount)
    }
}