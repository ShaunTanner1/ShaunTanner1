
import java.util.Scanner;

public class Main {
    private static UserManagement userManagement = new UserManagement();
    private static Airline airline = new Airline();
    private static User currentUser;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                register(scanner);
            } else if (choice == 2) {
                if (login(scanner)) {
                    showMenu(scanner);
                }
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    private static void register(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.print("Enter role (admin/passenger): ");
        String role = scanner.nextLine();

        if (userManagement.registerUser(username, password, role)) {
            System.out.println("User registered successfully.");
        } else {
            System.out.println("User registration failed.");
        }
    }

    private static boolean login(Scanner scanner) {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        currentUser = userManagement.loginUser(username, password);
        if (currentUser != null) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }

    private static void showMenu(Scanner scanner) {
        while (true) {
            System.out.println("Welcome to the Airline Reservation System: ");
            System.out.println("1. Add Flight (admin only)");
            System.out.println("2. List Available Flights");
            System.out.println("3. Book Flight");
            System.out.println("4. Cancel Booking");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            if (choice == 1) {
                if (currentUser.getRole().equals("admin")) {
                    addFlight(scanner);
                } else {
                    System.out.println("Only admins can add flights.");
                }
            } else if (choice == 2) {
                listAvailableFlights();
            } else if (choice == 3) {
                bookFlight(scanner);
            } else if (choice == 4) {
                cancelBooking(scanner);
            } else if (choice == 5) {
                currentUser = null;
                System.out.println("Logout successful.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addFlight(Scanner scanner) {
        System.out.println("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        System.out.println("Enter departure location: ");
        String departure = scanner.nextLine();
        System.out.println("Enter destination location: ");
        String destination = scanner.nextLine();
        System.out.println("Enter flight capacity: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        airline.addFlight(new Flight(flightNumber, departure, destination, capacity));
        System.out.println("Flight added successfully.");
    }

    private static void listAvailableFlights() {
        for (Flight flight : airline.getFlight()) {
            System.out.println(flight);
        }
    }

    private static void bookFlight(Scanner scanner) {
        System.out.println("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        if (airline.bookFlight(flightNumber)) {
            System.out.println("Flight booked successfully.");
        } else {
            System.out.println("Flight booking failed.");
        }
    }

    private static void cancelBooking(Scanner scanner) {
        System.out.println("Enter flight number: ");
        String flightNumber = scanner.nextLine();
        if (airline.cancelFlight(flightNumber)) {
            System.out.println("Flight cancelled successfully.");
        } else {
            System.out.println("Flight cancellation failed.");
        }
    }

}
