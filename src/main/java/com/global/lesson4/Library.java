package com.global.lesson4;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private int bookCount;

    public Library() {
        this.books = new ArrayList<>();
//        this.bookCount = 0;
    }

    void addABook(Book newBook){
        this.books.add(newBook);
    }
    void removeABook(String titleBook){
        List<Book> booksUpdate = new ArrayList<>();
        for(Book book: this.books) {
            if (!titleBook.equals(book.getTitle())) {
                book.setAvailable(false);
            }
            booksUpdate.add(book);
        }
//        for (int i = 0; i < this.books.size(); i++) {
//            Book book = this.books.get(i);
//            if (!titleBook.equals(book.getTitle())) {
//                booksUpdate.add(book);
//            }
//        booksUpdate.add(book);
//        }
        this.books = booksUpdate;
    }

    void searchABook(String textSearch){
        List<Book> bookMap = new ArrayList<>();
        for(Book book: this.books) {
            if (book.getTitle().contains(textSearch)) {
                bookMap.add(book);
            }
//            if (!textSearch.equals(book.getTitle())) {
//                return  book.getAvailable();
//            }
        }
        if (bookMap.size() == 0) {
            System.out.println("k co sach nao = " + textSearch);
            return;
        }
        for (int i = 0; i < bookMap.size(); i ++) {
            Book book = bookMap.get(i);
            System.out.println("getTitle = " + book.getTitle());
            System.out.println("getAvailable = " + book.getAvailable());
        }
//        return  bookMap;
    }

    void displayABook(){
        System.out.println(this.books.size());
        for (int i = 0; i < this.books.size(); i++) {
            Book book = this.books.get(i);
            System.out.println(book.getTitle());
        }
    }

    void borrowABook(String title){
        for (int i = 0; i < this.books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                if (books.get(i).getAvailable()) {
                    books.get(i).setAvailable(false); // Mark as borrowed
                    System.out.println("You borrowed the book: " + books.get(i).getTitle());
                    return;
                }
            }
        }
        System.out.println("Book with title " + title + " not found.");
    }

    void returnABook(String title){
        for (int i = 0; i < this.books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                if (!books.get(i).getAvailable()) {
                    books.get(i).setAvailable(true); // Mark as available
                    System.out.println("You returned the book: " + books.get(i).getTitle());
                    return;
                } else {
                    System.out.println("This book was not borrowed.");
                    return;
                }
            }
        }
    }
}
