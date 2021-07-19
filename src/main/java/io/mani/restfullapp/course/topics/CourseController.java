package io.mani.restfullapp.course.topics;


import io.mani.restfullapp.topics.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * This is a Controller class
 * Controller Class in Spring  is a class that has Controller annotation and
 * with this annotation Spring knows that what is the URL that we are mapping to
 * and what should happen when the request comes to this certain URL.
 * we provide both of them with class itself and annotation.
 */

@RestController
public class CourseController {

    /**
     * with Autowired we define our service provider for this class
     */
    @Autowired
    private CourseService courseService;

    /**
     * with this method we get all course which are under the specific topic it can be null one or many
     * @param id with this id we specify which topic we have in parent category.
     * @return all courses in our service which is under the specific id
     */
    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses( @PathVariable String id) {
        return courseService.getAllCourses(id);
    }



    /**
     * with this method we get specific course  base on given id which are under the specific topic
     * @param id with this id we specify which course we are looking for
     * @return specific course base on given id
     */
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }


    /**
     * with this method we add new course to our program.
     * @param course the course which will be added
     * @param topicId the id to show under which topic category this specific course mus be saved.
     */
    @RequestMapping(method = RequestMethod.POST,value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    /**
     * with this method we update course base on given id
     * @param course the course that should be updated.
     * @param topicId shows the specific course to be updated.
     */
    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }


    /**
     * with this method we will delete course base on specific given id
     * @param id id to specify which course should be deleted.
     */
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{topicId}/courses/{id}")
    public void deleteTopic(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
