package com.example.NestEmployee_backend.controller;

import com.example.NestEmployee_backend.dao.EmployeeDao;
import com.example.NestEmployee_backend.dao.TaskDao;
import com.example.NestEmployee_backend.model.Employee;
import com.example.NestEmployee_backend.model.Task;
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
    @PostMapping(path = "/userLogin",consumes ="application/json",produces = "application/json" )
    public HashMap<String,String> UserLogin(@RequestBody Employee e){
        List<Employee> employees=(List<Employee>) edao.UserLogin(e.getUsername(),e.getPassword());
        HashMap<String,String> h=new HashMap<>();
        if (employees.size()==0){
            h.put("status","failed");
        }else {
            h.put("status","success");
            h.put("userId",String.valueOf(employees.get(0)));
        }
        return h;

    }

    @CrossOrigin(origins = "*")
    @PostMapping("/getEmp")
    public List<Employee> GetEmployee(){
        return (List<Employee>) edao.findAll();
    }



    @CrossOrigin(origins = "*")
    @GetMapping(path = "/empsearch",consumes = "application/json",produces = "application/json")
    public List<Employee> SearchEmp(@RequestBody Employee e){
        return (List<Employee>) edao.SearchEmp(e.getEname());
    }


}
