package com.zephir0g.springtodolist.controller;

import com.zephir0g.springtodolist.entity.TodoElement;
import com.zephir0g.springtodolist.entity.data.service.TodoElementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class MainContoller {

    private TodoElementService todoElementService;

    public MainContoller(TodoElementService todoElementService){
        this.todoElementService = todoElementService;
    }

    @GetMapping("")
    public String index(Model model){
        List<TodoElement> notCompletedTask = todoElementService.findAllNotCompletedTasks();
        List<TodoElement> completedTask = todoElementService.findAllCompletedTasks();

        model.addAttribute("elementsCompleted", completedTask);
        model.addAttribute("elementsNotCompleted", notCompletedTask);


        return "index";
    }

    @PostMapping("/createElement")
    public String createElement(@RequestParam String task) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            if (!task.isEmpty()) {
                todoElementService.createItem(task, false, dateFormat.format(new Date()));
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return "redirect:/";
    }

    @PostMapping("/deleteElement")
    public String deleteElement(@RequestParam("taskId") long id){
        todoElementService.deleteItem(id);
        return "redirect:/";
    }

    @PostMapping("/editElement")
    public String editElement(@RequestParam("taskId") long id, @RequestParam("taskText") String taskText){
        try{
            todoElementService.editItem(id,taskText);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        return "redirect:/";
    }

    @PostMapping("/deleteAllCompletedTasks")
    public String deleteAllCompletedTasks(){
        todoElementService.deleteAllCompletedTasks();
        return "redirect:/";
    }

    @PostMapping("/taskСomplete/{id}")
    public String toggleTaskCompletion(@PathVariable("id") long id, boolean taskIsComplete){
        todoElementService.setIsComplete(id, !taskIsComplete);
        return "redirect:/";
    }
}
