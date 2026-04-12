package br.com.agilworks.gotogheter.application.core.domain

import java.time.LocalDateTime

data class RideSearch(
    val origin: Location,
    val destination: Location,
    val date: LocalDateTime,
    val passengers: Int
) {
    init {
        require(passengers > 0) { "Passengers must be greater than zero" }
        require(date.isAfter(LocalDateTime.now())) { "Date must be in the future" }
        require(origin != destination) { "Origin and destination must be different" }
    }
}
