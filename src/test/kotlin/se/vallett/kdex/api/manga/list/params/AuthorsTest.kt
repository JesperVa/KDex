package se.vallett.kdex.api.manga.list.params

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class AuthorsTest {

    @Test
    fun createParam() {
        val authors = Authors()

        val response = authors.createParam(arrayListOf("test", "test2"))

        assertEquals("authors[]=test&authors[]=test2", response)
    }
}