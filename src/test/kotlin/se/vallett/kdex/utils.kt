package se.vallett.kdex

import io.kotest.matchers.shouldBe

internal infix fun String.shouldBeMangaUrl(expected: String) {
    this shouldBe "https://api.mangadex.org/manga?$expected"
}