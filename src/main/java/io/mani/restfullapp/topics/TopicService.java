package io.mani.restfullapp.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This Class is a what called in spring boot business service
 * when the application starts spring make an instance from this service and register that instance.
 * then we can use this business service inside other classed or controllers
 *
 */
@Service
public class TopicService {
    /**
     * this ia a repository for our Topics
     */
    @Autowired
    private TopicRepository topicRepository;

    /**
     * get all topics
     * this service define an arrayList for our topics in embedded database and return topics
     * @return topics
     */
    public List<Topic> getAllTopics() {
        // return topics;
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }


    /**
     * get specific Topic base on id
     * @param id specific topic id
     * @return specific topic in repository base on id
     */
    public Optional<Topic> getTopic(String id) {
             return topicRepository.findById(id);

    }

    /**
     * add topic to our repository
     * @param topic topic
     */
    public void addTopics(Topic topic) {
        topicRepository.save(topic);
    }

    /**
     * update each topic base on specific id
     * @param id id for each topic
     * @param topic topic
     */
    public void updateTopics(String id, Topic topic) {
        topicRepository.save(topic);


    }

    /**
     * delete topic base on given id
     * @param id specific is for topic
     */
    public void deleteTopics(String id) {
        topicRepository.deleteById(id);

    }
}
