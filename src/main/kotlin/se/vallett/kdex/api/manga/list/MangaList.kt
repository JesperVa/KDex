package se.vallett.kdex.api.manga.list

class MangaList(
    var limit : Int = 10,
    var offset : Int,
    var title : String,
    var authors : Array<String>,
    var artists : Array<String>,
    var year : Int,
    var includedTags : Array<String>,
    var includedTagsMode : Array<String>,


)  {
    val endPoint = "/manga"

}