package se.vallett.kdex.api.client

import io.ktor.client.call.HttpClientCall
import io.ktor.client.statement.HttpResponse
import se.vallett.kdex.api.manga.list.MangaList

interface IKDexClient {
    fun searchManga(mangaList: MangaList): HttpResponse
}