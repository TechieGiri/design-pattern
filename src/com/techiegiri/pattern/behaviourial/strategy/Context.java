package com.techiegiri.pattern.behaviourial.strategy;

import com.techiegiri.pattern.behaviourial.strategy.interfaces.Strategy;

public class Context {
	
	private Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	
	public int doOperation(int num1, int num2) {
		return this.strategy.doOperation(num1, num2);
	}

}
