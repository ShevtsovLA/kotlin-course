package org.shevtsovla.kotlincourse.lesson10

fun main() {
//Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел.
    val list1 = listOf<Int>()
//Задание 2: Создание и Инициализация Списка
//Создайте неизменяемый список строк, содержащий три элемента: например, ("Hello", "World", "Kotlin").
    val list2 = listOf("Hello", "World", "Kotlin")
//Задание 3: Создание Изменяемого Списка
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val list3 = mutableListOf(1, 2, 3, 4, 5)
//Задание 4: Добавление Элементов в Список
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val list4 = mutableListOf(1, 2, 3, 4, 5)
    list4.add(6)
    list4.add(7)
    list4.add(8)
    println(list4.toList())
//Задание 5: Удаление Элементов из Списка
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val list5 = mutableListOf("Hello", "World", "Kotlin")
    list5.remove("World")
    println(list5.toList())
//Задание 6: Перебор Списка в Цикле
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list6 = listOf(1, 6, 8, 3, 5)
    for (element in list6) {
        println("|$element|")
    }
//Задание 7: Получение Элементов Списка по Индексу
//Создайте список строк и получите из него второй элемент, используя его индекс.
    val list7 = listOf("Mama", "I'm", "programmer")
    println(list7[1])
//Задание 8: Перезапись Элементов Списка по Индексу
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
    val list8 = mutableListOf(14, 5, 7, -63)
    for (i in list8.indices) {
        list8[2] = 42
    }
    println(list8.toList())
//Задание 9: Объединение Двух Списков
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list9 = listOf("14", "Strange", "lifrs54")
    val list91 = listOf("88", "thing", "dp6oe7fg")
    val list92 = mutableListOf<String>()
    for (element in list9) {
        list92.add(element)
    }
    for (element in list91) {
        list92.add(element)
    }
    println(list92.toList())
//Задание 10: Нахождение Минимального/Максимального Элемента
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val list10 = listOf(23, 46, 12, -74, -22)
    var min = list10[0]
    var max = list10[0]
    for (element in list10) {
        if (element < min) {
            min = element
        }
        if (element > max) {
            max = element
        }
    }
    println("$min\n$max")
//Задание 11: Фильтрация Списка
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val list11 = listOf(1, 2, 3, 4, 5, 6)
    val list12 = mutableListOf<Int>()
    for (element in list11) {
        if (element % 2 == 0) {
            list12.add(element)
        }
    }
    println(list12.toList())

}