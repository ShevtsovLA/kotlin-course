package org.shevtsovla.kotlincourse.lesson27.homework27



fun<T> timeTracker(
    function: () -> T
): Pair<T,Long> {
    val start = System.currentTimeMillis()
    val result = function()
    val end = System.currentTimeMillis()
    return Pair(result, end - start)
}

fun personInfo(person: Person) {
    println("----- Person Info -----")
    println("Name: ${person.name}")
    println("Age: ${person.age}")
    println("Email: ${person.email}")
    println("-----------------------")
}

fun main() {

    println("---Task 1---")

    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }

    val (result, timeTaken) = timeTracker(myFunction)
    println("Время выполнения: $timeTaken мс")

    println("\n---Task 2---")

    val employee = Employee(
        name = "Lev Shevtsov",
        age = 29,
        position = "Lead design engineer"
    ).apply {
        email = "shevtsov@lit-uv.ru"
        department = "Development Department"
    }

    println("Name: ${employee.name}")
    println("Age: ${employee.age}")
    println("Position: ${employee.position}")
    println("Email: ${employee.email}")
    println("Department: ${employee.department}")

    println("\n---Task 3---")

    val person = Person(
        name = "Nataly",
        age = 27
    ).also {
        it.email = "nata@whatever.com"
        personInfo(it)
    }

    println("\n---Task 4---")

    val post = with(person) {
        Employee(
            name = this.name,
            age = this.age,
            position = "Barista"
        )
    }

    println("----- Employee Info -----")
    println("Name: ${post.name}")
    println("Age: ${post.age}")
    println("Position: ${post.position}")
    println("--------------------------")

    println("\n---Task 5---")

    val runEmployee = person.run {
        Employee(
            name = this.name,
            age = this.age,
            position = "Barista"
        ).apply {
            email = this@run.email
            department = "Office management"
        }
    }

    println("----- Employee Info -----")
    println("Name: ${runEmployee.name}")
    println("Age: ${runEmployee.age}")
    println("Position: ${runEmployee.position}")
    println("Email: ${runEmployee.email}")
    println("Department: ${runEmployee.department}")
    println("--------------------------")

    println("\n---Task 6---")

    val person1: Person? = null
    val employee1 = createEmployee(person1)
    println("Employee 1: $employee1")



}

fun createEmployee(person: Person?): Employee? {
    return person?.let {
        Employee(
            name = it.name,
            age = it.age,
            position = "Janitor"
        ).apply {
            email = it.email
            department = "Maintenance"
        }
    }
}