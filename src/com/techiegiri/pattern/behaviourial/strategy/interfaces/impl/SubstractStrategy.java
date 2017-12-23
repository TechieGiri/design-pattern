package com.techiegiri.pattern.behaviourial.strategy.interfaces.impl;

import com.techiegiri.pattern.behaviourial.strategy.interfaces.Strategy;

public class SubstractStrategy implements Strategy {

	@Override
	public int doOperation(int num1, int num2) {
		System.out.println("Substract Strategy");
		return num1 - num2;
	}

}
