package com.oops.constructor;

public class Book {
	String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

   public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book book = new Book("1984", "George Orwell");
        book.display();
    }
}
