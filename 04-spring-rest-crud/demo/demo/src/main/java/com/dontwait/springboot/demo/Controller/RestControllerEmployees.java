package com.dontwait.springboot.demo.Controller;

import com.dontwait.springboot.demo.Entity.Employee;
import com.dontwait.springboot.demo.Service.EmployeeService;
import com.dontwait.springboot.demo.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return service.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        Employee employee = service.getEmployeeById(employeeId);
        if(employee == null)
            throw new RuntimeException("Employee id not found - " + employeeId);
        return employee;
    }

    @GetMapping("/employees/{id}")
    public void deleteEmployeeById(@PathVariable int id) {
        service.deleteEmployeeById(id);
    }

//    @GetMapping("/employees/")
//    public Employee saveEmployee() {
//        return service.saveEmployee();
//    }
}
