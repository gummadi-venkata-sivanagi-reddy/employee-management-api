package com.siva.employeemanagementapi.dto;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String name;
    private String email;
    private String department;
    private double salary;
}