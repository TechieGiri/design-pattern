package com.techiegiri.pattern.structural.composite.interfaces.impl;

import java.util.ArrayList;
import java.util.List;

import com.techiegiri.pattern.structural.composite.interfaces.Employee;

public class BankManager implements Employee {

	private int id;
	private String name;
	private double salary;
	List<Employee> empList = new ArrayList<Employee>();

	public BankManager(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void print() {

		for (Employee emp : empList) {
			System.out.println("Printing the manager employee-start====");
			System.out.println("Id:" + emp.getId());
			System.out.println("Name:" + emp.getName());
			System.out.println("Salary:" + emp.getSalary());
			System.out.println("Printing the manager employee-end====");
		}
	}

	public void add(Employee emp) {
		empList.add(emp);
	}

	public void remove(Employee emp) {
		empList.remove(emp);
	}

	public Employee getChild(int i) {
		return null;
	}
}