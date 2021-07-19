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

    @Autowired
    private CourseService courseService;


    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses( @PathVariable String id) {
        return courseService.getAllCourses(id);
    }



    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id) {
        return courseService.getCourse(id);
    }


    @RequestMapping(method = RequestMethod.POST,value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course,@PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        courseService.updateCourse(course);
    }



    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{topicId}/courses/{id}")
    public void deleteTopic(@PathVariable String id){
        courseService.deleteCourse(id);
    }
}
