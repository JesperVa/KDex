package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IDefaultQueryParam

object HasAvailableChapters : IDefaultQueryParam<String> {
    override val queryParamName: String
        get() = "hasAvailableChapters"
}