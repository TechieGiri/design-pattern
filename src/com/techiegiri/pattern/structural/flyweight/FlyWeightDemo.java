package com.techiegiri.pattern.structural.flyweight;

import com.techiegiri.pattern.structural.flyweight.interfaces.impl.CircleShape;

/*
 * @author Techie Giri
 * 
 * Pattern: Flyweight Pattern
 * Pattern Type: Structural Design Pattern
 * Pattern Description: best e.g. : Object Pooling
 * Flyweight pattern is primarily used to reduce the number of objects 
 * created and to decrease memory footprint and increase performance. 
 * This type of design pattern comes under structural pattern as this pattern provides ways 
 * to decrease object count thus improving the object structure of application.
 *  
 * Advantage: Provide a pool of object instead of creating new object again and again.
 *  
 */

public class FlyWeightDemo {
	private static final String[] color = { "red", "orange", "green", "yellow" };

	public static void main(String[] args) {

		for (int i = 0; i < 20; i++) {

			CircleShape shape = (CircleShape) ShapeFactory
					.getCircle(color[(int) (Math.random() * color.length)]);
			shape.setX(100);
			shape.setY(100);
			shape.setRadius(50);
			shape.draw();

		}

	}

}
