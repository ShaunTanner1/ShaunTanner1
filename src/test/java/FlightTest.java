
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlightTest {
    private Flight flight;

    @Before
    public void setUp() {
        flight = new Flight("AA101", "London", "Paris", 150);
    }

    @Test
    public void testInitialValues() {
        assertEquals("AA101", flight.getFlightNumber());
        assertEquals("London", flight.getDeparture());
        assertEquals("Paris", flight.getDestination());
        assertEquals(150, flight.getAvailableSeats());
        assertEquals(0, flight.getBookedSeats());
    }

    @Test
    public void testBookSeat() {
        assertTrue(flight.bookSeat());
        assertEquals(1, flight.getBookedSeats());
        assertEquals(149, flight.getAvailableSeats());
    }

    @Test
    public void testCancelSeat() {
        flight.bookSeat();
        assertTrue(flight.cancelSeat());
        assertEquals(0, flight.getBookedSeats());
        assertEquals(150, flight.getAvailableSeats());
    }

    @Test
    public void testBookSeatBeyondcapacity() {
        for (int i = 0; i < 150; i++) {
            assertTrue(flight.bookSeat());
        }
        assertFalse(flight.bookSeat());
        assertEquals(150, flight.getBookedSeats());
        assertEquals(0, flight.getAvailableSeats());
    }

    @Test
    public void testCancelSeatWithNoBookings() {
        assertFalse(flight.cancelSeat());
        assertEquals(0, flight.getBookedSeats());
        assertEquals(150, flight.getAvailableSeats());
    }
}
