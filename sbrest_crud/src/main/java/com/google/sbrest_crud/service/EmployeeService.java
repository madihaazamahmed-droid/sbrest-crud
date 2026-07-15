package com.google.sbrest_crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.sbrest_crud.dao.EmployeeDao;
import com.google.sbrest_crud.dto.Employee;
import com.google.sbrest_crud.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDao employeeDao;

    @Autowired
    EmployeeRepository employeeRepository;

    public String insertData(Employee employee) {
        return employeeDao.insertData(employee);
    }

    public Object fetchById(int id) {
        Optional<Employee> oe = employeeDao.fetchById(id);
        if (oe.isPresent()) {
            return oe.get();
        } else {
            return "no data found with id " + id;
        }
    }

    public Object fetchAll() {
        List<Employee> l = employeeDao.fetchAll();
        if (l.isEmpty()) {
            return "no data found";
        } else {
            return l;
        }
    }

    public String deleteAll() {
        List<Employee> l = employeeDao.fetchAll();
        if (l.isEmpty()) {
            return "no data found";
        } else {
            employeeRepository.deleteAll();
            return "data deleted";
        }
        
        
    }

    public String deleteById(int id) {
        Optional<Employee> oe = employeeDao.fetchById(id);
        if (oe.isPresent()) {
            employeeRepository.deleteById(id);
            return "data deleted";
        } else {
            return "no data found";
        }
    }
    
    
        public String update(Employee employee) {
        	return employeeDao.update(employee);
        }
        
        
        
        public String insertAllData(List<Employee> employee) {
        	return employeeDao.insertAllData(employee);
         
}
        
}