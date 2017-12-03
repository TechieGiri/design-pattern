package com.techiegiri.pattern.creational.builder.interfaces.impl;

import com.techiegiri.pattern.creational.builder.interfaces.Burger;

public class ChickenBurger extends Burger {

	public String name() {
		return "Chi. Burger";
	}

	public float price() {
		return 11.00f;
	}
}
