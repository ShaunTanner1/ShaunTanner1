public class Flight {
    private String flightNumber;
    private String departure;
    private String destination;
    private int capacity;
    private int bookedSeats;

    public Flight(String flightNumber, String departure, String destination, int capacity) {
        this.flightNumber = flightNumber;
        this.departure = departure;
        this.destination = destination;
        this.capacity = capacity;
        this.bookedSeats = 0;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public int getAvailableSeats() {
        return capacity - bookedSeats;
    }

    public boolean bookSeat() {
        if (bookedSeats < capacity) {
            bookedSeats++;
            return true;
        } else {
            return false;
        }
    }

    public boolean cancelSeat() {
        if (bookedSeats > 0) {
            bookedSeats--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Flight Number: " + flightNumber + ", Departure: " + departure + ", Destination: " + destination + ", " +
                "Capacity: " + capacity + ", Booked Seats: " + bookedSeats + ", Available Seats: " + getAvailableSeats();
    }
}
