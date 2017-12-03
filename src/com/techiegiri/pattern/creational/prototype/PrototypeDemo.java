package com.techiegiri.pattern.creational.prototype;

/**
 * @author Techie Giri
 * Pattern: Prototype pattern
 * Pattern Type: Creational design pattern
 * Pattern Description: This pattern involves implementing a prototype 
 * 						interface which tells to create a clone of 
 * 						the current object. This pattern is used 
 * 						when creation of object directly is costly.
 * Advantage: Save critical resource in creating complex object
 */
public class PrototypeDemo {

	public static void main(String[] args) {
		ShapeCache.loadShapeCache();

		Shape clonedShape = (Shape) ShapeCache.getShape("Rec1");
		System.out.println("Shape : " + clonedShape.getType());

		Shape clonedShape2 = (Shape) ShapeCache.getShape("Squ1");
		System.out.println("Shape : " + clonedShape2.getType());

		Shape clonedShape3 = (Shape) ShapeCache.getShape("Cir1");
		System.out.println("Shape : " + clonedShape3.getType());
	}

}
