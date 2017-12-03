package com.techiegiri.pattern.structural.composite.interfaces.impl;

import com.techiegiri.pattern.structural.composite.interfaces.Employee;

public class Cashier implements Employee {

	private int id;
	private String name;
	private double salary;
	
	
	public Cashier(int id, String name, double salary) {
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
		System.out.println("=======Cashier start===================");  
		System.out.println("Id ="+getId());  
		System.out.println("Name ="+getName());  
		System.out.println("Salary ="+getSalary());  
		System.out.println("=======Cashier end==================="); 
	}

	public void add(Employee emp) {
		// TODO Auto-generated method stub

	}

	public void remove(Employee emp) {
		// TODO Auto-generated method stub

	}

	public Employee getChild(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
