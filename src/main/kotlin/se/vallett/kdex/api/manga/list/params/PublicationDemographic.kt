package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IArrayQueryParam
import se.vallett.kdex.api.client.params.IValidatedQueryValues

class PublicationDemographic : IArrayQueryParam<String>, IValidatedQueryValues {
    override val queryParamName: String
        get() = "publicationDemographic"

    override fun validQueryValues(): Set<Any> {
        return setOf("shounen", "shoujo", "josei", "seinen", "none")
    }
}