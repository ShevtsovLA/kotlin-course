package org.shevtsovla.kotlincourse.lesson13

fun main() {
//1. Проверить, что размер коллекции больше 5 элементов.
//size
//2. Проверить, что коллекция пустая.
//isEmpty
//3. Проверить, что коллекция не пустая.
//isNotEmpty
//4. Взять элемент по индексу или создать значение если индекса не существует.
// getOrElse
//5. Собрать коллекцию в строку.
//joinToString
//6. Посчитать сумму всех значений.
//sum
//7. Посчитать среднее.
//average
//8. Взять максимальное число.
//maxOrNull
//9. Взять минимальное число.
//minOrNull
//10. Взять первое число или null.
//firstOrNull
//11. Проверить что коллекция содержит элемент.
//contains

//1. Отфильтровать коллекцию по диапазону 18-30
//filter
//2. Выбрать числа, которые не делятся на 2 и 3 одновременно
//filterNot
//3. Очистить текстовую коллекцию от null элементов
//filterNotNull
//4. Преобразовать текстовую коллекцию в коллекцию длин слов
//map
// 5. Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
//associate
//6. Отсортировать список в алфавитном порядке
//sorted
//7. Отсортировать список по убыванию
//sortedDescending
//8. Распечатать квадраты элементов списка
//forEach
//9. Группировать список по первой букве слов
//groupBy
//10. Очистить список от дублей
//distinct
//11. Взять первые 3 элемента списка
//take
//12. Взять последние 3 элемента списка
//takeLast

//Написать метод, который принимает коллекцию чисел и возвращает строку с текущим состоянием коллекции используя конструкцию when
val collection1 = listOf(3, 12, 7, -5, 0)
    when {
        collection1.isEmpty() -> println("Пусто")
        collection1.size < 5 -> println("Короткая")
        collection1.firstOrNull() == 0 -> println("Стартовая")
        collection1.sum() > 10000 -> println("Массивная")
        collection1.average() == 10.0 -> println("Сбалансированная")
        collection1.joinToString("").length == 20 -> println("Клейкая")
        collection1.max() < -10 -> println("Отрицательная")
        collection1.min() > 1000 -> println("Положительная")
        collection1.contains(3) && collection1.contains(14) -> println("Пи***тая")
        else -> println("Уникальная")
    }

//Задание 3: Анализ Учебных Оценок
//Начальные значения: val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
//Цель: Отфильтровать удовлетворительные оценки (>=60), отсортировать оставшиеся по возрастанию и взять первые 3.

val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
println(
    grades.filter{it >= 60}
        .sorted()
        .take(3)
)

//Задание 4: Создание каталога по первой букве.
//Начальные значения: val list = listOf(
//"Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы",
//"Пуф", "книга", "Фоторамка", "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло",
//"занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
//"подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
//)
//Цель: Привести все слова в списке к нижнему регистру, сгруппировать в каталог по первой букве.

val list = listOf(
    "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик", "Вазон", "шторы",
    "занавеска", "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
    "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    println(list.map{it.lowercase()}.groupBy{it[0]})


//Задание 5: Подсчёт средней длины слов в списке.
//Начальные значения из задачи 4.
//Цель: Перевести все слова в количество букв, подсчитать среднее значение. Вывести форматированный текст с двумя знаками после запятой.

println("%.2f".format(list.map{it.length}.average()))

//Задание 6: Категоризация чисел.
//Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
//Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по четности (“четные” и “нечетные”).
val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(numbers.distinct().sortedDescending().groupBy {
        if (it % 2 == 0) "четные" else "нечетные"
    }
    )


//Задание 7: Поиск первого подходящего элемента
//Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60)
//Цель: Найти первый возраст в списке, который соответствует условию (больше 18), преобразовать его к строке,
//или вернуть сообщение "Подходящий возраст не найден".
val ages = listOf(22, 18, 30, 45, 17, null, 60)
println(ages.filterNotNull().firstOrNull{it > 18}?.toString() ?: "Подходящий возраст не найден")
}
