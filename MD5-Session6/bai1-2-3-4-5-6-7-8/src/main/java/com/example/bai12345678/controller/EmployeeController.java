package com.example.bai12345678.controller;

import com.example.bai12345678.dao.EmployeeDAO;
import com.example.bai12345678.model.Employee;
import com.example.bai12345678.model.User;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = { "/employees"})
public class EmployeeController {
    @Autowired
    EmployeeDAO employeeDAO;

    @GetMapping()
    public String getAllEmployees(Model model) {
        List<Employee> employeeList = employeeDAO.getAllEmployee();
        model.addAttribute("employeeList", employeeList);
        return "employeeView";
    }

    @PostMapping
    public String saveEmployee(@ModelAttribute @Valid Employee employee, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("employee", employeeDAO.getAllEmployee()); // nếu cần quay lại danh sách
            return "employeeForm"; // Trả về lại form nếu có lỗi
        }

        employeeDAO.addEmployee(employee);
        return "redirect:/addEmployee";
    }

    @GetMapping("/addEmployee")
    public String addEmployee() {
        return "addEmployee";
    }
}
