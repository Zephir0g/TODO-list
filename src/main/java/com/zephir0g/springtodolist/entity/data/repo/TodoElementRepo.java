package com.zephir0g.springtodolist.entity.data.repo;

import com.zephir0g.springtodolist.entity.TodoElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface TodoElementRepo extends JpaRepository<TodoElement, Long> {

    TodoElement findTodoElementById(Long id);
    List<TodoElement> findAll();
    List<TodoElement> findAllByMarkTaskAsComplete(Boolean markTaskAsComplete);
  //  List<TodoElement> findAllByIsComplete(boolean isComplete);


}
