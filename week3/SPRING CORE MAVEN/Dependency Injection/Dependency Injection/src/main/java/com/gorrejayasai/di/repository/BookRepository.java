package com.gorrejayasai.di.repository;

import com.gorrejayasai.di.book.Book;

public class BookRepository {
    public Book getBook() {
        return new Book("Spring in Action");
    }
}
