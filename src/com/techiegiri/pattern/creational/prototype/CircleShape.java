package com.techiegiri.pattern.creational.prototype;

public class CircleShape extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing circle");
	}

	public CircleShape() {
		type = "Circle";
	}
}
