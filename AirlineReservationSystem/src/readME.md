# Airline Reservation System

## Overview
The Airline Reservation System is a simple Java application for managing flight reservations. 
It allows users to add flights, book flights, cancel bookings, and view the list of available flights along with the number of available seats.

## Features
- Add a new flight to the airline.
- List all available flights.
- Book a seat on a flight.
- Cancel a booking on a flight.

## Requirements
- JDK 8 or higher
-Maven 
- Git

## Installation
1. Clone the repository or download the source code.
   '''bash 
   git clone https://github.com/ShaunTanner1/AirlineReservationSystem.git
   cd airline-reservation-system
2. Compile and run the application.

## Usage
1. Run the application.
   java Main
2. Follow the on-screen menu to manage flight reservations:
---Airline Reservation System:---
1. Add a new flight
2. List all available flights
3. Book a seat on a flight
4. Cancel a booking on a flight
5. Exit

## Examples
-Adding a flight:
Enter flight number: AA101
Enter departure: London
Enter destination: Paris
Enter capacity: 150
Flight added successfully

-Booking a flight:
Enter flight number: AA101
Enter seat number: 1
Seat booked successfully

-List all available flights:
Available flights:
Flight number: AA101, departure: London, destination: Paris, capacity: 150, booked seats: 1, available seats: 149

## File structure

- src
    - main
        - java
            - Airline.java
            - Flight.java
            - Main.java
            - Readme.md
- pom.xml

## Contributions
Contributions are welcome! Please feel free to submit a pull request or open an issue.
