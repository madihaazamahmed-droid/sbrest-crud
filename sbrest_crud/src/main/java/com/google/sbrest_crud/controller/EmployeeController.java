package com.google.sbrest_crud.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.google.sbrest_crud.dto.Employee;
import com.google.sbrest_crud.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public String insertData(@RequestBody Employee employee) {
        return employeeService.insertData(employee);
    }

    @GetMapping("/{id}")
    public Object fetchById(@PathVariable int id) {
        return employeeService.fetchById(id);
    }

    @GetMapping
    public Object fetchAll() {
        return employeeService.fetchAll();
    }
    
    @DeleteMapping
    public String deleteAll() {
    	return employeeService.deleteAll();
    }
    
    
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) {
    	return employeeService.deleteById(id);
    }
    
    @PostMapping("/all")
    public String insertAllData(@RequestBody List<Employee> employee) {
    	return employeeService.insertAllData(employee);
    }
    @PatchMapping
    public String update(@RequestBody Employee employee) {
    	return employeeService.update(employee);
    
    }
}