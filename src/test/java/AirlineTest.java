
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AirlineTest {
    private Airline airline;
    private Flight flight;

    @Before
    public void setUp() {
        airline = new Airline();
        flight = new Flight("AA101", "London", "Paris", 150);
    }

    @Test
    public void testAddFlight() {
        assertNotNull(airline);
    }

    @Test
    public void testFindFlight() {
        assertEquals(flight, airline.findFlight("AA101")); // (airline);
    }

    @Test
    public void testBookFlight() {
        assertTrue(airline.bookFlight("AA101"));
        assertEquals(1, flight.getBookedSeats());
    }

    @Test
    public void testCancelFlight() {
        assertTrue(airline.cancelFlight("AA101"));
        assertEquals(0, flight.getBookedSeats());
    }

    @Test
    public void testBookNonExistentFlight() {
        assertFalse(airline.bookFlight("BB202"));
    }

    @Test
    public void testCancelNonExistentFlight() {
        assertFalse(airline.cancelFlight("BB202"));
    }

}
