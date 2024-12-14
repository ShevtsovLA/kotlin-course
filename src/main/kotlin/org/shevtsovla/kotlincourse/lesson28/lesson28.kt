package org.shevtsovla.kotlincourse.lesson28

import java.io.File

fun main() {

    val file = File("path/to/your/file.txt")
    val directory = File("path/to/your")

    file.parentFile.mkdirs() // mkdir() создаст одну директорию

    val isNewFileCreated: Boolean = file.createNewFile()
    if (isNewFileCreated) {
        println("Файл был создан")
    } else {
        println("Файл уже существует")
    }

    if (file.exists()) {
        println("Файл существует")
    } else {
        println("Файл не найден")
    }

    file.writeText("Hello, motherfucker!")

    val text = file.readText()
    println(text)

    (1..5).forEach {
        file.parentFile.resolve("$it").mkdirs()
    }

    val files = directory.listFiles()
    files?.forEach { file ->
        println(file.name) //name выводит только имя файла, без пути (непутю!)
    }

//    if (file.parentFile.delete()) {
//        println("Файл удален")
//    } else {
//        println("Не удалось удалить файл")
//    }
//
//    if (file.parentFile.deleteRecursively()) {
//        println("Директория и всё её содержимое удалено")
//    } else {
//        println("Не удалось удалить директорию")
//    }
//
//    file.walk().filter { it.isFile }
//        .associateWith { it.readLines() }
//        .filterValues { data ->
//            data.any { it.contains("text") }
//        }

    println(file.absoluteFile)

    val t: String = file.parent
    println(file.parent)

    val k: File = file.parentFile
    println(file.parentFile)

    val baseDir = File("path/to")
    val file1 = File("path/to/nested/file.txt")
    val relative = file1.toRelativeString(baseDir)
    println(file1.toRelativeString(baseDir))
    val baseDir2 = File("path2/to")
    val file3 = baseDir2.resolve(relative)
    file3.parentFile.mkdirs()
    file3.createNewFile()
}