package com.techiegiri.pattern.behaviourial.intrepretor.interfaces.impl;

import com.techiegiri.pattern.behaviourial.intrepretor.interfaces.Expression;

public class AndExpression implements Expression{

	Expression exp1;
	Expression exp2;

	public AndExpression(Expression exp1, Expression exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	public boolean intrepret(String context) {

		return exp1.intrepret(context) && exp2.intrepret(context);
	}
	
}
