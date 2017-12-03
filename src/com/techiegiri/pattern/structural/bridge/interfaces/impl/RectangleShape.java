package com.techiegiri.pattern.structural.bridge.interfaces.impl;

import com.techiegiri.pattern.structural.bridge.interfaces.Color;
import com.techiegiri.pattern.structural.bridge.interfaces.Shape;

public class RectangleShape extends Shape {

	public RectangleShape(Color c) {
		super(c);
	}

	@Override
	public void applyColor() {
		System.out.println("Applying color to rectangle");
		color.applyColor();
	}

}
