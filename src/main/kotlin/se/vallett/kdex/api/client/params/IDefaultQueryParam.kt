package se.vallett.kdex.api.client.params

interface IDefaultQueryParam<in T> : IQueryParam<T> {
    val queryParamName : String

    override fun createParam(queryParamValue: T) : String {
        if (this is IValidatedQueryValues) {
            validate(queryParamValue)
        }
        return "$queryParamName=$queryParamValue"
    }
}