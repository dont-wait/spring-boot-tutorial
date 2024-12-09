package com.dontwait.springboot.demo.service;

import com.dontwait.springboot.demo.dao.EmployeeRepository;
import com.dontwait.springboot.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private final EmployeeRepository dao;
    @Autowired
    public EmployeeServiceImpl(EmployeeRepository dao) {
        this.dao = dao;
    }
    @Override
    public List<Employee> findAll() {
        return dao.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> rs = dao.findById(id);
        Employee employee = null;
        if (rs.isPresent()) {
            employee = rs.get();
        } else {
            throw new RuntimeException("Did not find employee with id: " + id);
        }
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        return dao.save(employee);
    }

    @Override
    public void deleteById(int id) {
        dao.deleteById(id);
    }

    //remove @transactional because jpa has call it so we dont need to call again
}
