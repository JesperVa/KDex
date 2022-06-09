package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IDefaultQueryParam

class CreatedAtSince : IDefaultQueryParam<String> {
    override val queryParamName: String
        get() = "createdAtSince"
}