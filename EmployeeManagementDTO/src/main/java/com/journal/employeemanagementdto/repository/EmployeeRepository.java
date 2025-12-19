package com.journal.employeemanagementdto.repository;

import com.journal.employeemanagementdto.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
//Employee is the entity class the repository manages,
//and Long is the data type of its primary key.
//Spring Data JPA uses this information to auto-generate CRUD methods.