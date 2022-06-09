package se.vallett.kdex.api.client.params

interface IArrayQueryParam<in T> : IDefaultQueryParam<Iterable<T>> {

    override fun createParam(queryParamValue: Iterable<T>): String {
        if (this is IValidatedQueryValues) {
            validate(queryParamValue)
        }
        return combineParams(queryParamName, queryParamValue)
    }

    private fun combineParams(param : String, queryValues : Iterable<T>) : String {
        return queryValues.asSequence().map{ queryValue -> "$param[]=$queryValue" }.joinToString("&")
    }
}