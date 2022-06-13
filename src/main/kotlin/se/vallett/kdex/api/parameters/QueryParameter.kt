package se.vallett.kdex.api.parameters

sealed interface QueryParameter {
    fun asString(): String
}

data class Parameter(val name: String, val value: String) : QueryParameter {
    override fun asString(): String = "$name=$value"
}

data class ArrayParameter(val name: String, val values: List<String>) : QueryParameter {
    override fun asString(): String = values.joinToString(separator = "&") { "$name[]=$it" }
}