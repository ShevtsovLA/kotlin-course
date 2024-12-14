package org.shevtsovla.kotlincourse.lesson28.homework28

import java.io.File

fun main() {

    //Задача 1
    //Создайте текстовый файл workspace/task1/example.txt
    //запишите в него строку "Hello, Kotlin!", а затем проверьте, существует ли файл.

    val file1 = File("workspace/task1/example.txt")

    file1.parentFile.mkdirs()

    file1.createNewFile()


    file1.writeText("Hello, Kotlin!")

    if (file1.exists()) {
        println("Файл существует")
    } else {
        println("Файл не найден")
    }

    //Задача 2
    //Создайте директорию workspace/task2/testDir
    //проверьте, является ли она директорией, и выведите её абсолютный путь.

    val directory1 = File("workspace/task2/testDir")

    directory1.mkdirs()

    if (directory1.isDirectory) {
        println("Путь является директорией.\n${directory1.absolutePath}")
    } else {
        println("Путь не является директорией.")
    }

    //Задача 3
    //Создайте директорию workspace/task3/structure.
    //Внутри директории structure создайте папку myDir с двумя вложенными поддиректориями subDir1 и subDir2.
    //Проверьте, что myDir действительно содержит эти поддиректории.

    val directory2 = File("workspace/task3/structure")
    directory2.mkdirs()

    val myDir = File(directory2, "myDir")
    myDir.mkdir()

    val subDir1 = File(myDir, "subDir1")
    val subDir2 = File(myDir, "subDir2")
    subDir1.mkdir()
    subDir2.mkdir()

    val subDirs = myDir.listFiles()
    subDirs?.forEach { file ->
        println(file.name)
    }

    //Задача 4
    //Создайте директорию workspace/task4/temp.
    //Внутри директории temp создайте несколько вложенных файлов и директорий.
    //Удалите директорию workspace/task4 со всем содержимым

    val directory3 = File("workspace/task4/temp")
    directory3.mkdirs()

    File(directory3, "file1.txt").createNewFile()
    File(directory3, "file2.txt").createNewFile()
    File(directory3, "subDir1").mkdir()
    File(directory3, "subDir2").mkdir()

    File("workspace/task4").deleteRecursively()
    println("Директория workspace/task4 успешно удалена со всем содержимым.")

    //Задача 5
    //Создайте файл workspace/task5/config/config.txt
    //запишите в него список параметров (в формате ключ=значение),
    // а затем прочитайте файл и выведите только значения.




}