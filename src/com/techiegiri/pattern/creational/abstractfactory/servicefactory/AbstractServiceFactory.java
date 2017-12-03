package com.techiegiri.pattern.creational.abstractfactory.servicefactory;

import com.techiegiri.pattern.creational.abstractfactory.AbstractFactory;
import com.techiegiri.pattern.creational.abstractfactory.ColorFactory;
import com.techiegiri.pattern.creational.abstractfactory.ShapeFactory;

public class AbstractServiceFactory {

	public static AbstractFactory getFactory(String factoryType) {
		if (factoryType == null || factoryType.isEmpty()) {
			return null;
		}

		if (factoryType.equals("Shape")) {
			return new ShapeFactory();
		} else if (factoryType.equals("Color")) {
			return new ColorFactory();
		}
		return null;
	}

}
