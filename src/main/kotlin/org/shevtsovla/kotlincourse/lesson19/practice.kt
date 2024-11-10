package org.shevtsovla.kotlincourse.lesson19

fun main() {
    val playStation = PlayStation()
    playStation.startGame("Tomb raider")
}

class Lamp() {

    private var isOn = false

    fun turnOn(){
        isOn = true
    }

    fun turnOff() {
        isOn = false
    }

}

open class GameConsole() {
    fun startGame(name: String){
        initHardware()
        loadGame(name)
    }

    protected open fun initHardware() {

    }

    private fun loadGame(name: String){

    }

}

class PlayStation : GameConsole(){
    override fun initHardware() {
        super.initHardware()
    }
}
//
//class Atm(
//    private var balance: Float = 0.0f
//) {
//
//    private var pin = "1984"
//
//    private fun checkPin(pin: String) {
//        if (pin != this.pin) throw Exception ("Wrong PIN")
//    }
//
//    fun deposit(amount: Float, pin: String){
//        checkPin(pin)
//
//    }
//
//    fun withdraw(amount: Float, pin: String): Float{
//        checkPin(pin)
//        if (amount <= balance) return balance
//    }
//
//    fun getBalance(pin: String): Float {
//        checkPin(pin)
//        return balance
//    }
//}

