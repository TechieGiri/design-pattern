package com.techiegiri.pattern.structural.decorator;

import com.techiegiri.pattern.structural.decorator.interfaces.Car;

public class CarDecorator implements Car {
	protected Car car;

	public CarDecorator(Car car) {
		super();
		this.car = car;
	}

	public void assemble() {
		this.car.assemble();
	}

}
