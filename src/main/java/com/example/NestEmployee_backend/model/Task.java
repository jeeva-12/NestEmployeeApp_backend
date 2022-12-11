package com.example.NestEmployee_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String title;
    private String description;
    private String status;
    private String givendate;
    private String completiondate;
    private int empId;

}
