package com.techiegiri.pattern.structural.bridge;

import com.techiegiri.pattern.structural.bridge.interfaces.Shape;
import com.techiegiri.pattern.structural.bridge.interfaces.impl.OrangeColor;
import com.techiegiri.pattern.structural.bridge.interfaces.impl.RectangleShape;
import com.techiegiri.pattern.structural.bridge.interfaces.impl.RedColor;
import com.techiegiri.pattern.structural.bridge.interfaces.impl.TriangleShape;

/**
 * @author Techie Giri
 * Pattern: Bridge Pattern
 * Pattern Type: Structural Design Pattern
 * Pattern Description: Decouple an abstraction from its implementation so that the two can vary independently. 
 * 						The implementation of bridge design pattern follows the notion to prefer Composition over inheritance.						
 * 
 * Advantage: Decouple an abstraction from its implementation so that the two can vary independently.
 * 
 */

public class BridgePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape shape1 = new TriangleShape(new RedColor());
		shape1.applyColor();
		
		Shape shape2 = new RectangleShape(new OrangeColor());
		shape2.applyColor();
	}

}
