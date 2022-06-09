package se.vallett.kdex.api.manga.list.params

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow
import org.junit.jupiter.api.assertThrows
import se.vallett.kdex.api.client.params.exceptions.InvalidParamValueException

internal class StatusTest {
    @Test
    fun testCreateParamFails() {
        val status = Status()

        assertThrows<InvalidParamValueException> {
            status.createParam(arrayListOf("test", "test2"))
        }
    }

    @Test
    fun testSuccessfulParams() {
        val status = Status()

        assertDoesNotThrow {
            status.createParam(arrayListOf("ongoing", "completed"))
        }
    }
}