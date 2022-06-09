package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IDefaultQueryParam

object Year : IDefaultQueryParam<Int> {
    override val queryParamName: String
        get() = "year"
}