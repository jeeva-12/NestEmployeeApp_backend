package com.example.NestEmployee_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String ename;
    private String ecode;
    private String eemail;
    private String emobile;
    private String designation;
    private String username;
    private String password;

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEcode() {
        return ecode;
    }

    public void setEcode(String ecode) {
        this.ecode = ecode;
    }

    public String getEemail() {
        return eemail;
    }

    public void setEemail(String eemail) {
        this.eemail = eemail;
    }

    public String getEmobile() {
        return emobile;
    }

    public void setEmobile(String emobile) {
        this.emobile = emobile;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee(int id, String ename, String ecode, String eemail, String emobile, String designation, String username, String password) {
        this.id = id;
        this.ename = ename;
        this.ecode = ecode;
        this.eemail = eemail;
        this.emobile = emobile;
        this.designation = designation;
        this.username = username;
        this.password = password;


    }
}
