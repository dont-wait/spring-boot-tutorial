package com.dontwait.springboot.demo.dao;

import com.dontwait.springboot.demo.Entity.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee employee);
    void deleteById(int theId);
}

