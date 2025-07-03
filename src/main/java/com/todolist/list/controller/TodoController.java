package com.todolist.list.controller;

import com.todolist.list.modal.Todo;
import com.todolist.list.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        List<Todo> list = service.getAllTasks();
        model.addAttribute("list", list);
        return "index";
    }

    @GetMapping("/addTask")
    public String showAddForm(Model model) {
        model.addAttribute("todo", new Todo());
        return "addTask";
    }

    @PostMapping("/saveTask")
    public String saveTask(@ModelAttribute("todo") Todo todo) {
        service.saveTask(todo);
        return "redirect:/";
    }

    @GetMapping("/deleteTask/{id}")
    public String deleteTask(@PathVariable("id") int id) {
        service.deleteTask(id);
        return "redirect:/";
    }

    @GetMapping("/editTask/{id}")
    public String editTask(@PathVariable("id") int id, Model model) {
        Todo todo = service.getTaskById(id);
        model.addAttribute("todo", todo);
        return "addTask";
    }

    @GetMapping("/markComplete/{id}")
    public String markComplete(@PathVariable("id") int id) {
        Todo todo = service.getTaskById(id);
        todo.setStatus("Completed");
        service.saveTask(todo);
        return "redirect:/";
    }
}