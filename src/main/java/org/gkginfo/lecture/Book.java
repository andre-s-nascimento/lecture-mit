package org.gkginfo.lecture;

public class Book {
  String title;
  boolean borrowed;

  public Book(String newTitle) {
    this.title = newTitle;
  }

  public void rented() {
    if (borrowed) {
      System.out.println("This book is already borrowed");
    } else {
      borrowed = true;
      System.out.println(" ");
    }
  }

  public void returned() {
    if (!borrowed) {
      System.out.println("This book is not borrowed");
    } else {
      borrowed = false;
      System.out.println(" ");
    }
  }

  public Boolean isBorrowed() {
    return this.borrowed;
  }

  public String getTitle() {
    return this.title;
  }
}
