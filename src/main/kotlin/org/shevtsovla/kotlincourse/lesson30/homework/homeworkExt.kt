package org.shevtsovla.kotlincourse.lesson30.homework

enum class Colors(val value: String) {
    RED_COLOR("\u001B[31m"),
    YELLOW_COLOR("\u001B[33m"),
    GREEN_COLOR("\u001B[32m"),
    RESET_COLOR("\u001B[0m")
}
const val LIGHT_SYMBOL = "\u25CF"

enum class TrafficLightSignal(
    val color: Colors,
    val duration: Long,
    val blinkTimes: Int?
) {
    RED(Colors.RED_COLOR, 4, null),
    YELLOW(Colors.YELLOW_COLOR, 2, null),
    GREEN(Colors.GREEN_COLOR, 4,4),
    ;
}

enum class CoffeeType(val cost: Double, val coffeeBase: String, val recommendedSugar: Int, val hasMilk: Boolean = false) {
    ESPRESSO(2.50, "Espresso", 0),
    LATTE(3.00, "Latte", 2, true),
    CAPPUCCINO(2.75, "Cappuccino", 1, true),
    AMERICANO(2.25, "Americano", 0),
    NESCAFE(1.2,"Nescafe classic", 1)
    ;

    fun description() = "The $coffeeBase ${if (hasMilk) "with" else "without"} milk costs \$$cost and is best with $recommendedSugar spoons of sugar."
}

enum class CharacterTypes(
    val favoriteCoffee: CoffeeType
) {
    CTO(CoffeeType.ESPRESSO),
    UX_UI(CoffeeType.LATTE),
    CRM(CoffeeType.CAPPUCCINO), // Customer Relationship Manager
    GAME_DEV(CoffeeType.LATTE),
    TEAM_LEAD(CoffeeType.ESPRESSO),
    BACKEND_DEV(CoffeeType.AMERICANO),
    PM(CoffeeType.CAPPUCCINO),
    SYSADMIN(CoffeeType.AMERICANO),
    QA(CoffeeType.NESCAFE)
}

fun chooseCoffee(client: CharacterTypes): CoffeeType {
    return client.favoriteCoffee
}


// Функция для отображения сигнала
fun showSignal(signal: TrafficLightSignal) {
    print("\r" + signal.color.value + LIGHT_SYMBOL + Colors.RESET_COLOR.value) // Выводим сигнал с возвратом каретки
}
fun clear() {
    print("\r    ")
}

fun blink(signal: TrafficLightSignal) {
    showSignal(signal)
    Thread.sleep(300)
    clear()
    Thread.sleep(300)
}

fun runLights() {
    while (true) {
        for (n in TrafficLightSignal.entries) {
            showSignal(n)
            Thread.sleep(n.duration * 1000)
            if (n.blinkTimes != null) {
                repeat(n.blinkTimes) {blink(n)}
            }
        }
    }
}

fun main() {
    runLights()

    val lev = CharacterTypes.QA
    println("For ${lev.name} I offer ${chooseCoffee(lev).description()}")

    val natali = CharacterTypes.CRM
    println("For ${natali.name} I offer ${chooseCoffee(natali).description()}")
}