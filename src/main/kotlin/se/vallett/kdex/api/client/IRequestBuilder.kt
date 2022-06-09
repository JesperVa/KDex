package se.vallett.kdex.api.client

interface IRequestBuilder<T> {
    fun buildRequest() : T;
}