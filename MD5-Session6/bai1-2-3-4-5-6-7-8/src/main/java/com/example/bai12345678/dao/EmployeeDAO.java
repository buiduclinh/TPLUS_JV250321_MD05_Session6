package com.example.bai12345678.dao;

import com.example.bai12345678.model.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeDAO {
    List<Employee> getAllEmployee();

    boolean addEmployee(Employee employee);
}
