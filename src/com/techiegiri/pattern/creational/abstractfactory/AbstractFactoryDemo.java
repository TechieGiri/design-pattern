package com.techiegiri.pattern.creational.abstractfactory;

import com.techiegiri.pattern.creational.abstractfactory.interfaces.Color;
import com.techiegiri.pattern.creational.abstractfactory.interfaces.Shape;
import com.techiegiri.pattern.creational.abstractfactory.servicefactory.AbstractServiceFactory;

/**
 * @author Techie Giri
 *	Pattern: Abstract Factory Pattern 
 *	Pattern Type: Creational Design Pattern
 *	Pattern Description: Abstract Factory pattern an interface/abstract class 
 *						is responsible for creating a factory of related objects without 
 *						explicitly specifying their classes. 
 *						Each generated factory can give the objects as per the Factory pattern.
 *
 *	Advantage: 1. Loosely Coupled application as we don't use exact specific object type.
 */
public class AbstractFactoryDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		AbstractFactory shapeFactory = AbstractServiceFactory.getFactory("Shape");
		AbstractFactory colorFactory = AbstractServiceFactory.getFactory("Color");
		
		Shape rectangleShape = shapeFactory.getShape("Rectangle");
		Shape squareShape = shapeFactory.getShape("Square");
		Shape circleShape = shapeFactory.getShape("Circle");
		
		rectangleShape.draw();
		squareShape.draw();
		circleShape.draw();
		
		Color redColor = colorFactory.getColor("Red");
		Color greenColor = colorFactory.getColor("Green");
		Color orangeColor = colorFactory.getColor("Orange");
		
		redColor.fill();
		greenColor.fill();
		orangeColor.fill();
	}

}
