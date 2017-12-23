package com.techiegiri.pattern.behaviourial.state;

public class StopState implements State {

	@Override
	public void doAction(Context context) {
		System.out.println("Stoping the state");
		context.setState(this);
	}

}
