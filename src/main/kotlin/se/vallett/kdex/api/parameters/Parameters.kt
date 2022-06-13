package se.vallett.kdex.api.parameters

import se.vallett.kdex.internal.utils.asValueString

sealed interface Parameters : Iterable<QueryParameter> {
    operator fun get(name: String): QueryParameter?

    operator fun contains(name: String): Boolean

    override operator fun iterator(): Iterator<QueryParameter>

    fun asString(): String
}

internal class ParametersImpl(private val delegate: Map<String, QueryParameter>) : Parameters {
    override fun get(name: String): QueryParameter? = delegate[name]

    override fun contains(name: String): Boolean = name in delegate

    override fun iterator(): Iterator<QueryParameter> = delegate.values.toList().iterator()

    override fun asString(): String = delegate.values.encodeToUrlParameters()
}

internal class ParametersBuilder : Parameters {
    private val delegate = mutableMapOf<String, QueryParameter>()

    operator fun set(name: String, value: String) {
        delegate[name] = Parameter(name, value)
    }

    operator fun set(name: String, value: Any) {
        delegate[name] = when (value) {
            is Iterable<*> -> {
                val values = value.toList().mapNotNull { it?.asValueString() }
                ArrayParameter(name, values)
            }
            else -> Parameter(name, value.asValueString())
        }
    }

    override fun get(name: String): QueryParameter? = delegate[name]

    override fun contains(name: String): Boolean = name in delegate

    override fun iterator(): Iterator<QueryParameter> = delegate.values.iterator()

    override fun asString(): String = delegate.values.encodeToUrlParameters()

    fun build(): Parameters = ParametersImpl(delegate.toMap())
}

internal fun Iterable<QueryParameter>.encodeToUrlParameters(): String = flatMap {
    when (it) {
        is Parameter -> listOf("${it.name}=${it.value}")
        is ArrayParameter -> it.values.map { value -> "${it.name}[]=${value}" }
    }
}.joinToString(separator = "&")