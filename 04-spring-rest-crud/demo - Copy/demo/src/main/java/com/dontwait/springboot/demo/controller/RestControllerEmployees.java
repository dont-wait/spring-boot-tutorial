package com.dontwait.springboot.demo.controller;

import com.dontwait.springboot.demo.entity.Employee;
import com.dontwait.springboot.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestControllerEmployees {
    private final EmployeeService service;

    @Autowired
    public RestControllerEmployees(EmployeeService service) {
        this.service = service;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return service.findAll();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int id) {
        Employee employee = service.findById(id);
        if(employee == null)
            throw new RuntimeException("Employee id not found - " + id);
        return employee;
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployeeById(@PathVariable int id) {
        service.deleteById(id);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        return service.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return service.save(employee);
    }


}
