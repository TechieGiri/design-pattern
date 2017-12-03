package com.techiegiri.pattern.creational.prototype;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape> shapeCacheTable = new Hashtable<String, Shape>();

	public static void loadShapeCache() {

		RectangleShape rectangle = new RectangleShape();
		rectangle.setId("Rec1");
		shapeCacheTable.put(rectangle.getId(), rectangle);

		SquareShape square = new SquareShape();
		square.setId("Squ1");
		shapeCacheTable.put(square.getId(), square);

		CircleShape circle = new CircleShape();
		circle.setId("Cir1");
		shapeCacheTable.put(circle.getId(), circle);

	}

	public static Shape getShape(String id) {
		Shape cachedShape = shapeCacheTable.get(id);
		return (Shape) cachedShape.clone();
	}
}
