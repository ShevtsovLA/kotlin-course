package org.shevtsovla.kotlincourse.lesson17.homework


open class EducationalInstitution(
    val name: String,
    val location: String
)

class School(
    name: String,
    location: String,
    val schoolType: String
) : EducationalInstitution(name, location)


open class University(
    name: String,
    location: String,
    val numFaculties: Int
) : EducationalInstitution(name, location)


class College(
    name: String,
    location: String,
    numFaculties: Int,
    val numPrograms: Int
) : University(name, location, numFaculties)
