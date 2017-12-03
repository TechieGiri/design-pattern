package com.techiegiri.pattern.structural.bridge.interfaces;

public abstract class Shape {
	
	protected Color color;

	public Shape(Color c) {
		color = c;
	}
	
	abstract public void applyColor(); 
}
