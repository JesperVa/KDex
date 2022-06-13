package se.vallett.kdex.api.manga.list

import org.junit.jupiter.api.Test
import se.vallett.kdex.api.manga.list.paramvalues.*
import se.vallett.kdex.shouldBeMangaUrl

internal class MangaListRequestTest {
    @Test
    fun testArtists() {
        val builder = MangaList.Builder()
        val request = builder.artists(listOf("test", "test2")).build().getRequest()

        request shouldBeMangaUrl "artists[]=test&artists[]=test2"
    }

    @Test
    fun testAuthors() {
        val builder = MangaList.Builder()
        val request = builder.authors(listOf("test", "test2")).build().getRequest()

        request shouldBeMangaUrl "authors[]=test&authors[]=test2"
    }

    @Test
    fun testLimit() {
        val builder = MangaList.Builder()
        val request = builder.limit(5).build().getRequest()

        request shouldBeMangaUrl "limit=5"
    }

    @Test
    fun testOffset() {
        val builder = MangaList.Builder()
        val request = builder.offset(5).build().getRequest()

        request shouldBeMangaUrl "offset=5"
    }

    @Test
    fun testTitle() {
        val builder = MangaList.Builder()
        val request = builder.title("Hakuna mantata").build().getRequest()

        request shouldBeMangaUrl "title=Hakuna mantata"
    }

    @Test
    fun testYear() {
        val builder = MangaList.Builder()
        val request = builder.year(2022).build().getRequest()

        request shouldBeMangaUrl "year=2022"
    }

    @Test
    fun testIncludedTags() {
        val builder = MangaList.Builder()
        val request = builder.includedTags(listOf("test", "test2")).build().getRequest()

        request shouldBeMangaUrl "includedTags[]=test&includedTags[]=test2"
    }

    @Test
    fun testIncludedTagsMode() {
        val builder = MangaList.Builder()
        val request = builder.includedTagsMode(IncludedTagsMode.AND).build().getRequest()

        request shouldBeMangaUrl "includedTagsMode=AND"
    }

    @Test
    fun tetExcludedTags() {
        val builder = MangaList.Builder()
        val request = builder.excludedTags(listOf("test", "test2")).build().getRequest()

        request shouldBeMangaUrl "excludedTags[]=test&excludedTags[]=test2"
    }

    @Test
    fun testExcludedTagsMode() {
        val builder = MangaList.Builder()
        val request = builder.excludedTagsMode(ExcludedTagsMode.AND).build().getRequest()

        request shouldBeMangaUrl "excludedTagsMode=AND"
    }

    @Test
    fun testStatus() {
        val builder = MangaList.Builder()
        val request = builder.status(listOf(MangaStatus.CANCELLED, MangaStatus.HIATUS)).build().getRequest()

        request shouldBeMangaUrl "status[]=cancelled&status[]=hiatus"
    }

    @Test
    fun testOriginalLanguage() {
        val builder = MangaList.Builder()
        val request = builder.originalLanguage(listOf("Swedish", "Norweigan")).build().getRequest()

        request shouldBeMangaUrl "originalLanguage[]=Swedish&originalLanguage[]=Norweigan"
    }

    @Test
    fun testExcludedOriginalLanguage() {
        val builder = MangaList.Builder()
        val request = builder.excludedOriginalLanguage(listOf("Swedish", "Norwegian")).build().getRequest()

        request shouldBeMangaUrl "excludedOriginalLanguage[]=Swedish&excludedOriginalLanguage[]=Norwegian"
    }

    @Test
    fun testAvailableTranslatedLanguage() {
        val builder = MangaList.Builder()
        val request = builder.availableTranslatedLanguage(listOf("Swedish", "Norweigan")).build().getRequest()

        request shouldBeMangaUrl "availableTranslatedLanguage[]=Swedish&availableTranslatedLanguage[]=Norweigan"
    }

    @Test
    fun testPublicationDemographic() {
        val builder = MangaList.Builder()
        val request = builder.publicationDemographic(
            listOf(
                MangaPublicationDemographic.SHOUJO,
                MangaPublicationDemographic.JOSEI,
            )
        ).build().getRequest()

        request shouldBeMangaUrl "publicationDemographic[]=shoujo&publicationDemographic[]=josei"
    }

    @Test
    fun testIds() {
        val builder = MangaList.Builder()
        val request = builder.ids(listOf("1231", "2222")).build().getRequest()

        request shouldBeMangaUrl "ids[]=1231&ids[]=2222"
    }

    @Test
    fun testContentRating() {
        val builder = MangaList.Builder()
        // Very suitable ratings
        val request =
            builder.contentRating(listOf(MangaContentRating.EROTICA, MangaContentRating.SAFE)).build().getRequest()

        request shouldBeMangaUrl "contentRating[]=erotica&contentRating[]=safe"
    }

    @Test
    fun testCreatedAtSince() {
        val builder = MangaList.Builder()
        val request = builder.createdAtSince("2022-02-05").build().getRequest()

        request shouldBeMangaUrl "createdAtSince=2022-02-05"
    }

    @Test
    fun testUpdatedAtSince() {
        val builder = MangaList.Builder()
        val request = builder.updatedAtSince("2022-02-05").build().getRequest()

        request shouldBeMangaUrl "updatedAtSince=2022-02-05"
    }

    @Test
    fun testIncludes() {
        val builder = MangaList.Builder()
        val request = builder.includes(listOf("test", "test2")).build().getRequest()

        request shouldBeMangaUrl "includes[]=test&includes[]=test2"
    }

    @Test
    fun testHasAvailableChapters() {
        val builder = MangaList.Builder()
        val request = builder.hasAvailableChapters(true).build().getRequest()

        request shouldBeMangaUrl "hasAvailableChapters=true"
    }

    @Test
    fun testGroup() {
        val builder = MangaList.Builder()
        val request = builder.group("Mangaka").build().getRequest()

        request shouldBeMangaUrl "group=Mangaka"
    }
}