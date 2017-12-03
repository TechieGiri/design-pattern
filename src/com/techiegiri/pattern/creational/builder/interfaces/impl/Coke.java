package com.techiegiri.pattern.creational.builder.interfaces.impl;

import com.techiegiri.pattern.creational.builder.interfaces.ColdDrink;

public class Coke extends ColdDrink {

	public String name() {
		return "Coke";
	}

	public float price() {
		return 5f;
	}

}
