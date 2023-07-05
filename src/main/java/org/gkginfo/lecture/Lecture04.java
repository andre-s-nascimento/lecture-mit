package org.gkginfo.lecture;

public class Lecture04 {

  public static void main(String[] args) {
    Book example = new Book("Clean Code");
    System.out.println("Title (should be Clean Code): " + example.getTitle());
    System.out.println("Rented? (should be false): " + example.isBorrowed());
    example.rented();
    System.out.println("Rented? (should be true): " + example.isBorrowed());
    example.returned();
    System.out.println("Rented? (should be false): " + example.isBorrowed());

    Library firstLibrary = new Library("1010 Main St.");
    Library secondLibrary = new Library("2048 Liberty St.");

    firstLibrary.addBook(new Book("Clean Code"));
    firstLibrary.addBook(new Book("Java Essential"));
    firstLibrary.addBook(new Book("A Tale of Two Devs"));
    firstLibrary.addBook(new Book("The Lord of the Bugs"));

    System.out.println("Library hours:");
    firstLibrary.printOpeningHours();
    System.out.println();
    System.out.println("Library addresses:");
    firstLibrary.printAddress();
    secondLibrary.printAddress();
    System.out.println();

    System.out.println("Borrowing The Lord of the Bugs:");
    firstLibrary.borrowBook("The Lord of the Bugs");
    firstLibrary.borrowBook("The Lord of the Bugs");
    secondLibrary.borrowBook("The Lord of the Bugs");
    System.out.println();

    System.out.println("Books available in the first library:");
    firstLibrary.printAvailableBooks();
    System.out.println();
    System.out.println("Books available in the second library:");
    secondLibrary.printAvailableBooks();
    System.out.println();

    System.out.println("Returning The Lord of the Bugs:");
    firstLibrary.returnBook("The Lord of the Bugs");
    System.out.println();

    System.out.println("Books available in the first library:");
    firstLibrary.printAvailableBooks();
  }
}
