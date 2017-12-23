package com.techiegiri.pattern.behaviourial.state;

public class StateDemo {

	/**
	 * @author Techie Giri 
	 * Pattern: State Pattern 
	 * Pattern Type: Behavioral Design Pattern Pattern 
	 * Description: In State pattern a class behavior changes based on its state.
	 * 				In State pattern, we create objects which represent various 
	 * 				states and a context object whose behavior varies as its state object changes.
	 * 				
	 * 
	 *  Advantage: Use to give and nullify the stae of object.
	 */
	public static void main(String[] args) {

		State startState = new StartState();
		State stopState = new StopState();
		Context context = new Context();
		startState.doAction(context);
		stopState.doAction(context);
		
	}

}
