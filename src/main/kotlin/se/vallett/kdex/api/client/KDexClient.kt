package se.vallett.kdex.api.client

import io.ktor.client.HttpClient

object KDexClient : IKDexClient {
    val client : HttpClient = HttpClient();
}