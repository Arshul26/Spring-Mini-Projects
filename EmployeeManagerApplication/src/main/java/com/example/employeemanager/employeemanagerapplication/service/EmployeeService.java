package com.example.employeemanager.employeemanagerapplication.service;

import com.example.employeemanager.employeemanagerapplication.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(1, "Arshul", 50000));
        employees.add(new Employee(2, "Amit", 60000));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
}
