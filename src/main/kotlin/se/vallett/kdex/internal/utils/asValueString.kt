package se.vallett.kdex.internal.utils

import se.vallett.kdex.api.NamedSerializableValue
import java.time.Year
import java.time.format.DateTimeFormatter

internal fun Any.asValueString(): String = when (this) {
    is NamedSerializableValue -> serializedName
    is Enum<*> -> name
    is Year -> format(DateTimeFormatter.ISO_DATE)
    else -> toString()
}