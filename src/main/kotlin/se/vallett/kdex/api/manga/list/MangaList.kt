package se.vallett.kdex.api.manga.list

import se.vallett.kdex.api.client.requests.DefaultRequest
import se.vallett.kdex.api.manga.list.paramvalues.ExcludedTagsMode
import se.vallett.kdex.api.manga.list.paramvalues.IncludedTagsMode
import se.vallett.kdex.api.manga.list.paramvalues.MangaContentRating
import se.vallett.kdex.api.manga.list.paramvalues.MangaPublicationDemographic
import se.vallett.kdex.api.manga.list.paramvalues.MangaStatus

class MangaList(queryParams: List<Pair<String, String>>) : DefaultRequest(queryParams) {

    override val defaultEndpoint: String
        get() = "manga"

    class Builder : DefaultBuilder<MangaList>() {
        fun artists(artists : Iterable<String>) = apply { addQueryParam("artists", artists) }
        fun authors(authors : Iterable<String>) = apply { addQueryParam("authors", authors) }
        fun availableTranslatedLanguage(availableTranslatedLanguage: Iterable<String>) = apply { addQueryParam("availableTranslatedLanguage", availableTranslatedLanguage) }
        fun contentRating(contentRating: Iterable<MangaContentRating>) = apply { addQueryParam("contentRating", contentRating) }
        fun createdAtSince(createdAtSince: String) = apply { addQueryParam("createdAtSince", createdAtSince) }
        fun excludedOriginalLanguage(excludedOriginalLanguage: Iterable<String>) = apply { addQueryParam("excludedOriginalLanguage", excludedOriginalLanguage) }
        fun excludedTags(excludedTags: Iterable<String>) = apply { addQueryParam("excludedTags", excludedTags) }
        fun excludedTagsMode(excludedTagsMode: ExcludedTagsMode) = apply { addQueryParam("excludedTagsMode", excludedTagsMode) }
        fun includedTags(includedTags: Iterable<String>) = apply { addQueryParam("includedTags", includedTags) }
        fun includedTagsMode(includedTagsMode: IncludedTagsMode) = apply { addQueryParam("includedTagsMode", includedTagsMode) }
        fun includes(includes: Iterable<String>) = apply { addQueryParam("includes", includes) }
        fun group(group: String) = apply { addQueryParam("group", group) }
        fun hasAvailableChapters(hasAvailableChapters: Boolean) = apply { addQueryParam("hasAvailableChapters", hasAvailableChapters) }
        fun ids(ids: Iterable<String>) = apply { addQueryParam("ids", ids) }
        fun limit(limit: Int) = apply { addQueryParam("limit", limit) }
        fun offset(offset: Int) = apply { addQueryParam("offset", offset) }
        fun originalLanguage(originalLanguage: Iterable<String>) = apply { addQueryParam("originalLanguage", originalLanguage) }
        fun publicationDemographic(mangaPublicationDemographic: Iterable<MangaPublicationDemographic>) = apply { addQueryParam("publicationDemographic", mangaPublicationDemographic) }
        fun status(status: Iterable<MangaStatus>) = apply { addQueryParam("status", status) }
        fun title(title: String) = apply { addQueryParam("title", title) }
        fun updatedAtSince(updatedAtSince: String) = apply { addQueryParam("updatedAtSince", updatedAtSince) }
        fun year(year: Int) = apply { addQueryParam("year", year) }
        override fun build(): MangaList {
            return MangaList(queryParams)
        }
    }
}