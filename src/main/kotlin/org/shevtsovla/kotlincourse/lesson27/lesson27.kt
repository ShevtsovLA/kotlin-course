package org.shevtsovla.kotlincourse.lesson27

import java.io.File

fun main() {
    val list = mutableListOf(1, 2, 3)

    println(list.size)
    list.add(3)
    println(list.size)

    val l: MutableList<Int>.() -> Unit = {
        println(size)
        list.add(3)
        println(size)
    }

    val result = with(list) {
        println(size)
        list.add(3)
        println(size)
        "hello"
    }
    println(result)

//    list.add(5)
//    val result1 = list.sum()

    val result2 = list.run {
        add(5)
        sum()
    }

    val s = File("example.txt").inputStream()
    val content = s.readBytes()
    println(content)
    s.close()

    File("example.txt").inputStream().use {
        val content = it.readBytes()
        println(content.size)
    }

    val list4 = mutableListOf<Int>().apply {
        add(1)
        add(2)
    }

    list.also {
        println("Добавляем 3 к списку $it")
    }.add(3)

    val str:String? = "Hello"
    str?.let {
        println(it.length)
    }

}