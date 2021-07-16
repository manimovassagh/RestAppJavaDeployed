package com.example.restfullapp.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This class shows each topics in our course collection website
 */
@Entity
public class Topic {
    /**
     * String Id to specify unique specifier for each topic
     * obviously later will be come from PostgreSQL
     *
     */
    @Id
    private String id;
    private String name;
    private String description;

    public Topic() {

    }

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
