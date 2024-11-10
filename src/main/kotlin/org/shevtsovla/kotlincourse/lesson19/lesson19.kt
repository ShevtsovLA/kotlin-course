package org.shevtsovla.kotlincourse.lesson19

class Account(private var balance: Double) {
    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun getBalance(): Double {
        return balance
    }
}

open class Person(private val name: String, protected val age: Int) {

    // Публичный метод
    fun greet() {
        println("Привет, меня зовут $name.")
    }

    // Защищённый метод
    protected fun getName(): String {
        return name
    }

    // Приватный метод
    private fun secret() {
        println("Это секретный метод.")
    }
}

class Student(name: String, age: Int, val studentId: Int) : Person(name, age) {

    // Публичный метод
    fun study() {
        // Используем защищённый метод getName() из родительского класса
        println("${getName()} учится.")
    }

    fun showAge() {
        // Обращаемся к защищённому полю age из родительского класса
        println("Мне $age лет.")
    }

    fun tryAccessSecret() {
        // Попытка вызвать приватный метод secret() из родительского класса
        // secret() // Ошибка компиляции: метод secret() недоступен
    }
}

fun main() {
    val account = Account(0.0)

    val student = Student("Ivan", 19, 1488)

    student.showAge()
}