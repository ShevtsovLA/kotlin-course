package org.shevtsovla.kotlincourse.lesson26

fun processWebData(
    query: String,
    fetcher: (String) -> List<Map<String, Any>>,
    transformer: (List<Map<String, Any>>) -> List<User>,
    displayer: (List<User>) -> Unit
) {
    val rawData = fetcher(query)
    val transformedData = transformer(rawData)
    displayer(transformedData)
}

data class User(val name: String)

fun function1(
    function11: () -> Unit
) {}

fun function2(
    function21: (Int) -> String
) {
    println(function21(42))
}

fun<T> function3(
    list: List<T>,
    function31:(List<T>) -> T
): T {
    return function31(list)
}

fun main() {
    val smth1: (Int) -> String = {
        it.toString() + "3"
    }
    function2(smth1)

    val smth2: (Int) -> String = {
        "${ it + 3 }"
    }
    function2(smth2)


}