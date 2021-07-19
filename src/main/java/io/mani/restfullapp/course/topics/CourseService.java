package io.mani.restfullapp.course.topics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * This Class is a what called in spring boot business service
 * when the application starts spring make an instance from this service and register that instance.
 * then we can use this business service inside other classed or controllers
 */
@Service
public class CourseService {
    /**
     * this ia a repository for our Topics
     */
    @Autowired
    private CourseRepository courseRepository;

    /**
     * get all Courses
     * This service define an array List for our Courses and add all topics.
     * @param topicId specify the specific topic base on id . The course will be under this specific id in hierarchy.
     * @return all courses
     */
    public List<Course> getAllCourses(String topicId) {
        List<Course> courses = new ArrayList<>();
        //ignore this warning for know, it is ok
        courseRepository.findByTopicId(topicId).addAll(courses);
        //forEach(courses::add);
        return courses;
    }

    /**
     * get specific course base on given id
     * @param id this id specify the specific course to be able to get
     * @return specific course which find by id
     */
    public Optional<Course> getCourse(String id) {
        return courseRepository.findById(id);
    }

    /**
     * add course .
     * @param course course
     */
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    /**
     * update course
     * @param course course
     */
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    /**
     * delete course base on given id
     * @param id id to specify which course should be deleted.
     */

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
