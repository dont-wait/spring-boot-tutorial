package com.dontwait.springboot.demo.dao;

import com.dontwait.springboot.demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // no need to write code =)
}
