package org.shevtsovla.kotlincourse.lesson14

fun main() {

//1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
//Определите среднее время выполнения теста.
val map1 = mapOf<String, Int>()
println("%.2f".format(map1.values.average()))
//2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов,
//а значения - строка с метаданными. Выведите список всех тестовых методов.
val map2 = mapOf<String, String>()
    println(map2.keys)
//3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
val map3 = mutableMapOf<String, String>()
    println(map3 + ("Test login" to "Passed"))
//4. Посчитайте количество успешных тестов в словаре с результатами.
println(map3.count{ it.value.contains("Passed")})
//5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
val map4 = mutableMapOf("bug1" to "open", "bug2" to "fixed")
    map4.remove("bug2")
    println(map4)
//6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
//выведите сообщение о странице и статусе её проверки.
val map6 = mapOf<String, String>("page1" to "200 OK", "page2" to "404 Not Found")
    for (entry in map6.entries) {
    println("${entry.key}: ${entry.value}")
    }
//7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
val map7 = mapOf<String, Double>()
    println(map7.filterValues {it > 0.1})
//8. В словаре хранятся результаты тестирования API (ключ — endpoint, предположите, значение — статус ответа в строке).
////Для указанного endpoint найдите статус ответа, если endpoint отсутствует, что он не был протестирован.
val map8 = mapOf<String, String>("endpoint1" to "200 OK", "endpoint2" to "500 Internal Error")
    val endpoint = "endpoint3"
    println(map8.getOrElse(endpoint) {"Not Tested"})

//9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации),
//получите значение для "browserType". Ответ не может быть null.
val map9 = mapOf("browserType" to "Chrome", "timeout" to "30s")
    println(map9["browserType"] ?: error("Value cannot be null"))
//10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, чтобы добавить новую версию.
val map10 = mapOf("v1.0" to "stable", "v1.1" to "beta")
    val updatedMap10 = map10.toMutableMap()
    updatedMap10["v2.0"] = "alpha"
    println(updatedMap10)
//11. Используя словарь с настройками тестирования для различных мобильных устройств (ключ — модель устройства),
//получите настройки для конкретной модели или верните настройки по умолчанию.
val map11 = mapOf("iPhone" to "iOS test", "Huawei" to "HarmonyOS test")
    val model = "Nokia"
    val defaultSettings = "Unknown"
    println(map11.getOrDefault(model, defaultSettings))

//12. Проверьте, содержит ли словарь с ошибками тестирования (код и описание) определенный код ошибки.
val map12 = mapOf(404 to "Not Found", 500 to "Internal Server Error")
    println(map12.keys.contains(404))

//13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
//а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь, оставив только те сценарии,
//идентификаторы которых соответствуют определённой версии тестов.
val map13 = mapOf("TestID_1" to "Passed", "TestID_2" to "Failed", "TestID_1_v2" to "Skipped")
    println(map13.filterKeys { it.contains("1") })

//14. У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
//Проверьте, есть ли модули с неудачным тестированием.
val map14 = mapOf("moduleA" to "Passed", "moduleB" to "Failed", "moduleC" to "Passed")
    println(map14.values.contains("Failed"))

//15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
val map15 = mutableMapOf("timeout" to "30s", "retries" to 3)
    val map151 = mapOf("browser" to "Chrome", "resolution" to "1080p")
    println(map15.putAll(map151))

//16. Объедините два неизменяемых словаря с данными о багах.
val map16= mapOf("bug1" to "open", "bug2" to "fixed")
    val map161 = mapOf("bug3" to "open")
    println(map16 + map161)

//17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
val map17 = mutableMapOf("testA" to "running", "testB" to "pending")
    println(map17.clear())

//18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”)
val map18 = mapOf("testA" to "Passed", "testB" to "Skipped", "testC" to "Failed")
    println(map18.filterValues { it != "Skipped" })

//19. Удалите из словаря с конфигурациями тестирования набор устаревших конфигураций.
val map19 = mutableMapOf("config1" to "active", "config2" to "deprecated")
    println(map19.entries.removeIf { it.value == "deprecated" })

//20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
//(ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
val map20 = map19.map { (testId, result) -> "Test ID: $testId, Result: $result" }
    println(map20)

//21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
val map21 = map3.toMap()
    println(map21)
//22. Преобразуйте словарь, содержащий ID теста и данные о времени выполнения тестов,
//заменив идентификаторы тестов на их названия (название можно получить вызвав фейковый метод,
//например getNameById(id: String))
val map22 = testIds.mapKeys { (id, _) -> getNameById(id) }
    println(map22)
//23. Для словаря с оценками производительности различных версий приложения увеличьте каждую оценку на 10%,
//чтобы учесть новые условия тестирования.
val map23 = mutableMapOf("v1.0" to 80, "v1.1" to 85)
    println(map23.replaceAll { _, score -> (score * 1.1).toInt() })

//24. Проверьте, пуст ли словарь с ошибками компиляции тестов.
val map24 = mapOf<Int, String>()
    println(map24.isEmpty())

//25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
val map25 = mapOf("testA" to "Passed")
    println(map25.isNotEmpty())

//26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
val map26 = map21.values.all { it == "Passed" }
    println(map26)

//27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
val map27 = map21.values.any { it == "Failed" }
    println(map27)

//28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты,
//которые не прошли успешно и содержат в названии “optional”
val map28 = mapOf("optionalTestA" to "Failed", "testB" to "Passed", "optionalTestC" to "Passed")
    println(map28.filter { it.key.contains("optional") && it.value != "Passed" })

}

val testIds = mapOf("123" to 120, "124" to 150)
fun getNameById(id: String) = when(id) {
    "123" -> "testA"
    "124" -> "testB"
    else -> "unknown"
}