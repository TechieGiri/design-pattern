package com.techiegiri.pattern.behaviourial.memento;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento saveToMememto(){
		return new Memento(state);
	}
	
	public void getStateToMemento(Memento mem) {
		state = mem.getState();
	}
}
