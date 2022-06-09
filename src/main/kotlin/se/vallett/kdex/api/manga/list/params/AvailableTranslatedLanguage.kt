package se.vallett.kdex.api.manga.list.params

import se.vallett.kdex.api.client.params.IArrayQueryParam

class AvailableTranslatedLanguage : IArrayQueryParam<String> {
    override val queryParamName: String
        get() = "availableTranslatedLanguage"
}