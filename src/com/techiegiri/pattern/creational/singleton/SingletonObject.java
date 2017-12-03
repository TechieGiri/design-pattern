package com.techiegiri.pattern.creational.singleton;

public class SingletonObject {

	private static SingletonObject instance = new SingletonObject();

	private SingletonObject() {
	}

	public static SingletonObject getInstance() {
		return instance;
	}

	public String getMessage(String message) {
		return "Hello :"+message;
	}
}
