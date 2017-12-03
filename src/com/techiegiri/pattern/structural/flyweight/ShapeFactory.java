package com.techiegiri.pattern.structural.flyweight;

import java.util.HashMap;

import com.techiegiri.pattern.structural.flyweight.interfaces.Shape;
import com.techiegiri.pattern.structural.flyweight.interfaces.impl.CircleShape;

public class ShapeFactory {

	private static HashMap<String, Shape> shapeMap = new HashMap<>();

	public static Shape getCircle(String color) {
		CircleShape circle = (CircleShape) shapeMap.get(color);
		if (circle == null) {
			circle = new CircleShape(color);
			shapeMap.put(color, circle);
			System.out.println("Creating circle with color" + color);
		}
		return circle;
	}
}
