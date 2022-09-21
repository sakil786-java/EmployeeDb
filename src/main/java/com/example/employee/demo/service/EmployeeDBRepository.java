package com.example.employee.demo.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.demo.entity.Employee;

public interface EmployeeDBRepository extends JpaRepository<Employee, Integer> {

}
