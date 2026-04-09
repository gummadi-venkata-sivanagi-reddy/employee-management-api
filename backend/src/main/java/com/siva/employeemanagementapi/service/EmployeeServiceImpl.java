package com.siva.employeemanagementapi.service;

import com.siva.employeemanagementapi.dto.EmployeeDto;
import com.siva.employeemanagementapi.entity.Employee;
import com.siva.employeemanagementapi.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto dto) {
        // Business Logic: Check duplicate email
        if(employeeRepository.existsByEmail(dto.getEmail())) {
            throw new RuntimeException("Email already exists!");
        }

        Employee employee = new Employee(null, dto.getName(), dto.getEmail(), dto.getDepartment(), dto.getSalary());
        Employee saved = employeeRepository.save(employee);
        return new EmployeeDto(saved.getId(), saved.getName(), saved.getEmail(), saved.getDepartment(), saved.getSalary());
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(emp -> new EmployeeDto(emp.getId(), emp.getName(), emp.getEmail(), emp.getDepartment(), emp.getSalary()))
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto getEmployeeById(Long id) {
        Employee emp = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));
        return new EmployeeDto(emp.getId(), emp.getName(), emp.getEmail(), emp.getDepartment(), emp.getSalary());
    }

    @Override
    public EmployeeDto updateEmployee(Long id, EmployeeDto dto) {
        Employee emp = employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with id: " + id));

        emp.setName(dto.getName());
        emp.setEmail(dto.getEmail());
        emp.setDepartment(dto.getDepartment());
        emp.setSalary(dto.getSalary());

        Employee updated = employeeRepository.save(emp);
        return new EmployeeDto(updated.getId(), updated.getName(), updated.getEmail(), updated.getDepartment(), updated.getSalary());
    }

    @Override
    public void deleteEmployee(Long id) {
        if(!employeeRepository.existsById(id)) {
            throw new RuntimeException("Employee not found with id: " + id);
        }
        employeeRepository.deleteById(id);
    }
}