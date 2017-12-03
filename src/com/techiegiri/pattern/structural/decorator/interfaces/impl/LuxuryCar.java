package com.techiegiri.pattern.structural.decorator.interfaces.impl;

import com.techiegiri.pattern.structural.decorator.CarDecorator;
import com.techiegiri.pattern.structural.decorator.interfaces.Car;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
	}

	public void assemble() {
		super.assemble();
		System.out.println("Adding luxury car feature");
	}

}
