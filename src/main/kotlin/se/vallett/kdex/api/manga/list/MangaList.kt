package se.vallett.kdex.api.manga.list

import se.vallett.kdex.api.client.IRequestBuilder
import se.vallett.kdex.api.client.params.IQueryParam
import se.vallett.kdex.api.manga.list.params.Artists
import se.vallett.kdex.api.manga.list.params.Authors
import se.vallett.kdex.api.manga.list.params.AvailableTranslatedLanguage
import se.vallett.kdex.api.manga.list.params.CreatedAtSince
import se.vallett.kdex.api.manga.list.params.ExcludedOriginalLanguage
import se.vallett.kdex.api.manga.list.params.ExcludedTags
import se.vallett.kdex.api.manga.list.params.ExcludedTagsMode
import se.vallett.kdex.api.manga.list.params.Group
import se.vallett.kdex.api.manga.list.params.HasAvailableChapters
import se.vallett.kdex.api.manga.list.params.Ids
import se.vallett.kdex.api.manga.list.params.IncludedTags
import se.vallett.kdex.api.manga.list.params.IncludedTagsMode
import se.vallett.kdex.api.manga.list.params.Includes
import se.vallett.kdex.api.manga.list.params.Limit
import se.vallett.kdex.api.manga.list.params.Offset
import se.vallett.kdex.api.manga.list.params.OriginalLanguage
import se.vallett.kdex.api.manga.list.params.PublicationDemographic
import se.vallett.kdex.api.manga.list.params.Status
import se.vallett.kdex.api.manga.list.params.Title
import se.vallett.kdex.api.manga.list.params.UpdatedAtSince
import se.vallett.kdex.api.manga.list.params.Year

class MangaList(parameters : Iterable<String> = emptyList())  {
    val endPoint = "/manga"


    data class Builder(
        val parameters: ArrayList<String> = ArrayList()
    ) : IRequestBuilder<MangaList> {
        fun artists(artists : Iterable<String>) = apply { parameters.add(Artists.createParam(artists)) }
        fun authors(authors : Iterable<String>) = apply { parameters.add(Authors.createParam(authors)) }
        fun availableTranslatedLanguage(availableTranslatedLanguage: Iterable<String>) = apply { parameters.add(AvailableTranslatedLanguage.createParam(availableTranslatedLanguage)) }
        fun contentRating(contentRating: Iterable<String>) = apply { parameters.add(AvailableTranslatedLanguage.createParam(contentRating)) }
        fun createdAtSince(createdAtSince: String) = apply { parameters.add(CreatedAtSince.createParam(createdAtSince)) }
        fun excludedOriginalLanguage(excludedOriginalLanguage: Iterable<String>) = apply { parameters.add(ExcludedOriginalLanguage.createParam(excludedOriginalLanguage)) }
        fun excludedTags(excludedTags: Iterable<String>) = apply { parameters.add(ExcludedTags.createParam(excludedTags)) }
        fun excludedTagsMode(excludedTagsMode: ExcludedTagsMode.ExcludedTagsModeOption) = apply { parameters.add(ExcludedTagsMode.createParam(excludedTagsMode)) }
        fun includedTags(includedTags: Iterable<String>) = apply { parameters.add(IncludedTags.createParam(includedTags)) }
        fun includedTagsMode(includedTagsMode: IncludedTagsMode.IncludedTagsModeOption) = apply { parameters.add(IncludedTagsMode.createParam(includedTagsMode)) }
        fun includes(includes: Iterable<String>) = apply { parameters.add(Includes.createParam(includes)) }
        fun group(group: String) = apply { parameters.add(Group.createParam(group)) }
        fun hasAvailableChapters(hasAvailableChapters: String) = apply { parameters.add(HasAvailableChapters.createParam(hasAvailableChapters)) }
        fun ids(ids: Iterable<String>) = apply { parameters.add(Ids.createParam(ids)) }
        fun limit(limit: Int) = apply { parameters.add(Limit.createParam(limit)) }
        fun offset(offset: Int) = apply { parameters.add(Offset.createParam(offset)) }
        fun originalLanguage(originalLanguage: Iterable<String>) = apply { parameters.add(OriginalLanguage.createParam(originalLanguage)) }
        fun publicationDemographic(publicationDemographic: Iterable<String>) = apply { parameters.add(PublicationDemographic.createParam(publicationDemographic)) }
        fun status(status: Iterable<String>) = apply { parameters.add(Status.createParam(status)) }
        fun title(title: String) = apply { parameters.add(Title.createParam(title)) }
        fun updatedAtSince(updatedAtSince: String) = apply { parameters.add(UpdatedAtSince.createParam(updatedAtSince)) }
        fun year(year: Int) = apply { parameters.add(Year.createParam(year)) }

        override fun buildRequest() : MangaList {
            return MangaList(parameters)
        }


    }

}