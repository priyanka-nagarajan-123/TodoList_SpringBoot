package com.todolist.list.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.list.modal.Todo;
import com.todolist.list.repository.TodoRepository;

@Service
public class TodoServiceImp implements TodoService {

    @Autowired
    private TodoRepository repo;

    @Override
    public void saveTask(Todo todo) {
        repo.save(todo);
    }

    @Override
    public List<Todo> getAllTasks() {
        return repo.findAll();
    }

    @Override
    public void deleteTask(int id) {
        repo.deleteById(id);
    }

@Override
    public Todo getTaskById(int id) {
        return repo.findById(id).orElse(null);
    }}