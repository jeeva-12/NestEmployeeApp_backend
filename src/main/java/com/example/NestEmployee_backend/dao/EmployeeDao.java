package com.example.NestEmployee_backend.dao;

import com.example.NestEmployee_backend.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee,Integer> {
    @Query(value = "SELECT `id`, `designation`, `ecode`, `eemail`, `emobile`, `ename`, `password`, `username` FROM `employee` WHERE `username` = :username AND `password` = :password",nativeQuery = true)
    List<Employee> UserLogin(@Param("username")String username,@Param("password") String password);

    @Query(value = "SELECT `id`, `designation`, `ecode`, `eemail`, `emobile`, `ename`, `password`, `username` FROM `employee` WHERE `ename` LIKE %:ename%",nativeQuery = true)
    List<Employee> SearchEmp(@Param("ename")String ename);
}
