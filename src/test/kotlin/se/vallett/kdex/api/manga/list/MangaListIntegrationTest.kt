package se.vallett.kdex.api.manga.list

import io.ktor.client.HttpClient
import io.ktor.http.isSuccess
import kotlin.test.AfterTest
import kotlin.test.assertTrue
import org.junit.jupiter.api.AfterAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import se.vallett.kdex.api.client.KDexClient
import se.vallett.kdex.api.manga.list.paramvalues.MangaStatus
import se.vallett.kdex.tags.IntegrationTest

@IntegrationTest
class MangaListIntegrationTest {

    private val client : KDexClient = KDexClient()

    @AfterTest
    fun closeConnections() {
        client.close()
    }

    @Test
    fun testMangaListCall() {
        val list = MangaList.Builder().limit(1).year(2022).status(listOf( MangaStatus.COMPLETED)).build()

        val response = client.searchManga(list)

        assertTrue(response.status.isSuccess())
    }

}