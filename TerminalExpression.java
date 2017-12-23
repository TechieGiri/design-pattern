package com.techiegiri.pattern.behaviourial.intrepretor.interfaces.impl;

import com.techiegiri.pattern.behaviourial.intrepretor.interfaces.Expression;

public class TerminalExpression implements Expression {

	private String data;

	public TerminalExpression(String data) {
		this.data = data;
	}

	@Override
	public boolean intrepret(String context) {

		if (context.contains(data)) {
			return true;
		}

		return false;
	}

}
