package org.shevtsovla.kotlincourse.lesson32

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class TextToPhoneTest {

    @Test
    fun `convert 8 to +7`() {
        val actual = textToPhoneNumber("88005553535")
        Assertions.assertEquals("+7800553535",actual)
    }

    @Test
    fun`no special symbols`() {
        val actual = textToPhoneNumber("")
    }
}