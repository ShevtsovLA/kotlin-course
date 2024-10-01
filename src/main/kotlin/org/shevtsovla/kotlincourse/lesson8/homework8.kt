package org.shevtsovla.kotlincourse.lesson8

fun main() {
    //Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
        extractDateTime("Пользователь вошел в систему -> 2021-12-01 09:48:23")

//    Задание 2: Маскирование Личных Данных
        maskData("4539 1488 0343 6467")

//    Задание 3: Форматирование Адреса Электронной Почты. Используй replace
        println(replaceElements("username@example.com"))

//    Задание 4: Извлечение Имени Файла из Пути
        fileNameAndType("C:/Пользователи/Документы/report.txt")

//    Задание 5: Создание Аббревиатуры из Фразы.
        println(createAbbreviation("Объектно-ориентированное программирование"))
}


fun extractDateTime(logString: String) {
    val index = logString.indexOf("->") + 2
    val date = logString.substring(index, index + 11)
    val time = logString.substring(index + 11, index + 20)

    println("$date \n $time")
}

fun maskData(number: String) {
    val lastDigits = number.substring(15)
    println("**** **** **** $lastDigits")
}

fun replaceElements(email: String): String {
    return email
        .replace("@", "[at]")
        .replace(".", "[dot]")
}

fun fileNameAndType(path: String) {
    println(path.substringAfterLast("/"))
}

fun createAbbreviation(phrase: String): String {
    var abbreviation = ""
    for (word in phrase.split(" ", "-")) {
        abbreviation += word[0].uppercaseChar()
    }
    return abbreviation
}


