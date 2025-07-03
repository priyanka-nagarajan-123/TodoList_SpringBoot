package com.todolist.list.service;

import java.util.List;

import com.todolist.list.modal.Todo;

public interface TodoService {
    void saveTask(Todo todo);
    List<Todo> getAllTasks();
    void deleteTask(int id);
Todo getTaskById(int id);}