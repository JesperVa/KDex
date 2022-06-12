package se.vallett.kdex.api.client.requests

abstract class DefaultRequest(private val parameters : List<Pair<String, String>> ) {

    abstract val defaultEndpoint : String

    //TODO add configured URL
    fun getRequest() : String = "https://api.mangadex.org/$defaultEndpoint${buildParameters()}"

    private fun buildParameters() : String = "?${generateParams()}"

    private fun generateParams() : String = parameters.joinToString("&") { (header, value) -> "$header=$value" }

    abstract class DefaultBuilder<out T : DefaultRequest> {
        protected val queryParams : ArrayList<Pair<String, String>> = ArrayList()

        protected fun addQueryParam(param : String, value : String) {
            queryParams.add(Pair(param, value))
        }

        protected fun addQueryParam(param : String, value : Any) {
            queryParams.add(Pair(param, value.toString()))
        }

        protected fun addQueryParam(param : String, value : Enum<*>) { queryParams.add(Pair(param, value.name)) }

        protected fun addQueryParam(param : String, values : Iterable<*>) {
            values.forEach{value -> queryParams.add(Pair("$param[]", value.toString())) }
        }

        abstract fun build() : T
    }
}