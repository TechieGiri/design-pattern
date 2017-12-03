package com.techiegiri.pattern.creational.prototype;

public class SquareShape extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing square");
	}

	public SquareShape() {
		type = "Square";
	}

}
