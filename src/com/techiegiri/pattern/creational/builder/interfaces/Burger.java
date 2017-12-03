package com.techiegiri.pattern.creational.builder.interfaces;

import com.techiegiri.pattern.creational.builder.interfaces.impl.Wrapper;

public abstract class Burger implements Item {

	public Packing packing() {
		return new Wrapper();
	}
}
