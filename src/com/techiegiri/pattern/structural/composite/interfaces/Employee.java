package com.techiegiri.pattern.structural.composite.interfaces;

// Component
public interface Employee {
	
	public int getId();
	public String getName();
	public double getSalary();
	public void print();
	public void add(Employee emp);
	public void remove(Employee emp);
	public Employee getChild(int i);
}
