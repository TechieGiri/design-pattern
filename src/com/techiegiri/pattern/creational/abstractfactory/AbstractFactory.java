package com.techiegiri.pattern.creational.abstractfactory;

import com.techiegiri.pattern.creational.abstractfactory.interfaces.Color;
import com.techiegiri.pattern.creational.abstractfactory.interfaces.Shape;

public abstract class AbstractFactory {
	
	abstract Shape getShape(String shapeType);
	abstract Color getColor(String colorType);
	
}
