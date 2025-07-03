package com.todolist.list.modal;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;
    private String status;
    private LocalDate dueDate;

   
    public int getId() 
    { return id; 
    }
    public void setId(int id)
     { 
        this.id = id; 
    }

    public String getTitle()
     {
         return title; 
        }
    public void setTitle(String title) {
         this.title = title;
         }

    public String getDescription() { 
        return description; 
    }
    public void setDescription(String description)
     {
         this.description = description;
         }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public LocalDate getDueDate() { return dueDate; }
    public void setDueDate(LocalDate dueDate) { this.dueDate = dueDate; }
}