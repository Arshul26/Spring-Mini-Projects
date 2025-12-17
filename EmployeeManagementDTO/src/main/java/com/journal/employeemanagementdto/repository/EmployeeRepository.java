package com.journal.employeemanagementdto.repository;

import com.journal.employeemanagementdto.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
