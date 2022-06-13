package se.vallett.kdex.api.client.requests

import se.vallett.kdex.api.NamedSerializableValue

abstract class DefaultRequest(private val parameters: List<Pair<String, String>>) {
    abstract val defaultEndpoint: String

    // TODO add configured URL
    fun getRequest(): String = "https://api.mangadex.org/$defaultEndpoint${buildParameters()}"

    private fun buildParameters(): String = "?${generateParams()}"

    private fun generateParams(): String = parameters.joinToString("&") { (header, value) -> "$header=$value" }

    abstract class DefaultBuilder<out T : DefaultRequest> {
        protected val queryParams: MutableList<Pair<String, String>> = ArrayList()

        protected fun addQueryParam(param: String, value: String) {
            queryParams.add(Pair(param, value))
        }

        protected fun addQueryParam(param: String, value: Any) {
            queryParams.add(Pair(param, value.toString()))
        }

        protected fun addQueryParam(param: String, value: Enum<*>) {
            queryParams.add(Pair(param, value.name))
        }

        @JvmName("addQueryParamSerializedName")
        protected fun <T> addQueryParam(param: String, value: T)
                where T : Enum<T>,
                      T : NamedSerializableValue {
            queryParams.add(Pair(param, value.serializedName))
        }

        protected fun addQueryParam(param: String, values: Iterable<Any>) {
            values.forEach { value ->
                val serializedValue = if (value is NamedSerializableValue) value.serializedName else value.toString()
                queryParams.add(Pair("$param[]", serializedValue))
            }
        }

        abstract fun build(): T
    }
}