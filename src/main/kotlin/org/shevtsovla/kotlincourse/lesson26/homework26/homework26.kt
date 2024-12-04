package org.shevtsovla.kotlincourse.lesson26.homework26

fun function1(
    arg1: () -> Unit
) {}

fun function2(
    arg1: (String) -> Int
) {}

fun function3(
    arg1: Int.(String) -> Boolean
) {}

fun function4(
    arg1: (Double),
    arg2: (Double) -> Boolean
) {}

fun<T> function5(
    arg1: (T) -> List<T>
){}

fun function6(
    arg1: (String) -> (Int) -> Boolean
) {}

fun function7(
    arg1: List<Int>,
    arg2: Set<String>,
    arg3: (List<Int>, Set<String>) -> Map<String, Int>
) {}

fun function8(
    arg1: Int,
    arg2: (Int) -> String
): String {
    return ""
}

fun function9(
    arg1: () -> () -> Unit
) {}

fun filterStrings(
    strings: List<String>,
    filterNew: (String) -> Boolean
): List<String> {
    return strings.filter(filterNew)
}

fun applyToNumbers(
    numbers: List<Number>,
    transform: (Number) -> Number
): List<Number> {
    return numbers.map(transform)
}

fun sumByCondition(
    numbers: List<Number>,
    controller: (Number) -> Boolean
): Number {
    return numbers.filter(controller).sumOf() { it.toDouble() }
}

fun<A, B> combineAndTransform(
    collection1: Collection<A>,
    collection2: Collection<A>,
    mixer: (Collection<A>) -> Collection<B>
): Collection<B> {
    val combined = collection1 + collection2
    return mixer(combined)
}


fun main() {

    println("Задания на разработку кода")
    println("\n---Task 1---")

    val strings = listOf("Это", "что-то", "странное")
    //Фильтр строк, длина которых больше 3.
    val result1 = filterStrings(strings) { it.length > 3 }
    println(result1)

    println("\n---Task 2---")

    val numbers1 = listOf(1, 1.1, 2, 2.2)
    // Преобразуем список возведением каждого числа в квадрат
    val result2 = applyToNumbers(numbers1) {
        it.toDouble() * it.toDouble()
    }
    println(result2)

    println("\n---Task 3---")

    val numbers2 = listOf(1, 2.2, 4, 3.01, 5.12, 3.3333)
    // Получим сумму чисел, которые больше 3.
    val result3 = sumByCondition(numbers2) { it.toDouble() > 2.0 }
    println(result3)
    //Получим сумму чисел, которые делятся на 2 без остатка.
    val result4 = sumByCondition(numbers2) { it.toDouble() % 2.0 == 0.0 }
    println(result4)
    //Получим сумму целых чисел.
    val result5 = sumByCondition(numbers2) { it is Int }
    println(result5)

    println("\n---Task 4---")

    val collection1 = listOf(1, 2, 3, 4)
    val collection2 = listOf(5, 6, 7, 8)
    //Преобразуем эти списки целых чисел в список строк.
    val result6 = combineAndTransform(collection1, collection2) { combined ->
        combined.map { "$it - число" }
    }
    println(result6)
    //Преобразуем в множество чисел
    val result7 = combineAndTransform(collection1, collection2) { combined ->
        combined.map { it.toDouble() * 1.1 }.toSet()
    }
    println(result7)



}