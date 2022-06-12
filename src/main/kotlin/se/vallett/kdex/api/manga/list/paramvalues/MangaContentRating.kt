package se.vallett.kdex.api.manga.list.paramvalues

import se.vallett.kdex.api.NamedSerializableValue

enum class MangaContentRating : NamedSerializableValue {
    SAFE,
    SUGGESTIVE,
    EROTICA,
    PORNOGRAPHIC;

    override val serializedName: String = name.lowercase()
}