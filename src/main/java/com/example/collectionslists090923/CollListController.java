package com.example.collectionslists090923;

import com.example.collectionslists090923.model.Employee;
import com.example.collectionslists090923.service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("employee")
public class CollListController {

    private final EmployeeService employeeService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


    @GetMapping(path = "/add")
    public Employee add(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.add(firstName, lastName);
    }
    @GetMapping(path = "/remove")
    public Employee remove(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.remove(firstName, lastName);
    }
    @GetMapping(path = "/get")
    public Employee get(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.get(firstName, lastName);
    }

    public CollListController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping
    public List<Employee> getAll() {
        return employeeService.getAll();
    }
}

