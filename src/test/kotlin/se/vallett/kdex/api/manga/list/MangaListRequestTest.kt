package se.vallett.kdex.api.manga.list

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import se.vallett.kdex.api.manga.list.paramvalues.ExcludedTagsMode
import se.vallett.kdex.api.manga.list.paramvalues.IncludedTagsMode
import se.vallett.kdex.api.manga.list.paramvalues.MangaContentRating
import se.vallett.kdex.api.manga.list.paramvalues.MangaPublicationDemographic
import se.vallett.kdex.api.manga.list.paramvalues.MangaStatus

internal class MangaListRequestTest {

    @Test
    fun testArtists() {
        val builder = MangaList.Builder()

        val request = builder.artists(listOf("test", "test2")).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?artists[]=test&artists[]=test2", request)
    }

    @Test
    fun testAuthors() {
        val builder = MangaList.Builder()

        val request = builder.authors(listOf("test", "test2")).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?authors[]=test&authors[]=test2", request)
    }

    @Test
    fun testLimit() {
        val builder = MangaList.Builder()

        val request = builder.limit(5).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?limit=5", request)
    }

    @Test
    fun testOffset() {
        val builder = MangaList.Builder()

        val request = builder.offset(5).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?offset=5", request)
    }

    @Test
    fun testTitle() {
        val builder = MangaList.Builder()

        val request = builder.title("Hakuna mantata").build().getRequest()

        assertEquals("https://api.mangadex.org/manga?title=Hakuna mantata", request)
    }

    @Test
    fun testYear() {
        val builder = MangaList.Builder()

        val request = builder.year(2022).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?year=2022", request)
    }

    @Test
    fun testIncludedTags() {
        val builder = MangaList.Builder()

        val request = builder.includedTags(listOf("test", "test2")).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?includedTags[]=test&includedTags[]=test2", request)
    }

    @Test
    fun testIncludedTagsMode() {
        val builder = MangaList.Builder()

        val request = builder.includedTagsMode(IncludedTagsMode.AND).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?includedTagsMode=AND", request)
    }

    @Test
    fun tetExcludedTags() {
        val builder = MangaList.Builder()

        val request = builder.excludedTags(listOf("test", "test2")).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?excludedTags[]=test&excludedTags[]=test2", request)
    }

    @Test
    fun testExcludedTagsMode() {
        val builder = MangaList.Builder()

        val request = builder.excludedTagsMode(ExcludedTagsMode.AND).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?excludedTagsMode=AND", request)
    }

    @Test
    fun testStatus() {
        val builder = MangaList.Builder()

        val request = builder.status(listOf(MangaStatus.cancelled, MangaStatus.hiatus)).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?status[]=cancelled&status[]=hiatus", request)
    }

    @Test
    fun testOriginalLanguage() {
        val builder = MangaList.Builder()

        val request = builder.originalLanguage(listOf("Swedish", "Norweigan")).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?originalLanguage[]=Swedish&originalLanguage[]=Norweigan", request)
    }

    @Test
    fun testExcludedOriginalLanguage() {
        val builder = MangaList.Builder()

        val request = builder.excludedOriginalLanguage(listOf("Swedish", "Norwegian")).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?excludedOriginalLanguage[]=Swedish&excludedOriginalLanguage[]=Norwegian", request)
    }

    @Test
    fun testAvailableTranslatedLanguage() {
        val builder = MangaList.Builder()

        val request = builder.availableTranslatedLanguage(listOf("Swedish", "Norweigan")).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?availableTranslatedLanguage[]=Swedish&availableTranslatedLanguage[]=Norweigan", request)
    }

    @Test
    fun testPublicationDemographic() {
        val builder = MangaList.Builder()

        val request = builder.publicationDemographic(listOf(MangaPublicationDemographic.shoujo, MangaPublicationDemographic.josei)).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?publicationDemographic[]=shoujo&publicationDemographic[]=josei", request)
    }


    @Test
    fun testIds() {
        val builder = MangaList.Builder()

        val request = builder.ids(listOf("1231", "2222")).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?ids[]=1231&ids[]=2222", request)
    }

    @Test
    fun testContentRating() {
        val builder = MangaList.Builder()

        //Very suitable ratings
        val request = builder.contentRating(listOf(MangaContentRating.erotica, MangaContentRating.safe)).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?contentRating[]=erotica&contentRating[]=safe", request)
    }

    @Test
    fun testCreatedAtSince() {
        val builder = MangaList.Builder()

        val request = builder.createdAtSince("2022-02-05").build().getRequest()

        assertEquals("https://api.mangadex.org/manga?createdAtSince=2022-02-05", request)
    }

    @Test
    fun testUpdatedAtSince() {
        val builder = MangaList.Builder()

        val request = builder.updatedAtSince("2022-02-05").build().getRequest()

        assertEquals("https://api.mangadex.org/manga?updatedAtSince=2022-02-05", request)
    }

    @Test
    fun testIncludes() {
        val builder = MangaList.Builder()

        val request = builder.includes(listOf("test", "test2")).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?includes[]=test&includes[]=test2", request)
    }

    @Test
    fun testHasAvailableChapters() {
        val builder = MangaList.Builder()

        val request = builder.hasAvailableChapters(true).build().getRequest()

        assertEquals("https://api.mangadex.org/manga?hasAvailableChapters=true", request)
    }

    @Test
    fun testGroup() {
        val builder = MangaList.Builder()

        val request = builder.group("Mangaka").build().getRequest()

        assertEquals("https://api.mangadex.org/manga?group=Mangaka", request)
    }
}