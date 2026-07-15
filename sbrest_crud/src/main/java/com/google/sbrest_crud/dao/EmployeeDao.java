package com.google.sbrest_crud.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.google.sbrest_crud.dto.Employee;
import com.google.sbrest_crud.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

    @Autowired
    EmployeeRepository employeeRepository;

    public String insertData(Employee employee) {
        employeeRepository.save(employee);
        return "Data Inserted";
    }

    public Optional <Employee> fetchById(int id) {
        Optional<Employee> oe = employeeRepository.findById(id);
        return oe;
        }

    public List<Employee> fetchAll() {
        return employeeRepository.findAll();
    }
    
    public String update(Employee employee) {
    	employeeRepository.save(employee);
    	return "data updated";
    }
    
    public String insertAllData(List<Employee> employee) {
    	employeeRepository.saveAll(employee);
    	return "a_di all data inserted";
    }
    }
    
    