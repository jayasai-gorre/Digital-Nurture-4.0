package com.gorrejayasai;

import com.gorrejayasai.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryApplication {
    public static void main(String[] args) {
        System.out.println("Starting Library Management System...");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService libraryService = context.getBean("libraryService", BookService.class);
        libraryService.showBooks();
    }
}
