package org.shevtsovla.kotlincourse.lesson17.homework

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

class BottomMaterialContainer : Materials() {
    fun addMaterialToBottom(material: String) {
        val currentMaterials = extractMaterial().toMutableList()
        addMaterial(material)
        currentMaterials.forEach { addMaterial(it) }
    }
}

class ThroughTheLine : Materials() {
    fun alternation(newMaterials: List<String>) {
        val currentMaterials = extractMaterial()
        val maxSize = maxOf(newMaterials.size, currentMaterials.size)

        for (k in 0 until maxSize) {
            if (k < newMaterials.size) addMaterial(newMaterials[k])
            if (k < currentMaterials.size) addMaterial(currentMaterials[k])
        }
    }
}

class Alphabet : Materials() {
    fun addAlphabetically(material: String) {
        val currentMaterials = extractMaterial().toMutableList()
        currentMaterials.add(material)
        currentMaterials.sort()
        currentMaterials.forEach { addMaterial(it) }
    }
}

class DictionaryMaterialContainer : Materials() {
    fun addMaterialsFromMap(materialMap: Map<String, String>) {
        val keys = materialMap.keys.toList()  // Получаем список ключей
        val values = materialMap.values.toList()  // Получаем список значений

        // Добавляем ключи в начало контейнера
        keys.forEach { addMaterial(it) }
        // Добавляем значения в конец контейнера
        values.forEach { addMaterial(it) }
    }
}

fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val bottomContainer = BottomMaterialContainer()
    ordinalNumbers.forEach { bottomContainer.addMaterial(it) }
    bottomContainer.addMaterialToBottom("bottomMaterial")
    bottomContainer.printContainer()

    val throughTheLine = ThroughTheLine()
    ordinalNumbers.forEach { throughTheLine.addMaterial(it) }
    throughTheLine.alternation(listOf(
        "первый", "второй", "третий", "четвертый", "пятый",
        "шестой", "седьмой", "восьмой", "девятый", "десятый",
        "одиннадцатый", "двенадцатый", "тринадцатый", "четырнадцатый", "пятнадцатый",
        "шестнадцатый", "семнадцатый", "восемнадцатый", "девятнадцатый", "двадцатый")
    )
    throughTheLine.printContainer()

    val alphabet = Alphabet()
    ordinalNumbers.forEach { alphabet.addMaterial(it) }
    alphabet.addAlphabetically("something")
    alphabet.printContainer()

    val dictionaryContainer = DictionaryMaterialContainer()
    val testMap = mapOf("key1" to "value1", "key2" to "value2", "key3" to "value3")
    dictionaryContainer.addMaterialsFromMap(testMap)
    dictionaryContainer.addMaterial("existingMaterial")
    dictionaryContainer.printContainer()
}