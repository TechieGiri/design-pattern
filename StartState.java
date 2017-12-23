package com.techiegiri.pattern.behaviourial.state;

public class StartState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Starting state");
		context.setState(this);
	}

}
