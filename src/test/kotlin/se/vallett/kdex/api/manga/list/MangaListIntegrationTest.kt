package se.vallett.kdex.api.manga.list

import io.kotest.matchers.booleans.shouldBeTrue
import io.ktor.http.isSuccess
import org.junit.jupiter.api.Test
import se.vallett.kdex.api.client.KDexClient
import se.vallett.kdex.api.manga.list.paramvalues.MangaStatus
import se.vallett.kdex.tags.IntegrationTest
import kotlin.test.AfterTest

@IntegrationTest
class MangaListIntegrationTest {
    private val client: KDexClient = KDexClient()

    @AfterTest
    fun closeConnections() {
        client.close()
    }

    @Test
    fun testMangaListCall() {
        val list = MangaList.Builder()
            .limit(1)
            .year(2022)
            .status(listOf(MangaStatus.COMPLETED))
            .build()
        val response = client.searchManga(list)

        response.status.isSuccess().shouldBeTrue()
    }
}