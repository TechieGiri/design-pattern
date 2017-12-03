package com.techiegiri.pattern.structural.composite.interfaces.impl;

import com.techiegiri.pattern.structural.composite.interfaces.Employee;

public class Accountant implements Employee{

	private int id;
	private String name;
	private double salary;
	
	public Accountant(int id, String name, double salary) {
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
		System.out.println("==========Acc start================");  
		System.out.println("Id ="+getId());  
		System.out.println("Name ="+getName());  
		System.out.println("Salary ="+getSalary());  
		System.out.println("=============Acc end============="); 
	}

	public void add(Employee emp) {
	}

	public void remove(Employee emp) {
	}

	public Employee getChild(int i) {
		return null;
	}
}
