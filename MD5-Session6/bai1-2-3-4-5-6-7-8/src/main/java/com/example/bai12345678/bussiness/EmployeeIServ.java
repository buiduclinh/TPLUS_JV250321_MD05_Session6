package com.example.bai12345678.bussiness;

import com.example.bai12345678.model.Employee;

import java.util.List;

public interface EmployeeIServ {
    List<Employee> getAllEmployee();

    boolean addEmployee(Employee employee);
}
