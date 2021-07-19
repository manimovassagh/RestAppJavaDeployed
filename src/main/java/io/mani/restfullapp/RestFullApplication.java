package io.mani.restfullapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <h1>Rest Api Application for Course Provider Handling</h1>
 * This program give you a RestfullApi Service in which you can
 * provide backend for a course provider Website.
 * The Backend consist of Three Parts first part is Topics at the top of the hierarchy.
 * Second part id the Course part which is under the Topic level that means we can have a
 * return json file with one topic and many courses.
 * I just made another static Home part to show the functionality of App at presentation.
 * Because i have no access to Postman in Alfa Training computer.
 * if you want to use it in your website you can replace it with any service easily.
 *
 * @author Mani Movassagh
 * @version 1.0
 * @since 2021-07-18
 * This is the main Part of Application
 * With help of SpringBootApplication annotation , spring knows how to start the app
 * and after that spring use main to start the app
 * For Database i used Apache Derby which is embedded and also JPA.
 * You can find The information about Apache Derby in derby.log file in target directory.
 * obviously it can be changed by MySQL or PostgreSQL.
 * SpringApplication is a static class and has a run method which has two arguments.
 * the first one is a class that has Main method inside and the second argument is the
 * same argument that passed to main method.
 */
@SpringBootApplication
public class RestFullApplication {

    /**
     * @param args This is a main method argument that comes from args inside the run method in SpringApplication
     */
    public static void main(String[] args) {
        SpringApplication.run(RestFullApplication.class, args);
    }

}
