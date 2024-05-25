
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Airline airline = new Airline();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Airline Reservation System");
            System.out.println("1. Add Flight");
            System.out.println("2. List Available Flights");
            System.out.println("3. Book Flight");
            System.out.println("4. Cancel Flight");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Flight Number: ");
                    String flightNumber = scanner.nextLine();
                    System.out.print("Enter Departure: ");
                    String departure = scanner.nextLine();
                    System.out.print("Enter Destination: ");
                    String destination = scanner.nextLine();
                    System.out.print("Enter Capacity: ");
                    int capacity = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    airline.addFlight(new Flight(flightNumber, departure, destination, capacity));
                    break;
                case 2:
                    System.out.println("Available Flights:");
                    airline.listAvailableFlights();
                    break;
                case 3:
                    System.out.println("Enter flight number to book: ");
                    flightNumber = scanner.nextLine();
                    if (airline.bookFlight(flightNumber)) {
                        System.out.println("Flight booked successfully");
                    } else {
                        System.out.println("Booking failed. Flight may be full or does not exist");
                    }
                    break;
                case 4:
                    System.out.println("Enter flight number to cancel: ");
                    flightNumber = scanner.nextLine();
                    if (airline.cancelFlight(flightNumber)) {
                        System.out.println("Booking cancellation successful");
                    } else {
                        System.out.println("Cancellation failed. Flight may not exist");
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }

        scanner.close();
    }
}
