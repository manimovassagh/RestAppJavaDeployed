package io.mani.restfullapp.topics;


import org.springframework.data.repository.CrudRepository;

/**
 * this interface extends CrudRepository which is create, read, update and delete.
 * with this interface we need less boilerplate for the crud functionality.
 */
public interface TopicRepository extends CrudRepository<Topic, String> {

}
