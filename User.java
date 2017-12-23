package com.techiegiri.pattern.behaviourial.mediator;

public class User {

	private String name;

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showMessage(String message) {
		ChatRoom.showMessage(this, message);
	}
}
