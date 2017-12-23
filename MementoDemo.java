package com.techiegiri.pattern.behaviourial.memento;

public class MementoDemo {


	/**
	 * @author Techie Giri 
	 * Pattern: Memento Pattern 
	 * Pattern Type: Behavioral Design Pattern Pattern 
	 * Description: Memento pattern is used to restore state of an object to a previous state. 
	 * 				Memento pattern falls under behavioral pattern category.
	 * 
	 *  Advantage: Useful to save the previous state of Object.
	 */
	
	public static void main(String[] args) {

		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();

		originator.setState("State #1");
		originator.setState("State #2");
		careTaker.add(originator.saveToMememto());
		originator.setState("State #3");
		careTaker.add(originator.saveToMememto());
		originator.setState("State #4");
		System.out.println("Current state:" + originator.getState());
		originator.getStateToMemento(careTaker.get(0));
		System.out.println("First State:" + originator.getState());
	}

}
