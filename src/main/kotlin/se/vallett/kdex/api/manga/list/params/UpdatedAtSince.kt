package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IDefaultQueryParam

class UpdatedAtSince : IDefaultQueryParam<String> {
    override val queryParamName: String
        get() = "updatedAtSince"
}