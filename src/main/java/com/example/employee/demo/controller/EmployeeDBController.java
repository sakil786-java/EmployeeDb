package com.example.employee.demo.controller;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.demo.entity.Employee;
import com.example.employee.demo.service.EmployeeDBRepository;

@RestController
@RequestMapping("empdb")
public class EmployeeDBController {

	@Autowired
	EmployeeDBRepository empdbrepo;
	
	@GetMapping("/showall")
	public List<Employee> showAll()
	{
		return empdbrepo.findAll();
	}
	
	
	@GetMapping("/show/{id}")
	public Optional<Employee> show(@PathVariable("id") int empid)
	{
		return empdbrepo.findById(empid);
	}
	
	@GetMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int empid)
	{
		 empdbrepo.deleteById(empid);
	}
	
	@PostMapping("/add")
	public Employee add(@RequestBody Employee emp)
	{
		return empdbrepo.save(emp);
		
	}
	
}
