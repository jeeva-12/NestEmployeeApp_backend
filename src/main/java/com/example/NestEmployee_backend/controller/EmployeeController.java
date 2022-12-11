package com.example.NestEmployee_backend.controller;

import com.example.NestEmployee_backend.dao.EmployeeDao;
import com.example.NestEmployee_backend.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.lang.model.util.Elements;
import java.util.HashMap;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao edao;

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/addEmp",consumes ="application/json",produces = "application/json" )
    public HashMap<String,String> AddEmp(@RequestBody Employee e){
        edao.save(e);
        HashMap<String,String> status=new HashMap<>();
        status.put("status","success");
        return status;
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/emplogin",consumes = "application/json",produces = "application/json")
    public HashMap<String,String> UserLogin(@RequestBody Employee e){
        List<Employee> employees=(List<Employee>) edao.UserLogin(e.getUsername(),e.getPassword());
        HashMap<String,String> map=new HashMap<>();
        if (employees.size()==0){
            map.put("status","failed");
        }else {
            map.put("status","success");
        }
        return map;
    }


    @CrossOrigin(origins = "*")
    @GetMapping(path = "/empsearch",consumes = "application/json",produces = "application/json")
    public List<Employee> SearchEmp(@RequestBody Employee e){
        return (List<Employee>) edao.SearchEmp(e.getEname());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/listEmployee")
    public List<Employee> EmployeeList(){
        return (List<Employee>) edao.findAll();
    }



}
