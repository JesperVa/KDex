package se.vallett.kdex.api.client

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse
import io.ktor.utils.io.core.Closeable
import kotlinx.coroutines.runBlocking
import se.vallett.kdex.api.manga.list.MangaList

class KDexClient : IKDexClient, Closeable {
    private val client: HttpClient = HttpClient()

    /**
     * Returns an [io.ktor.client.statement.HttpResponse] based on a [MangaList] request
     *
     * See [Get search manga](https://api.mangadex.org/swagger.html#/Manga/get-search-manga)
     */
    override fun searchManga(mangaList: MangaList): HttpResponse = runBlocking {
        client.get(mangaList.getRequest())
    }

    override fun close() {
        client.close()
    }
}