package com.google.sbrest_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.google.sbrest_crud.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
