package com.techiegiri.pattern.behaviourial.observer.interfaces.impl;

import com.techiegiri.pattern.behaviourial.observer.Subject;
import com.techiegiri.pattern.behaviourial.observer.interfaces.Observer;

public class HexaObserver implements Observer {

	private Subject subject;

	public HexaObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
	System.out.println("Updating Hexa data:" + Integer.toHexString(this.subject.getState()));

	}
}
