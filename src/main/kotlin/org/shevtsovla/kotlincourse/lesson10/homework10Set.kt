package org.shevtsovla.kotlincourse.lesson10

fun main() {
//Задание 1: Создание Пустого Множества
//Создайте пустое неизменяемое множество целых чисел.
    val set1 = setOf<Int>()
//Задание 2: Создание и Инициализация Множества
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    val set2 = setOf(1, 2, 3)
//Задание 3: Создание Изменяемого Множества
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    val set3 = mutableSetOf("Kotlin", "Java", "Scala")
//Задание 4: Добавление Элементов в Множество
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    val set4 = mutableSetOf("Kotlin", "Java", "Scala")
    set4.add("Swift")
    set4.add("Go")
//Задание 5: Удаление Элементов из Множества
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    val set5 = mutableSetOf(1, 2, 3)
    set5.remove(2)
//Задание 6: Перебор Множества в Цикле
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    val set6 = setOf(5, 76, 13)
    for (number in set6) {
        println(number)
    }
//Задание 7: Проверка Наличия Элемента в Множестве
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка. Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    val set7 = setOf("Kotlin", "is", "fun")
    val set7String = findString(set7, "Kotlin")
    println(set7String) //функция в конце всех задач
//Задание 8: Объединение Двух Множеств
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.
    val set8 = setOf("mon", "tue", "wed", "thr", "fri")
    val set81 = setOf("tue", "wed", "sat", "sun")
    val set82 = mutableSetOf<String>()
    for (element in set8) {
        set82.add(element)
    }
    for (element in set81) {
        set82.add(element)
    }
    println(set82.toList())
//Задание 9: Нахождение Пересечения Множеств
//Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
    val set9 = setOf(43, 49, 51, 63)
    val set91 = setOf(15, 24, 43, 63)
    val set92 = mutableSetOf<Int>()
    for (element1 in set9) {
        for (element2 in set91) {
            if (element1 == element2)
                set92.add(element1)
        }
    }
    println(set92.toList())
//Задание 10: Нахождение Разности Множеств
//Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие в первом множестве, но отсутствующие во втором). Реши задачу через вложенные циклы и переменные флаги.
    val set10 = setOf("mon", "tue", "wed", "thr", "fri")
    val set101 = setOf("tue", "wed", "sat", "sun")
    val set102 = mutableSetOf<String>()
    for (element1 in set10) {
        for (element2 in set101) {
            if (element1 != element2)
                set102.add(element1)
        }
    }
    println(set102.toList())
//Задание 11: Конвертация Множества в Список
//Создайте множество строк и конвертируйте его в список с использованием цикла.
    val set11 = setOf("mon", "tue", "wed", "thr", "fri")
    val list11 = mutableListOf<String>()
    for (element in set11) {
        list11.add(element)
    }
    println(list11.toList())
}
//продолжение 7 задачи
fun findString(set7: Set<String>, searchString: String): Boolean {
    for (element in set7) {
        if (element == searchString) {
            return true
        }
    }
    return false
}