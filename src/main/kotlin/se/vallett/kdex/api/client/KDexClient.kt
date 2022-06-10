package se.vallett.kdex.api.client

import io.ktor.client.HttpClient

object KDexClient : IKDexClient {
    val client : HttpClient = HttpClient()

    /**
     * Creates a builder for a Search Manga request
     *
     * See [Get search manga](https://api.mangadex.org/swagger.html#/Manga/get-search-manga)
     */
    override fun searchManga() {
    }
}