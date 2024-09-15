             package org.shevtsovla.org.shevtsovla.kotlincourse

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}
             val name: String ="Alice"

var age: Int = 28

const val G: Double = 9.98

lateinit var userInfo: String

val lazyValue: String by lazy {
    "What's goin' on?"
}
var speed: Double? = null

var count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
    }

val chassis: String = "12345abc"

var colour: String = "Purple"

var distance: Double = 0.0

lateinit var owner: String

const val WHEELS: Int = 4

val report: String by lazy {
    ""
}

var fuel: Double = 0.0
    get() = field
    set(value) {
        if (value > 0) field += value
    }















