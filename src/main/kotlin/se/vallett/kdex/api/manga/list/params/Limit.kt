package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IDefaultQueryParam

object Limit : IDefaultQueryParam<Int> {
    override val queryParamName: String
        get() = "limit"
}