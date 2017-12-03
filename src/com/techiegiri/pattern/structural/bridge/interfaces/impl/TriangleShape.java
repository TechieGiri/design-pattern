package com.techiegiri.pattern.structural.bridge.interfaces.impl;

import com.techiegiri.pattern.structural.bridge.interfaces.Color;
import com.techiegiri.pattern.structural.bridge.interfaces.Shape;

public class TriangleShape extends Shape {

	public TriangleShape(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.println("Applying color to traingle");
		color.applyColor();
	}

}
