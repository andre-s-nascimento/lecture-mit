package org.gkginfo.lecture;

import java.util.ArrayList;
import java.util.List;

public class Library {
  final String OPENING_HOURS = "Libraries are open daily from 9am to 5pm.";
  List<Book> books;
  String address;

  public Library(String address) {
    this.address = address;
    this.books = new ArrayList<>();
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public void printOpeningHours() {
    System.out.println(OPENING_HOURS);
  }

  public void printAddress() {
    System.out.println(this.address);
  }

  public void borrowBook(String bookTitle) {
    for (Book book : books) {
      if (book.title.equals(bookTitle)) {
        if (!book.isBorrowed()) {
          book.rented();
          System.out.println("You successfully borrowed " + book.title);

        } else {
          System.out.println("Sorry, this book is already borrowed");
        }
      }
    }
    System.out.println("Sorry, this book is not in our catalog.");
  }

  public void printAvailableBooks() {
    boolean libraryIsEmpty = true;

    for (Book book : books) {
      if (!book.isBorrowed()) {
        System.out.println(book.getTitle());
        libraryIsEmpty = false;
      }
    }

    if (libraryIsEmpty) {
      System.out.println("No book in catalog.");
    }
  }

  public void returnBook(String bookTitle) {
    Boolean found = false;

    for (Book book : books) {
      if (book.getTitle().equals(bookTitle)) {
        if (book.isBorrowed()) {
          book.returned();
          System.out.println("You successfully returned " + bookTitle);
          found = true;
          break;
        }
      }
    }

    if (!found) {
      System.out.println("Your book was not fond in the library catalog.");
    }
  }
}
