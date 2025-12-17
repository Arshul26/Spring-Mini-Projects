package com.example.employeemanager.employeemanagerapplication.controller;

import com.example.employeemanager.employeemanagerapplication.service.EmployeeService;
import com.example.employeemanager.employeemanagerapplication.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

//    public EmployeeController(EmployeeService employeeService) { // Constructor Injection
//        this.employeeService = employeeService;
//    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){ // Endpoint to get all employees
        return employeeService.getAllEmployees();
    }
}
