package se.vallett.kdex.api.client.params.exceptions

class InvalidParamValueException(value : String, accepted : Set<Any?>)
    : Throwable("Invalid parameter value: $value, Excepted $accepted")
