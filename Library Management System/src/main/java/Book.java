

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;
    private User borrowedBy;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
        this.borrowedBy = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
        } else {
            System.out.println("The book is already borrowed.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
        } else {
            System.out.println("The book is not borrowed.");
        }
    }

    public User getBorrowedBy() {
        return borrowedBy;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", " + "Author: " + author + ", Borrowed: " + isBorrowed() + (isBorrowed() ? " by " + borrowedBy.getName() : "");
    }

}
