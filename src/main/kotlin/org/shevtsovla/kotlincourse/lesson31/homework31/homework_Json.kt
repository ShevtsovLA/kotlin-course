package org.shevtsovla.kotlincourse.lesson31.homework31

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.shevtsovla.kotlincourse.lesson30.homework.CharacterTypes
import java.io.File

fun main() {

    val dev1 = Employee(
        "Kirill",
        true,
        "1996-10-14",
        CharacterTypes.GAME_DEV
    )
    val dev2 = Employee(
        "Rafael",
        true,
        "1990-05-23",
        CharacterTypes.GAME_DEV
    )
    val back = Employee(
        "Mark",
        true,
        "1995-12-23",
        CharacterTypes.BACKEND_DEV
    )
    val tester = Employee(
        "Lev",
        true,
        "1995-12-07",
        CharacterTypes.QA
    )
    val teamLead1 = Employee(
        "Roman",
        true,
        "1987-07-06",
        CharacterTypes.TEAM_LEAD,
        listOf(dev1, back)
    )
    val teamLead2 = Employee(
        "Adam",
        true,
        "1992-04-05",
        CharacterTypes.TEAM_LEAD,
        listOf(dev2, tester)
    )
    val cto = Employee(
        "Alexander",
        true,
        "1984-10-02",
        CharacterTypes.CTO,
        listOf(teamLead1, teamLead2)
    )

    val gson = GsonBuilder().setPrettyPrinting().create()
    val json = gson.toJson(cto)

    val file = File("cto.json")
    file.writeText(json)

    val readJson = file.readText()

    val deserialization = gson.fromJson(readJson, Employee::class.java)

    println(deserialization)
}