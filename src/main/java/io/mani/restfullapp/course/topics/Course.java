package io.mani.restfullapp.course.topics;



import io.mani.restfullapp.topics.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
/**
 * This class shows each Course in our website which is under the Topics
 */
@Entity
public class Course {

    /**
     * String Id to specify unique specifier for each Course
     * obviously later will be come from PostgreSQL
     *
     */
    @Id
    private String id;
    /**
     * This is refer to name of each Course
     */
    private String name;
    /**
     * this refers to description of each Course
     */
    private String description;

    /**
     * this is to make a relation between Topic and Course
     * Because each Topic have potentially many Course under itself the relation is Many to one
     * with this annotation comes the relation between these two sources.
     */
    @ManyToOne
    private Topic topic;

    /**
     * this is an empty constructor which works as default but in our case it is only for development purpose.
     */
    public Course() {

    }

    /**
     * this is the main constructor for Course Class
     * @param id define an id for each course .(will be from SQL Later)
     * @param name define name for each Course
     * @param description define description for each course
     * @param topicId define Topic id for each Topic
     */

    public Course(String id, String name, String description,String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId, "", "");
    }

    /**
     * This method get id for each Course
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * This method set id for each course
     * @param id set id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * This method get name for each course
     * @return name for each course
     */

    public String getName() {
        return name;
    }

    /**
     * This method set name for each course
     * @param name set name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method get description for each course
     * @return description for each course
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method set description for each course
     * @param description description for each Course
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method get topics for each course
     * @return topic for each course
     */
    public Topic getTopic() {
        return topic;
    }

    /**
     * This method set topic for each course
     * @param topic set topic for each course
     */
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}
