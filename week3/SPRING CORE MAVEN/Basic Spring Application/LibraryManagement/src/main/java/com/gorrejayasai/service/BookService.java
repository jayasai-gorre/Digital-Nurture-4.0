package com.gorrejayasai.service;

import com.gorrejayasai.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setLibraryRepository(BookRepository libraryRepository) {
        this.bookRepository = libraryRepository;
    }

    public void showBooks() {
        System.out.println("LibraryService: Requesting book list from repository...");
        bookRepository.fetchBooks();
    }
}

