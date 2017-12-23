package com.techiegiri.pattern.behaviourial.visitor.interfaces;

public abstract class Product {

	protected float price;

	public abstract void accept(Visitor visitor);

	public float getPrice() {
		return price;
	}

}