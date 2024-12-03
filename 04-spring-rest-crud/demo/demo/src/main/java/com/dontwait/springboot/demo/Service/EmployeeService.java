package com.dontwait.springboot.demo.Service;

import com.dontwait.springboot.demo.Entity.Employee;

import java.util.*;

public interface EmployeeService {
    List<Employee> getEmployees();
    Employee getEmployeeById(int id);
    Employee saveEmployee(Employee employee);
    void deleteEmployeeById(int id);
}
