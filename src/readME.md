# Airline Reservation System

This is a console-based Airline Reservation System implemented in Java. The system allows users to register, log in, and perform various operations related to airline reservations based on their roles (admin or passenger).

## Features

- **User Registration**: Users can register with a username, password, and role (admin or passenger).
- **User Login**: Users can log in with their registered username and password.
- **Role-based Access Control**:
    - **Admins**: Can add new flights.
    - **Passengers**: Can book and cancel flight reservations.
- **Flight Management**: Admins can add flights with details such as flight number, departure location, destination location, and capacity.
- **Booking Management**: Users can book seats on available flights and cancel their bookings.

## Classes and Methods

### `User`

Represents a user with a username, password, and role.

#### Fields
- `String username`
- `String password`
- `String role`

#### Methods
- `User(String username, String password, String role)`
- `String getUsername()`
- `boolean checkPassword(String password)`
- `String getRole()`

### `UserManagement`

Manages user registration and login.

#### Fields
- `Map<String, User> users`

#### Methods
- `UserManagement()`
- `boolean registerUser(String username, String password, String role)`
- `User loginUser(String username, String password)`
- `User getUser(String username)`

### `Flight`

Represents a flight with a flight number, departure location, destination location, capacity, and booked seats.

#### Fields
- `String flightNumber`
- `String departure`
- `String destination`
- `int capacity`
- `int bookedSeats`

#### Methods
- `Flight(String flightNumber, String departure, String destination, int capacity)`
- `String getFlightNumber()`
- `String getDeparture()`
- `String getDestination()`
- `int getCapacity()`
- `int getBookedSeats()`
- `int getAvailableSeats()`
- `boolean bookSeat()`
- `boolean cancelSeat()`
- `String toString()`

### `Airline`

Manages flights and bookings.

#### Fields
- `List<Flight> flights`

#### Methods
- `Airline()`
- `void addFlight(Flight flight)`
- `Flight findFlight(String flightNumber)`
- `boolean bookFlight(String flightNumber)`
- `boolean cancelFlight(String flightNumber)`
- `List<Flight> getFlights()`

### `Main`

The main class that drives the application, including the user interface for registering, logging in, and performing operations based on user roles.

#### Methods
- `public static void main(String[] args)`
- `private static void register(Scanner scanner)`
- `private static boolean login(Scanner scanner)`
- `private static void showMenu(Scanner scanner)`
- `private static void addFlight(Scanner scanner)`
- `private static void listAvailableFlights()`
- `private static void bookFlight(Scanner scanner)`
- `private static void cancelBooking(Scanner scanner)`

## How to Run

1. **Compile the Java files:**
javac User.java UserManagement.java Flight.java Airline.java Main.java
2. Run the 'main' class:
java Main

## Usage

1. Register a new user:
   - Select option '1' from the main menu.
   - Enter username, password, and role (either 'admin' or 'passenger').
2. Login:
   - Select option '2' from the main menu.
   - Enter username and password.
3. Admin Operations:
   - After logging in as an admin, select option '1' to add a flight.
   - Enter flight details (flight number, departure location, destination location, and capacity).
4. Passenger Operations:
   - After logging in as a passenger, select options '2', '3', or '4' to list available flights, 
     book a flight, or cancel a booking, respectively.
5. Logout:
   - Select option '5' from the main menu to log out.

## Example

1. Register
2. Login
3. Exit
   Enter choice: 1
   Enter username: user1
   Enter password: pass1
   Enter role (admin/passenger): passenger
   Registration successful.

1. Register
2. Login
3. Exit
   Enter choice: 2
   Enter username: user1
   Enter password: pass1
   Login successful.

Airline Reservation System:
1. Add Flight (admin only)
2. List Available Flights
3. Book Flight
4. Cancel Booking
5. Logout
   Enter choice: 2
   [No flights available]

Enter choice: 5
Logged out.


## Planned Enhancements
- Password encryption
- Data Persistence
- Improvement of UI
- Flight Search