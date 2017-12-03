package com.techiegiri.pattern.structural.proxy.interfaces.impl;

import com.techiegiri.pattern.structural.proxy.interfaces.Image;

public class RealImage implements Image {

	String fileName;

	public RealImage(String fileName) {
		this.fileName = fileName;
		loadDFromDisk(fileName);
	}

	@Override
	public void display() {
		System.out.println("Displaying real image " + fileName);

	}

	private void loadDFromDisk(String fileName) {
		System.out.println("Loading from disk :" + fileName);
	}

}
