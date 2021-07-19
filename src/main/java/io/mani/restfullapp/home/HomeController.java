package io.mani.restfullapp.home;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


/**
 * This class is for presentation in Home Directory
 * i just hard coded this part because i could not use postman
 * in my presentation.obviously it can come from Database with JPA Hibernate connection.
 */
@RestController
public class HomeController {

    /**
     * this method handle the return value from get method in home directory.
     * the goal is to return a list of different departments from our website
     *  @return just return a list of topics from the website
     * you can check it out in home directory
     */
    @RequestMapping("/")
    public List<Departments> getSomeDepartmentsList() {
        return Arrays.asList(
                new Departments("a", "Java Entwicklung", DepartmentCategories.IT, "This Department do training for Java"),
                new Departments("a", "International Business", DepartmentCategories.BUSINESS, "This Department is doing International Business"),
                new Departments("a", "Contract Department", DepartmentCategories.ECONOMIC, "This Department make a Deal with foreign companies"),
                new Departments("a", "Vintage Business ", DepartmentCategories.ECONOMIC, "This Department is dealing Vintage things"),
                new Departments("a", "Online Training", DepartmentCategories.TRAINING, "This Department Offer the best Online Trainings"),
                new Departments("a", "International Business", DepartmentCategories.BUSINESS, "This Department is doing International Business")

        );
    }

}
