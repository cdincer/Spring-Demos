package com.springbootcrm.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootcrm.demo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
