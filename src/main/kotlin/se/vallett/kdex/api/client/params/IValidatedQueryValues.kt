package se.vallett.kdex.api.client.params

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import se.vallett.kdex.api.client.params.exceptions.InvalidParamValueException

interface IValidatedQueryValues{
    fun validQueryValues() : Set<Any>

    fun validate(values : Iterable<Any?>) {
        runBlocking {
            launch {
                values.forEach { v -> validate(v) }
            }
        }
    }

    fun validate (value : Any?) {
        if (!validQueryValues().contains(value)) {
            throw InvalidParamValueException(value.toString(), validQueryValues());
        }
    }
}