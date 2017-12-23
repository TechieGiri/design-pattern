package com.techiegiri.pattern.behaviourial.visitor.interfaces.impl;

import com.techiegiri.pattern.behaviourial.visitor.interfaces.Product;
import com.techiegiri.pattern.behaviourial.visitor.interfaces.Visitor;

public class Clothes extends Product {

	private String name;
	private int size;

	public Clothes(String name, int size, float price) {
		super();
		this.name = name;
		this.size = size;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public void accept(Visitor visitor) {
		System.out.println("Clothes visited");
		//visitor.visit(this);
	}

}