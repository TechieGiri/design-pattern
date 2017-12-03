package com.techiegiri.pattern.structural.proxy.interfaces.impl;

import com.techiegiri.pattern.structural.proxy.interfaces.Image;

public class ProxyImage implements Image {
	String fileName;
	RealImage realImage;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		System.out.println("Displaying proxy image");
		if (realImage == null) {
			realImage = new RealImage(fileName);
		}
		realImage.display();
	}

}
