# Library Management System

## Overview
The Library Management System is a simple Java 
application for managing a library's book collection.
It allows users to add books, borrow books, return books, and 
view the list of available and borrowed books.

## Features
- Add a new book to the library.
- List all available books.
- List all borrowed books.
- Borrow a book from the library.
- Return a borrowed book to the library.

## Requirements
- Java 8
- Maven
- Git

## Installation
1. Clone the repository or download the source code.
'''bash
git clone https://github.com/ShaunTanner1/library-management-system.git
cd library-management-system
2. Compile the java files
javac Book.java Library.java Main.java

## Usage
1. Run the application
java Main
2. Follow the on-screen menu to manage the library:
--Library Management System--
1. Add book
2. List Available Books
3. List Borrowed Books
4. Borrow Book
5. Return Book
6. Exit
Enter your choice:

## Examples 
Adding a new book:
Enter book title: The Great Gatsby
Enter book author's first name: F. Scott 
Enter book author's last name: Fitzgerald
Book added successfully.

Borrowing a book:
Enter book title to borrow: The Great Gatsby
Book borrowed successfully.

Listing available books:
Available books:
Title: The Great Gatsby, Author: F. Scott Fitzgerald, Borrowed: true
Title: The Catcher in the Rye, Author: J. D. Salinger, Borrowed: false

## File Structure

```
library-management-system
├── Book.java
├── Library.java
├── Main.java
└── README.md
```

## Contributing 
Contributing: https://github.com/ShaunTanner1/library-management-system
Contributions are welcome! Please feel free to submit pull requests or open an issue.