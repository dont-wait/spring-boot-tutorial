package com.dontwait.springboot.demo.Service;

import com.dontwait.springboot.demo.Entity.Employee;
import com.dontwait.springboot.demo.dao.EmployeeIDaompl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeIDaompl dao;
    @Autowired
    public EmployeeServiceImpl(EmployeeIDaompl dao) {
        this.dao = dao;
    }
    @Override
    public List<Employee> getEmployees() {
        return dao.findAll();
    }

    @Override
    public Employee getEmployeeById(int id) {
        return dao.findById(id);
    }

    @Override
    @Transactional
    public Employee saveEmployee(Employee employee) {
        return dao.save(employee);
    }

    @Override
    @Transactional
    public void deleteEmployeeById(int id) {
        dao.deleteById(id);
    }

}
