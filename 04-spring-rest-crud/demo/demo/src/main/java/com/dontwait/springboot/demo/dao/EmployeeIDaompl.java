package com.dontwait.springboot.demo.dao;

import com.dontwait.springboot.demo.Entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public class EmployeeIDaompl implements EmployeeDao {

    private final EntityManager entityManager;
    @Autowired
    public EmployeeIDaompl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        //Create query, pass for entityManager help I
        //TypedQuery<Employee> createQueryToGetEmployees = entityManager.createQuery("FROM Employee ", Employee.class);
        //return createQueryToGetEmployees;
        return entityManager.createQuery("FROM Employee ", Employee.class).getResultList();
    }

    @Override
    public Employee findById(int theId) {
        return entityManager.find(Employee.class, theId);
    }

    @Override
    public Employee save(Employee employess) {
        return entityManager.merge(employess);
    }

    @Override
    public void deleteById(int theId) {
        //Find employee by id and remove it from db
        entityManager.remove(entityManager.find(Employee.class, theId));
    }
}
