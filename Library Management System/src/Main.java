
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add book: ");
            System.out.println("2. List Available Books: ");
            System.out.println("3. List Borrowed Books: ");
            System.out.println("4. Borrow Book: ");
            System.out.println("5. Return Book: ");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    library.addBook(new Book(title, author));
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    System.out.println("Available Books: ");
                    library.listAvailableBooks();
                    break;
                case 3:
                    System.out.println("Borrowed Books: ");
                    library.listBorrowedBooks();
                    break;
                case 4:
                    System.out.println("Enter book title to borrow: ");
                    title = scanner.nextLine();
                    library.borrowBook(title);
                    break;
                case 5:
                    System.out.println("Enter book title to return: ");
                    title = scanner.nextLine();
                    library.returnBook(title);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
