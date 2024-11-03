package org.shevtsovla.kotlincourse.lesson18.homework

open class Animal() {
    open fun makeSound(){
        println("This animal makes no sound")
    }
}
class Dog : Animal() {
    override fun makeSound() {
        println("${Colors.YELLOW}This animal makes sound Bark!${Colors.RESET}")
    }
}
class Cat : Animal() {
    override fun makeSound() {
        println("${Colors.RED}This animal makes sound Meow!${Colors.RESET}")
    }
}
class Bird : Animal() {
    override fun makeSound() {
        println("${Colors.CYAN}This animal makes sound Meow!${Colors.RESET}")
    }
}

fun main(){
    val animals: List<Animal> = listOf(Dog(), Cat(), Bird(), Animal())
    animals.forEach { it.makeSound() }
}