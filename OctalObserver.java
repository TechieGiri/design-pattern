package com.techiegiri.pattern.behaviourial.observer.interfaces.impl;

import com.techiegiri.pattern.behaviourial.observer.Subject;
import com.techiegiri.pattern.behaviourial.observer.interfaces.Observer;

public class OctalObserver implements Observer {

	private Subject subject;

	public OctalObserver(Subject subject) {
		super();
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Updating Octal data:"
				+ Integer.toOctalString(subject.getState()));
	}

}
