package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {

    public static final int NUMBER_SHELVES = 10;
    private int countBooks;
    private final Book[] books = new Book[NUMBER_SHELVES];

    public boolean addBook(Book book) {
        if (countBooks < NUMBER_SHELVES) {
            books[countBooks] = book;
            countBooks++;
            return true;
        }
        return false;
    }

    public Book findBook(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void delete(String title) {
        for (int i = 0; i < countBooks; i++) {
            if (books[i].getTitle().equals(title)) {
                System.arraycopy(books,i + 1, books, i, countBooks - (i + 1));
                books[countBooks - 1] = null;
                countBooks--;
           }
       }
    }

    public Book[] getAllBooks() {
        return Arrays.copyOf(books, countBooks);
    }

    public int getCountBooks() {
        return countBooks;
    }

    public int getAmountFreeSpace() {
        return NUMBER_SHELVES - countBooks;
    }

    public void clearShelf() {
        Arrays.fill(books, 0, countBooks, null);
        countBooks = 0;
        System.out.println("Очистили полки от книг");
    }
}
