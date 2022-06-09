package se.vallett.kdex.api.client.params

interface IQueryParam<in T> {
    fun createParam(queryParamValue : T) : String
}