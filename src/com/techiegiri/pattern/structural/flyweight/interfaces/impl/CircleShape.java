package com.techiegiri.pattern.structural.flyweight.interfaces.impl;

import com.techiegiri.pattern.structural.flyweight.interfaces.Shape;

public class CircleShape implements Shape {

	private int x;
	private int y;
	private int radius;
	private String color;

	public CircleShape(String color) {
		super();
		this.color = color;
	}

	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color + ", x : " + x
				+ ", y :" + y + ", radius :" + radius);
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
