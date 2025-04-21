package com.global.lesson4;

public class Book {
    private  String title;
    private  String author;
    private  String isbn;
    private boolean isAvailable;


    public Book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true; // mặc định ban đầu là true
    } // Tạo contructor để sd cho nhiều đối tượng có chung thuộc tính
    public void displayBookDetails(){
        System.out.println("Title is:" + title);
        System.out.println("author is:" + author);
        System.out.println("isbn is:" + isbn);
        System.out.println("IsAvailable?" + (isAvailable ? "yes" : "no"));
    } // k có kiểu trả về hiển thị detail

    public boolean checkAvailability(boolean isAvailable){
       return isAvailable;
    } // check
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor (String author){
        this.author = author;
    }
    public String getIsbn(){
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean getAvailable(){
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable){
        this.isAvailable = isAvailable;
    }
}
