package com.zephir0g.springtodolist.entity.data.service;

import com.zephir0g.springtodolist.entity.TodoElement;
import com.zephir0g.springtodolist.entity.data.repo.TodoElementRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoElementService {

    private TodoElementRepo todoElementRepo;

    public TodoElementService(TodoElementRepo todoElementRepo) {
        this.todoElementRepo = todoElementRepo;
    }

    public void createItem(String text, boolean markTaskAsComplete, String addDate) {
        TodoElement element = new TodoElement(text, markTaskAsComplete, addDate);
        todoElementRepo.save(element);
    }

    public TodoElement findItem(Long id) {
        return todoElementRepo.findTodoElementById(id);
    }

    public List<TodoElement> findAll() {
        return todoElementRepo.findAll();
    }

    public void editItem(Long id, String text) {
        TodoElement element = todoElementRepo.findTodoElementById(id);
        element.setText(text);
        todoElementRepo.save(element);
    }

    public void deleteItem(Long id) {
        todoElementRepo.deleteById(id);
    }

    public void setIsComplete(Long id, boolean markTaskAsComplete) {
        TodoElement element = findItem(id);
        element.setMarkTaskAsComplete(markTaskAsComplete);
        todoElementRepo.save(element);
    }

    public void deleteAllCompletedTasks(){
        List<TodoElement> completedTask = findAllCompletedTasks();
        for(TodoElement task : completedTask){
            todoElementRepo.deleteById(task.getId());
        }
    }

    public List<TodoElement> findAllCompletedTasks() {
        return todoElementRepo.findAllByMarkTaskAsComplete(true);
    }

    public List<TodoElement> findAllNotCompletedTasks() {
        return todoElementRepo.findAllByMarkTaskAsComplete(false);
    }

}
