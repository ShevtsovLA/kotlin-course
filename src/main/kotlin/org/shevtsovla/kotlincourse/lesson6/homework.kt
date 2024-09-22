package org.shevtsovla.kotlincourse.lesson6

fun main(){

    fun getSeason(month: Int): String{
        return when(month){
            1, 2, 12 -> "Winter"
            in 3..5 -> "Spring"
            in 6..8 -> "Summer"
            in 9..11 -> "Autumn"
            else -> "Invalid month"
        }
    }

    fun convertToHumanAge(dogAge: Double): Double{
        return if(dogAge <= 2){
            dogAge * 10.5
        } else {
            2 * 10.5 + (dogAge - 2) * 4
        }
    }

    fun getTypeOfTransport(distance: Int): String{
        return if(distance <= 0){
            "Invalid distance"
        } else if(distance <= 1) {
            "On foot"
        } else if(distance in 2..5) {
            "Bike"
        } else {
            "Auto transport"
        }
    }

    fun calculateBonus(purchase: Int): Int{
        return if(purchase <= 1000){
            purchase / 100 * 2
        } else {
            purchase / 100 * 5
        }
    }

    fun checkFileType(extansion: String): String{
        return when(extansion) {
            "txt" , "doc" , "docx" -> "Text file"
            "png" , "jpeg" , "jpg", "bmp" -> "Picture"
            "xls" , "xlsx" -> "Chart"
            else -> "Unknown type"
        }
    }

    fun convertTemperature(temperature: Double, unit: String): String{
        return when (unit) {
            "C" -> {
                val resault = (temperature * 9/5) + 32
                "$resault F"
            }
            "F" -> {
                val resault = (temperature - 32) * 5/9
                "$resault C"
            }
            else -> "Invalid unit"
        }

    }

    fun recommendClothing(temperature: Int): String {
        return when (temperature){
            in -30..-1 -> "Coat and hat"
            in 0..15 -> "Windbreaker"
            in 16..35 -> "T-shirt and shorts"
            else -> "Stay at home"
        }

    }

    fun filmCategorie(age: Int): String {
        return if (age in 0..12) {
            "For kids"
        } else if (age in 13..17) {
            "For teens"
        } else if (age >= 18) {
            "+18"
        } else {
            "Wrong age"
        }
    }
}
