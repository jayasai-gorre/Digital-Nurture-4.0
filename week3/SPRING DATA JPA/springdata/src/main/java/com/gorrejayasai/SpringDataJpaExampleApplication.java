package com.gorrejayasai;

import com.gorrejayasai.entity.Book;
import com.gorrejayasai.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaExampleApplication implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaExampleApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Save sample data
        Book b1 = new Book();
        b1.setTitle("Wings of Fire");
        b1.setAuthor("A.P.J. Abdul Kalam");

        Book b2 = new Book();
        b2.setTitle("The Alchemist");
        b2.setAuthor("Paulo Coelho");

        bookRepository.save(b1);
        bookRepository.save(b2);

        // Print all books
        System.out.println("List of Books in DB:");
        bookRepository.findAll().forEach(book ->
                System.out.println("Id: " + book.getId() +
                                   ", Title: " + book.getTitle() +
                                   ", Author: " + book.getAuthor()));
    }
}
