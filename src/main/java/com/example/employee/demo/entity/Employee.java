package com.example.employee.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private  int id;
	private String ename;
	private double salary;
	public Employee() {
		super();
		
	}
	public Employee(int id, String ename, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", salary=" + salary + "]";
	}
	

}
