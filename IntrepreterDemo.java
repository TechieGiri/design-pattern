package com.techiegiri.pattern.behaviourial.intrepretor;

import com.techiegiri.pattern.behaviourial.intrepretor.interfaces.Expression;
import com.techiegiri.pattern.behaviourial.intrepretor.interfaces.impl.AndExpression;
import com.techiegiri.pattern.behaviourial.intrepretor.interfaces.impl.OrExpression;
import com.techiegiri.pattern.behaviourial.intrepretor.interfaces.impl.TerminalExpression;

/**
 * 	@author Techie Giri
 *	Pattern: Interpreter Pattern 
 *	Pattern Type: Behavioral Design Pattern
 *	Pattern Description: Interpreter pattern provides a way to evaluate 
 *						language grammar or expression. 
 *						This type of pattern comes under behavioral pattern. 
 *						This pattern involves implementing an expression interface 
 *						which tells to interpret a particular context. 
 *						This pattern is used in SQL parsing, symbol processing 
 *						engine etc.
 *
 *	Advantage: 1. in Cucumber jvm, resolving queries in ORM.
 */


public class IntrepreterDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Expression exp1 = getMaleExpression();
		Expression exp2 = getWomenMarriedExpression();
		
		System.out.println("Male expression:"+exp1.intrepret("John"));
		System.out.println("Married expression:"+exp2.intrepret("UnMarried Tamana"));
		
	}

	public static Expression getMaleExpression() {
		Expression exp1 = new TerminalExpression("John");
		Expression exp2 = new TerminalExpression("Santosh");
		return new OrExpression(exp1, exp2);
	}
	
	public static Expression getWomenMarriedExpression() {
		Expression exp1 = new TerminalExpression("Aishwarya");
		Expression exp2 = new TerminalExpression("Married");
		return new AndExpression(exp1, exp2);
	}
}
