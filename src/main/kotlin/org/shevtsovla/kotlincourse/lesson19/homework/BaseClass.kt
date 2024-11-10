package org.shevtsovla.kotlincourse.lesson19.homework

abstract class BaseClass(
    // объясни, почему это поле доступно в main() для чтения из класса ChildrenClass
    // оно передается в ChildrenClass через publicVal, имеющий видимость.
    private val privateVal: String,
    // объясни, почему это поле недоступно в main()
    // protected делает поле недоступным извне, кроме класса и его наследников
    protected val protectedVal: String,
    val publicVal: String
) {

    var publicField = "измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "измени меня из функции main() через сеттер в наследнике"
    private var privateField = "добавь сеттер чтобы изменить меня из main()"

    protected fun setPrivateFieldValue(value: String) {
        privateField = value
    }

    protected fun getPrivateFieldValue(): String {
        return privateField
    }


    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // Объясни, почему эта функция не может быть публичной
    // Метод возвращает ProtectedClass(), который имеет видимость protected внутри BaseClass.
    // Если поменять на public, то будет осуществляться попытка вернуть объект, который не доступен для внешних взаимодействий.
    protected open fun getProtectedClass() = ProtectedClass()

    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // объясни, почему эта функция не может быть публичной или protected
    // так как возвращаемый класс private, то и метод должен быть private
    private fun getPrivateClass() = PrivateClass()

    protected class ProtectedClass

    private class PrivateClass
}

class ChildrenClass(
    val privateVal: String,
    protectedVal: String,
    // объясни, почему этот аргумент доступен в main() несмотря на то, что это не поле
    // он наследуется из BaseClass
    publicVal: String
) : BaseClass(privateVal, protectedVal, privateVal) {

    // объясни, почему в main() доступна функция getAll() хотя её здесь нет
    // так как наследует метод от BaseClass

    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    fun updateProtectedField(value: String) {
        protectedField = value
    }

    fun setPrivateField(value: String) {
        setPrivateFieldValue(value)
    }

    fun getPrivateField(): String {
        return getPrivateFieldValue()
    }

    // проверь, что выводится на печать при вызове функции printText()
    // и объясни, почему не происходит переопределение метода privatePrint()
    // printText() выводит "Печать из класса BaseClass"
    // переопределение не происходит, так как private методы не участвуют в наследовании
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }
}

