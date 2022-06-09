package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IArrayQueryParam
import se.vallett.kdex.api.client.params.IValidatedQueryValues

class ContentRating : IArrayQueryParam<String>, IValidatedQueryValues {
    override val queryParamName: String
        get() = "contentRating"

    override fun validQueryValues(): Set<Any> {
        return setOf("safe", "suggestive", "erotica", "pornographic")
    }
}