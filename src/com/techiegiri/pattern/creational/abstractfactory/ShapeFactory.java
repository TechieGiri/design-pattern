package com.techiegiri.pattern.creational.abstractfactory;

import com.techiegiri.pattern.creational.abstractfactory.interfaces.Color;
import com.techiegiri.pattern.creational.abstractfactory.interfaces.Shape;
import com.techiegiri.pattern.creational.abstractfactory.interfaces.impl.CircleShape;
import com.techiegiri.pattern.creational.abstractfactory.interfaces.impl.RectangleShape;
import com.techiegiri.pattern.creational.abstractfactory.interfaces.impl.SquareShape;

public class ShapeFactory extends AbstractFactory {

	public Shape getShape(String shapeType) {

		if (shapeType == null || shapeType.isEmpty()) {
			return null;
		}

		if (shapeType.equals("Rectangle")) {
			return new RectangleShape();
		} else if (shapeType.equals("Square")) {
			return new SquareShape();
		} else if (shapeType.equals("Circle")) {
			return new CircleShape();
		}
		return null;
	}

	Color getColor(String colorType) {
		return null;
	}

}
