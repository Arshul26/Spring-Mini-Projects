package com.journal.employeemanagementdto.controller;

import com.journal.employeemanagementdto.dto.EmployeeDTO;
import com.journal.employeemanagementdto.dto.EmployeeResponseDTO;
import com.journal.employeemanagementdto.response.ApiResponse;
import com.journal.employeemanagementdto.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService service) {
        this.employeeService = service;
    }

    @PostMapping
    public ResponseEntity<ApiResponse<EmployeeResponseDTO>> create(
            @Valid @RequestBody EmployeeDTO dto) {

        EmployeeResponseDTO saved = employeeService.createEmployee(dto);
        return ResponseEntity.status(201)
                .body(new ApiResponse<>("Employee created successfully", saved));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<EmployeeResponseDTO>>> getAll() {
        List<EmployeeResponseDTO> list = employeeService.getAllEmployees();
        return ResponseEntity.ok(new ApiResponse<>("Employees fetched", list));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<EmployeeResponseDTO>> update(
            @PathVariable Long id,
            @Valid @RequestBody EmployeeDTO dto) {

        EmployeeResponseDTO updated = employeeService.updateEmployee(id, dto);
        return ResponseEntity.ok(new ApiResponse<>("Employee updated", updated));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok(new ApiResponse<>("Employee deleted", null));
    }
}