package com.global.lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[]args){
        Library library = new Library();
        Book book1 = new Book("Nàng bạch tuyết và 7 chú lùn", "Brothers Grimm","ISBN-14"); // Khai bao sach - khoi tao doi tuong
        Book book2 = new Book("Công chúa ngủ trong rừng", "Charles Perrault","ISBN-15");
        Book book3 = new Book("Thép đã tôi thế đó", "Nguyễn Huy Tưởng","ISBN-16");
        Book book4 = new Book("Chị Dậu", "Ngô Tất Tố","ISBN-17");

        library.addABook(book1);// add book
        library.addABook(book2);
        library.addABook(book3);

        book1.displayBookDetails(); // Hien thi detail sach
        System.out.println("---------------------");
        book2.displayBookDetails();
        System.out.println("---------------------");
        book3.displayBookDetails();
        System.out.println("---------------------");
        book4.displayBookDetails();

        System.out.println("All books in the library:");
        library.displayABook();
        System.out.println("------------------");
        library.searchABook("Chị Dậu");
        System.out.println("------------------");

        System.out.println("Search results:");
        library.searchABook("Thép đã");
        System.out.println("------------------");

        library.borrowABook("ISBN-15");
        library.borrowABook("Công chúa ngủ trong rừng");

        System.out.println("--------------------");
        library.returnABook("ISBN-15");
        library.returnABook("Công chúa ngủ trong rừng");

        System.out.println("--------------------");

        library.removeABook("Công chúa ngủ trong rừng");

        library.displayABook(); //Display all books after removal

    }
}
