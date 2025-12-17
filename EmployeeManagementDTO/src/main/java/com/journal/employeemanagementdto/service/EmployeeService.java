package com.journal.employeemanagementdto.service;


import com.journal.employeemanagementdto.dto.EmployeeDTO;
import com.journal.employeemanagementdto.entity.Employee;
import com.journal.employeemanagementdto.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<EmployeeDTO> getAllEmployees() {
        return employeeRepository.findAll()
                .stream()
                .map(emp -> new EmployeeDTO(emp.getName(), emp.getEmail()))
                .collect(Collectors.toList());
    }

    public Employee updateEmployee(Long id, Employee emp) {
        Employee existing = employeeRepository.findById(id).orElseThrow();
        existing.setName(emp.getName());
        existing.setEmail(emp.getEmail());
        existing.setSalary(emp.getSalary());
        return employeeRepository.save(existing);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
