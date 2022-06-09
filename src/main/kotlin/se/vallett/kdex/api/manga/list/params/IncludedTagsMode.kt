package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IDefaultQueryParam

class IncludedTagsMode : IDefaultQueryParam<IncludedTagsMode> {

    enum class IncludedTagsModeOption {
        AND,
        OR,
    }

    override val queryParamName: String
        get() = "includedTagsMode"
}