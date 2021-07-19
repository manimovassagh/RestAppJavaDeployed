package io.mani.restfullapp.course.topics;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * this interface extends CrudRepository which is create, read, update and delete.
 * with this interface we need less boilerplate for the crud functionality.
 */
public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);

}
