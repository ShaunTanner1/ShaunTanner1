import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void listAvailableBooks() {
        for (Book book : books) {
            if (!book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }

    public void listBorrowedBooks() {
        for (Book book : books) {
            if (book.isBorrowed()) {
                System.out.println(book);
            }
        }
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void borrowBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.borrowBook();
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(String title) {
        Book book = findBookByTitle(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println("Book not found.");
        }
    }
}
