package com.journal.employeemanagementdto.controller;

import com.journal.employeemanagementdto.dto.EmployeeDTO;
import com.journal.employeemanagementdto.entity.Employee;
import com.journal.employeemanagementdto.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService service) {
        this.employeeService = service;
    }

    @PostMapping
    public Employee create(@RequestBody Employee emp) {
        return employeeService.createEmployee(emp);
    }

    @GetMapping
    public List<EmployeeDTO> getAll() {
        return employeeService.getAllEmployees();
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id,
                           @RequestBody Employee emp) {
        return employeeService.updateEmployee(id, emp);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "Employee deleted successfully";
    }

}
