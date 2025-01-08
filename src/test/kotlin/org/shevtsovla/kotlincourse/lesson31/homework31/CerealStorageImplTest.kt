package org.shevtsovla.kotlincourse.lesson31.homework31

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CerealStorageImplTest {

    private val storage = CerealStorageImpl(7f, 14f)

    @Test
    fun `throw if containerCapacity is negative`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(-1f, 1f)
        }
    }

    @Test
    fun `throw if storageCapacity is lower then containerCapacity`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            CerealStorageImpl(7f, 5f)
        }
    }

    @Test
    fun addCereal() = with(storage) {
        addCereal(Cereal.BUCKWHEAT, 1.5f)
        Assertions.assertEquals(1.5f,getAmount(Cereal.BUCKWHEAT))
    }

    @Test
    fun addExtraCereal() = with(storage) {
        addCereal(Cereal.PEAS, 1.4f)
        addCereal(Cereal.PEAS, 4.1f)
        Assertions.assertEquals(5.5f, getAmount(Cereal.PEAS))
    }

    @Test
    fun addMixedCereal() = with(storage) {
        addCereal(Cereal.RICE, 1.1f)
        addCereal(Cereal.BULGUR,2.2f)
        Assertions.assertAll(
            { Assertions.assertEquals(1.1f, getAmount(Cereal.RICE)) },
            { Assertions.assertEquals(2.2f, getAmount(Cereal.BULGUR)) }
        )
    }

    @Test
    fun  `should return 0 if container is not full`() = with(storage) {
        Assertions.assertEquals(0f, addCereal(Cereal.MILLET, 5.4f))
    }

    @Test
    fun `should return remains if amount of added cereal is bigger than container empty space`() = with(storage) {
        Assertions.assertEquals(0.1f, addCereal(Cereal.BULGUR, 7.1f), 0.01f)
    }

    @Test
    fun `should throw if cereal amount is negative`(): Unit = with(storage) {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            addCereal(Cereal.MILLET, -4f)
        }
    }

    @Test
    fun `should trow when storage don't have  space for new container`(): Unit = with(storage) {
        addCereal(Cereal.BULGUR, 5.5f)
        addCereal(Cereal.MILLET, 4.4f)
        Assertions.assertThrows(IllegalStateException::class.java) {
            addCereal(Cereal.RICE, 7.6f)
        }
    }

    @Test
    fun `should throw if cereal amount to get is negative`() {
        storage.addCereal(Cereal.BULGUR, 4f)
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            storage.getCereal(Cereal.BULGUR, -4f)
        }
    }

    @Test
    fun returnFalse() {
        val removed = storage.removeContainer(Cereal.BULGUR)
        assertFalse(removed)
    }

    @Test
    fun returnZero() {
        val amount = storage.getAmount(Cereal.BULGUR)
        assertEquals(0f, amount, 0.01f)
    }

    @Test
    fun returnCorrectAmount() {
        storage.addCereal(Cereal.RICE, 8f)
        val amount = storage.getAmount(Cereal.RICE)
        assertEquals(7f, amount, 0.01f)
    }

    @Test
    fun `should return the amount of cereal that can still fit in the container with current capacity`() {

        val remainingCapacity = storage.getSpace(Cereal.RICE)
        assertEquals(7f, remainingCapacity, 0.01f)

        storage.addCereal(Cereal.RICE, 4f)

        val updatedRemainingCapacity = storage.getSpace(Cereal.RICE)
        assertEquals(3f, updatedRemainingCapacity, 0.01f)


        storage.addCereal(Cereal.RICE, 3f)

        val finalRemainingCapacity = storage.getSpace(Cereal.RICE)
        assertEquals(0f, finalRemainingCapacity, 0.01f)
    }


}