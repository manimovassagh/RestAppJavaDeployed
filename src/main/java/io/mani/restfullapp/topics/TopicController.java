package io.mani.restfullapp.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * this is our Topic Controller Class
 * with this class we define the returns for each request to specific URL
 */
@RestController
public class TopicController {
    /**
     * with Autowired we define our service provider for this class
     */
    @Autowired
    private TopicService topicService;


    /**
     * this method return all topic lists when a get method comes to /topics URL
     *
     * @return All Topics in List
     */
    @RequestMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    /**
     * this method return specific topic base on id when a get method comes to /topics/{id} URL
     * in this case id is dynamic and specified by each request.
     *
     * @return All Topics in List
     */
    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    /**
     * this method post a topic when the post method comes to URL
     * in this case the value is the URL and we post each time a topic to this URL
     */
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopics(topic);
    }

    /**
     * this method put a topic when the put method comes to URL
     * that means we can edit each topic based on id
     *
     * @param topic topic
     * @param id    id of each topic
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
        topicService.updateTopics(id, topic);
    }

    /**
     * This method delete a topic base on specific given id
     *
     * @param id id to specify which topic must be deleted.
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopics(id);
    }
}
