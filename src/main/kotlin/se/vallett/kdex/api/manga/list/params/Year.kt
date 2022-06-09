package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IDefaultQueryParam

class Year : IDefaultQueryParam<Int> {
    override val queryParamName: String
        get() = "year"
}