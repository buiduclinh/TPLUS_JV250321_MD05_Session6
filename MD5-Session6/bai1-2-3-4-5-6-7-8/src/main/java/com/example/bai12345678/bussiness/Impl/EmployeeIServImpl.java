package com.example.bai12345678.bussiness.Impl;

import com.example.bai12345678.bussiness.EmployeeIServ;
import com.example.bai12345678.dao.EmployeeDAO;
import com.example.bai12345678.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeIServImpl implements EmployeeIServ {
    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeDAO.getAllEmployee();
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return employeeDAO.addEmployee(employee);
    }
}
