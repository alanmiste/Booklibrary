package com.example.booklibrary.book;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BookRepo {

    private final List< Book> books = List.of(
            new Book("978-3-8362-8745-6","ava ist auch eine Insel","Christian Ullenboom"),
            new Book("978-1-60309-025-4","The Years Have Pants","Alec"),
            new Book("78-1-891830-85-3","American Elf","James Kochalka")
    );

    public Book getOneBook(String isbn){
        Book oneBook = null;
        for(int i=0; i<books.size(); i++){
            if(isbn == books.get(i).getIsbn())
                oneBook = new Book(
                        books.get(i).getIsbn(),
                        books.get(i).getTitle(),
                        books.get(i).getAuthor()
                );
        }
        return oneBook;
    }
}
