package Facade;

import java.util.ArrayList;

public class Library {
    public String name;
    public ArrayList<Book> books;

    public Library(String name){
        this.name = name;
        books = new ArrayList<Book>();
    }

    public void addBook(Book){
        books.add(Book);
    }

}