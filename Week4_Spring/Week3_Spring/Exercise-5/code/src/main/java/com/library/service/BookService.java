package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBookInfo() {
        System.out.println("BookService: Delegating call to BookRepository...");
        bookRepository.getBookDetails();
    }
}
