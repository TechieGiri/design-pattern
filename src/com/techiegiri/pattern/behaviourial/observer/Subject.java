package com.techiegiri.pattern.behaviourial.observer;

import java.util.ArrayList;
import java.util.List;

import com.techiegiri.pattern.behaviourial.observer.interfaces.Observer;

public class Subject {

	private int state;
	private List<Observer> observerList = new ArrayList<Observer>();

	public void attach(Observer observer) {
		observerList.add(observer);
	}

	public void updateAllObserver() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		updateAllObserver();
	}

}
