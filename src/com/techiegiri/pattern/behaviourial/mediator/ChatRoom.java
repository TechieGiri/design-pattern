package com.techiegiri.pattern.behaviourial.mediator;

import java.util.Date;

public class ChatRoom {

	public static void showMessage(User user, String message) {
		System.out.println("" + new Date() + " - User - " + user.getName()
				+ " - message - " + message);
	}

}
