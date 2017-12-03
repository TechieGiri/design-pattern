package com.techiegiri.pattern.structural.decorator;

import com.techiegiri.pattern.structural.decorator.interfaces.Car;
import com.techiegiri.pattern.structural.decorator.interfaces.impl.BasicCar;
import com.techiegiri.pattern.structural.decorator.interfaces.impl.LuxuryCar;
import com.techiegiri.pattern.structural.decorator.interfaces.impl.SportsCar;

/*
 * @author Techie Giri
 * Pattern: Decorator Pattern
 * Pattern Type: Structural Design Pattern
 * Pattern Description: Decorator design pattern is used to 
 * 						modify the functionality of an object 
 * 						at runtime. At the same time other 
 * 						instances of the same class will not be 
 * 						affected by this, so individual object 
 * 						gets the modified behavior. 
 * 
 * Advantage: Change feature dynamically. 
 */

public class DecoratorDemo {

	public static void main(String[] args) {
		Car basicCar = new BasicCar();
		basicCar.assemble();
		System.out.println("==============");

		Car luxCar = new CarDecorator(new LuxuryCar(new BasicCar()));
		luxCar.assemble();

		System.out.println("==============");

		Car sportsCar = new CarDecorator(new SportsCar(new BasicCar()));
		sportsCar.assemble();

		System.out.println("==============");

		Car luxSportsCar = new CarDecorator(new SportsCar(new LuxuryCar(
				new BasicCar())));
		luxSportsCar.assemble();

		System.out.println("==============");
	}

}
