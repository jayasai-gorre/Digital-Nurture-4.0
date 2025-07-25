package com.cognizant.hands_on_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

/**
 * @author Gorre Jaya Sai
 */
@SpringBootApplication
public class HandsOn2Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(HandsOn2Application.class);

    public static void main(String[] args) {
        LOGGER.info("START");
        SpringApplication.run(HandsOn2Application.class, args);
        displayDate();
        LOGGER.info("END");
    }

    public static void displayDate() {
        LOGGER.info("START");

        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        try {
            Date date = format.parse("31/12/2018");
            LOGGER.debug("Parsed Date: {}", date.toString());
        } catch (ParseException e) {
            LOGGER.error("Parse error", e);
        }

        LOGGER.info("END");
    }
}
