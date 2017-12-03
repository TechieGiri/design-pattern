package com.techiegiri.pattern.creational.builder.interfaces.impl;

import com.techiegiri.pattern.creational.builder.interfaces.Burger;

public class VegBurger extends Burger {

	public String name() {
		return "Veg. Burger";
	}

	public float price() {
		return 10.5f;
	}

}
