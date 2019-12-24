package com.springbootcrm.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcrm.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
//http://localhost:8080/api-res/employees/4 is for puts,everything else is same
}
