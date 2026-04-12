package br.com.agilworks.gotogheter.application.core.domain

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.time.LocalDateTime
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class RideSearchTest {

    private val origin = Location("Porto Alegre", "RS", 0.0, 0.0)
    private val destination = Location("Balneário Camboriú", "S", 0.0, 0.0)
    private val date = LocalDateTime.now().plusDays(1)

    @Test
    fun `should create RideSearch with valid data`() {
        val rideSearch = RideSearch(
            origin = origin,
            destination = destination,
            date = date,
            passengers = 2
        )

        assertEquals(origin, rideSearch.origin)
        assertEquals(destination, rideSearch.destination)
        assertEquals(date, rideSearch.date)
        assertEquals(2, rideSearch.passengers)
    }

    @Test
    fun `should throw exception when passengers is zero`() {
        assertThrows<IllegalArgumentException> {
            RideSearch(origin = origin, destination = destination, date = date, passengers = 0)
        }
    }

    @Test
    fun `should throw exception when passengers is negative`() {
        assertThrows<IllegalArgumentException> {
            RideSearch(origin = origin, destination = destination, date = date, passengers = -1)
        }
    }

    @Test
    fun `should throw exception when date is in the past`() {
        val pastDate = LocalDateTime.now().minusDays(1)

        assertThrows<IllegalArgumentException> {
            RideSearch(origin = origin, destination = destination, date = pastDate, passengers = 1)
        }
    }

    @Test
    fun `should throw exception when origin and destination are the same`() {
        assertThrows<IllegalArgumentException> {
            RideSearch(origin = origin, destination = origin, date = date, passengers = 1)
        }
    }

    @Test
    fun `two RideSearch with same data should be equal`() {
        val rideSearch1 = RideSearch(origin = origin, destination = destination, date = date, passengers = 2)
        val rideSearch2 = RideSearch(origin = origin, destination = destination, date = date, passengers = 2)

        assertEquals(rideSearch1, rideSearch2)
    }

    @Test
    fun `two RideSearch with different passengers should not be equal`() {
        val rideSearch1 = RideSearch(origin = origin, destination = destination, date = date, passengers = 1)
        val rideSearch2 = RideSearch(origin = origin, destination = destination, date = date, passengers = 3)

        assertNotEquals(rideSearch1, rideSearch2)
    }
}
