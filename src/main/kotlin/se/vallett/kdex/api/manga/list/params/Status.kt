package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IArrayQueryParam
import se.vallett.kdex.api.client.params.IValidatedQueryValues

object Status : IArrayQueryParam<String>, IValidatedQueryValues {
    override val queryParamName: String
        get() = "status"

    override fun validQueryValues(): Set<String> {
        return setOf("ongoing", "completed", "hiatus", "cancelled")
    }
}