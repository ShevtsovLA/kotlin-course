package org.shevtsovla.kotlincourse.lesson27

import org.shevtsovla.kotlincourse.lesson23.homework23.getStringLengthOrZero

fun main() {

//    val list = mutableListOf(1, 2, 3, 4)
//
//    list.add(6)
//    println(list)
//
//    val list1 = list.toList()

    val list2 = with(mutableListOf(1, 2, 3, 4)) {
        add(7)
        println(this)
        toList()
    }

//    val sb = StringBuilder()
//
//    sb.append("What")
//    sb.append("the")
//    sb.append("fuck?")
//
//    val sbLength = sb.length

    val  sb = StringBuilder().run {
        append("What")
        append("the")
        append("fuck?")
        length
    }

    val list = arrayListOf<String>().apply {
        add("fdgjke")
        add("fgdospe;rf")
        add("fndisoe")
    }

    val list1 = arrayListOf<String>().also {
        it.add("fdgjke")
        it.add("fgdospe;rf")
        it.add("fndisoe")
    }

    val str: String? = null
    str?.let {
        it.length
        println(it.length)
        println(it.isEmpty())
        println(it.uppercase())
    }


}