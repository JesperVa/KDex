package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IDefaultQueryParam

object Group : IDefaultQueryParam<String> {
    override val queryParamName: String
        get() = "group"
}