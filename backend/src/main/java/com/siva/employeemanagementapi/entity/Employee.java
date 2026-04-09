package com.siva.employeemanagementapi.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String name;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email;

    private String department;

    private double salary;
}