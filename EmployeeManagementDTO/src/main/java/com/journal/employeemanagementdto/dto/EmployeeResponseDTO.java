package com.journal.employeemanagementdto.dto;

public class EmployeeResponseDTO {
    //private Long id;
    private String name;
    private String email;
    //private Double salary;

    public EmployeeResponseDTO(String name, String email) {
        //this.id = id;
        this.name = name;
        this.email = email;
        //this.salary = salary;
    }

//    public Long getId() {
//        return id;
//    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

//    public Double getSalary() {
//        return salary;
//    }

}
