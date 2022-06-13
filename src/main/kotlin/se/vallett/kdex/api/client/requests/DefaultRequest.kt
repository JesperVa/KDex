package se.vallett.kdex.api.client.requests

import se.vallett.kdex.api.parameters.Parameters
import se.vallett.kdex.api.parameters.ParametersBuilder

abstract class DefaultRequest(private val parameters: Parameters) {
    abstract val defaultEndpoint: String

    // TODO add configured URL
    fun getRequest(): String = "https://api.mangadex.org/$defaultEndpoint?${parameters.asString()}"

    abstract class DefaultBuilder<out T : DefaultRequest> {
        internal val parameters = ParametersBuilder()

        protected fun addQueryParam(param: String, value: String) {
            parameters[param] = value
        }

        protected fun addQueryParam(param: String, value: Any) {
            parameters[param] = value
        }

        abstract fun build(): T
    }
}