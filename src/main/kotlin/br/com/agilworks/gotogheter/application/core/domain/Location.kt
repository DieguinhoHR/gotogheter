package br.com.agilworks.gotogheter.application.core.domain

data class Location(
    val city: String,
    val state: String?,
    val latitude: Double?,
    val longitude: Double?
)
