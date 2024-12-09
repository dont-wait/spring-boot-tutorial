package com.dontwait.springboot.demo.service;

import com.dontwait.springboot.demo.entity.Employee;

import java.util.*;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee employee);
    void deleteById(int theId);
}
