package com.techiegiri.pattern.behaviourial.observer.interfaces.impl;

import com.techiegiri.pattern.behaviourial.observer.Subject;
import com.techiegiri.pattern.behaviourial.observer.interfaces.Observer;

public class BinaryObserver implements Observer {

	private Subject subject;

	public BinaryObserver(Subject subject) {
		super();
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {

		System.out.println("Updating binary data:" + Integer.toBinaryString(subject.getState()));
	}

}
