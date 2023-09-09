package com.example.collectionslists090923.service;


import com.example.collectionslists090923.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();



    public Employee add(String firstName, String lastName) {
        Employee newEmployee = new Employee(firstName, lastName);
        employees.add(newEmployee);
        return newEmployee;
    }
    public Employee remove(String firstName, String lastName) {
        Employee employeeToRemove = new Employee(firstName, lastName);
        employees.remove(employeeToRemove);
        return employeeToRemove;

    }
    public Employee get(String firstName, String lastName) {
        return null;
    }

    public List<Employee> getAll() {
        return employees;
    }
}