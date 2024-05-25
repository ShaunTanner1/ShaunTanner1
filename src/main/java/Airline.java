
import java.util.ArrayList;
import java.util.List;

public class Airline {
    private List<Flight> flights;

    public Airline() {
        this.flights = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void listAvailableFlights() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    public Flight findFlight(String flightNumber) {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equalsIgnoreCase(flightNumber)) {
                return flight;
            }
        }
        return null;
    }

    public boolean bookFlight(String flightNumber) {
        Flight flight = findFlight(flightNumber);
        if (flight != null) {
            return flight.bookSeat();
        } else {
            System.out.println("Flight not found");
            return false;
        }
    }

    public boolean cancelFlight(String flightNumber) {
        Flight flight = findFlight(flightNumber);
        if (flight != null) {
            return flight.cancelSeat();
        } else {
            System.out.println("Flight not found");
            return false;
        }
    }
}
