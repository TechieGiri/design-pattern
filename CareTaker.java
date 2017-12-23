package com.techiegiri.pattern.behaviourial.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	private List<Memento> mementoList = new ArrayList<>();

	public void add(Memento mem) {
		mementoList.add(mem);
	}

	public Memento get(int index) {
		return mementoList.get(index);
	}

}
