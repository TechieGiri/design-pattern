package com.techiegiri.pattern.creational.abstractfactory;

import com.techiegiri.pattern.creational.abstractfactory.interfaces.Color;
import com.techiegiri.pattern.creational.abstractfactory.interfaces.Shape;
import com.techiegiri.pattern.creational.abstractfactory.interfaces.impl.GreenColor;
import com.techiegiri.pattern.creational.abstractfactory.interfaces.impl.OrangeColor;
import com.techiegiri.pattern.creational.abstractfactory.interfaces.impl.RedColor;

public class ColorFactory extends AbstractFactory {

	public Shape getShape(String shapeType) {
		return null;
	}

	public Color getColor(String colorType) {

		if (colorType == null || colorType.isEmpty()) {
			return null;
		}

		if (colorType.equals("Red")) {
			return new RedColor();
		} else if (colorType.equals("Green")) {
			return new GreenColor();
		} else if (colorType.equals("Orange")) {
			return new OrangeColor();
		}

		return null;
	}

}
