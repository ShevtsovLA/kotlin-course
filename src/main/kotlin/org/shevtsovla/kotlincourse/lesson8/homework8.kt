package org.shevtsovla.kotlincourse.lesson8

fun main() {
    //Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
    val logString = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    extractDateTime(logString)

//    Задание 2: Маскирование Личных Данных
    val number = "4539 1488 0343 6467"
    maskData(number)

//    Задание 3: Форматирование Адреса Электронной Почты. Используй replace
    val email = "username@example.com"
    println(replaceElements(email))

//    Задание 4: Извлечение Имени Файла из Пути
    val path = "C:/Пользователи/Документы/report.txt"
    fileNameAndType(path)

//    Задание 5: Создание Аббревиатуры из Фразы.
    val phrase = "Объектно-ориентированное программирование"
    println(createAbbreviation(phrase))
}


fun extractDateTime(logString: String) {
    val index = logString.indexOf("->")
    val dateTime = logString.substring(index + 2).trim()  // Извлекаем всё, что находится после "->"
    println("$dateTime")
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


