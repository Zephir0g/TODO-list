// Import necessary packages
package com.zephir0g.springtodolist.entity.data.repo;

import com.zephir0g.springtodolist.entity.TodoElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

// Annotate the interface as a Repository to indicate that it's a Spring Data JPA repository
@Repository
// Enable JPA repositories. This is generally only needed on your main application class
@EnableJpaRepositories
public interface TodoElementRepo extends JpaRepository<TodoElement, Long> {

    // Declare method to find a TodoElement by its ID
    TodoElement findTodoElementById(Long id);

    // Declare method to find all TodoElements
    List<TodoElement> findAll();

    // Declare method to find all TodoElements by their completion status
    List<TodoElement> findAllByMarkTaskAsComplete(Boolean markTaskAsComplete);

    // Uncomment this if you want to find all TodoElements by their 'isComplete' field
}