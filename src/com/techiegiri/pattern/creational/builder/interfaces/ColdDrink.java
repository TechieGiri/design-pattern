package com.techiegiri.pattern.creational.builder.interfaces;

import com.techiegiri.pattern.creational.builder.interfaces.impl.Bottle;

public abstract class ColdDrink implements Item {

	public Packing packing() {
		return new Bottle();
	}
}
