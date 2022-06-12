package se.vallett.kdex.api.manga.list.paramvalues

import se.vallett.kdex.api.NamedSerializableValue

enum class MangaPublicationDemographic : NamedSerializableValue {
    SHOUNEN,
    SHOUJO,
    JOSEI,
    SEINEN,
    NONE;

    override val serializedName: String = name.lowercase()
}