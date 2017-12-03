package com.techiegiri.pattern.creational.prototype;

public class RectangleShape extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing rectangle");
	}

	public RectangleShape() {
		type = "Rectangle";
	}
}
