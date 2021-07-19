package com.example.restfullapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * This is the main Part of Application
 * With help of SpringBootApplication annotation spring knows how to start the app
 */
@SpringBootApplication
public class RestFullApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestFullApplication.class, args);
    }

}
