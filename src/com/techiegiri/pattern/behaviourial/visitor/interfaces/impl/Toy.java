package com.techiegiri.pattern.behaviourial.visitor.interfaces.impl;

import com.techiegiri.pattern.behaviourial.visitor.interfaces.Product;
import com.techiegiri.pattern.behaviourial.visitor.interfaces.Visitor;

public class Toy extends Product {

	private String name;
	private String ageGroup;

	public Toy(String name, String ageGroup, float price) {
		super();
		this.name = name;
		this.ageGroup = ageGroup;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	@Override
	public void accept(Visitor visitor) {
		System.out.println("Toy visited");
		//visitor.visit(this);
	}

}
