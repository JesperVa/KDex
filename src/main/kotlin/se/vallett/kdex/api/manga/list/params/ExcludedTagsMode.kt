package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IDefaultQueryParam

object ExcludedTagsMode : IDefaultQueryParam<ExcludedTagsMode.ExcludedTagsModeOption> {

    enum class ExcludedTagsModeOption {
        AND,
        OR,
    }

    override val queryParamName: String
        get() = "excludedTagsMode"
}