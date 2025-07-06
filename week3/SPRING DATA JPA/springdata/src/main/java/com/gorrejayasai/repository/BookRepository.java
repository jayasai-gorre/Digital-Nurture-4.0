package com.gorrejayasai.repository;

import com.gorrejayasai.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
