package org.shevtsovla.kotlincourse.lesson28

import java.io.File

fun main() {

    val file = "path/to/smth/file.txt"
    val directory = "path1/to/smth/"

}

fun createFileOrDirectory(path: String) {
    File(path).apply {
        if (path.endsWith("/")) {
            mkdirs()
        } else {
            parentFile.mkdirs()
            createNewFile()
        }
    }
}

fun writeDataToFile(data: Map<String, Double>, path: String) {
    val dataToString = data.map{ "${it.key}=${it.value}" }.joinToString("\n")
    createFileOrDirectory(path)
    File(path).writeText(dataToString)
}

fun readFileToMap(path: String): Map<String, Double> {
    val file = File(path).readLines()
    return file.associate {
        (it.split("="))[0] to (it.split("="))[1].toDouble()
    }
}
