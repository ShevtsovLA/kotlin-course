package org.shevtsovla.kotlincourse.lesson25

fun main() {

    val function1 = fun () {
        println("")
    }

    val function11: () -> Unit = {
        println("")
    }

    val function12 = {
        println("")
    }

    val function2 = fun (s: String): Int {
        return s.length
    }

    val function21: (s: String) -> Int = {
        it.length
    }

    val function22 = { s: String ->
        s.length
    }

    val function3 = fun String.(a: Int, b: Int): Boolean {
        println(this)
        println(a)
        println(b)
        return a == b
    }

    val function31: String.(Int, Int) -> Boolean = {a, b ->
        println(this)
        println(a)
        println(b)
        a == b
    }

    val function4 = fun(list: List<Int>): Int {
        return list.filter{ it > 0 }.sum()
    }

    val function41: (List<Int>) -> Int = { list ->
        list.filter{ it > 0 }.sum()
    }

    val function42 = { list: List<Int> ->
        list.filter{ it > 0 }.sum()
    }

    val function5 = fun Set<Int>.(): Set<Int> {
        return filter{ it % 2 == 0 }.toSet()
    }

    val function51: Set<Int>.() -> Set<Int> = {
        filter{ it % 2 == 0 }.toSet()
    }
    val set = setOf(1, 2, 3, 4)
    println(set.function51())

    println("Спасибо за урок!")

//    val function6 = fun<T> (arg: T) { низя!
//
//    }




}

fun function1() {
    println("")
}

fun function2(s: String): Int {
    return s.length
}

fun String.function3(a: Int, b: Int): Boolean {
    println(this)
    println(a)
    println(b)
    return a == b
}

fun function4(list: List<Int>): Int {
    return list.filter{ it > 0 }.sum()
}

fun Set<Int>.filterEven(): Set<Int> {
    return filter{ it % 2 == 0 }.toSet()
}

fun<T> function6(arg: T) {

}
