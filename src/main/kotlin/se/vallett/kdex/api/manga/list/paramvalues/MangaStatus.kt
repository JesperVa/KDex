package se.vallett.kdex.api.manga.list.paramvalues

import se.vallett.kdex.api.NamedSerializableValue

enum class MangaStatus : NamedSerializableValue {
    ONGOING,
    COMPLETED,
    HIATUS,
    CANCELLED;

    override val serializedName: String = name.lowercase()
}