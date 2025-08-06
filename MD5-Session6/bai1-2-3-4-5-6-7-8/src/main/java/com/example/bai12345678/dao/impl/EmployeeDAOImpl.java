package com.example.bai12345678.dao.impl;

import com.example.bai12345678.dao.EmployeeDAO;
import com.example.bai12345678.model.Employee;
import com.example.bai12345678.util.DBConn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public List<Employee> getAllEmployee() {
        String sql = "{CALL get_all_employee()}";
        List<Employee> employees = new ArrayList<>();
        try (Connection connection = DBConn.getInstance().getConnection();
             CallableStatement stmt = connection.prepareCall(sql);) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee();
                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setPosition(rs.getString("position"));
                employees.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        String sql = "{CALL add_employee(?,?,?)}";
        try (Connection connection = DBConn.getInstance().getConnection();
             CallableStatement stmt = connection.prepareCall(sql);) {
            stmt.setString(1, employee.getName());
            stmt.setString(2, employee.getEmail());
            stmt.setString(3, employee.getPosition());
            int row = stmt.executeUpdate();
            if (row > 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
