package io.mani.restfullapp.topics;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
    @GeneratedValue
    private String id;
    /**
     * This is refer to name of each Topic
     */
    private String name;
    /**
     * this refers to description of each Topic
     */
    private String description;
    /**
     * this is an empty constructor which works as default but in our case it is only for development purpose.
     */
    public Topic() {

    }

    /**
     *  this is the main constructor for Topic Class
     * @param id define an id for each Topic .(will be from SQL Later)
     * @param name define name for each Topic
     * @param description define description for each Topic
     */
    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
    /**
     * This method get id for each Topic
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * This method set id for each Topic
     * @param id set id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method get name for each Topic
     * @return name for each Topic
     */

    public String getName() {
        return name;
    }
    /**
     * This method set name for each Topic
     * @param name set name for each Topic
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * This method get description for each Topic
     * @return description for each Topic
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method set description for each Topic
     * @param description description for each Topic
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
