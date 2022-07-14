package com.example.booklibrary.book;

import org.springframework.stereotype.Service;

@Service
public class BookService {
    
    private final BookRepo bookRepo;
    
    public BookService(BookRepo bookRepo){
        this.bookRepo = bookRepo;
    }


    public Book getOneBook(String isbn) {

    }
}
