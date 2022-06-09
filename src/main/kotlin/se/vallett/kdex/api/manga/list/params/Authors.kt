package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IArrayQueryParam

object Authors : IArrayQueryParam<String> {
    override val queryParamName: String
        get() = "authors"
}