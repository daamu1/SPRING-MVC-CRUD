package com.saurabh.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saurabh.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
}
