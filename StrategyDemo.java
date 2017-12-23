package com.techiegiri.pattern.behaviourial.strategy;

import com.techiegiri.pattern.behaviourial.strategy.interfaces.impl.AddStrategy;
import com.techiegiri.pattern.behaviourial.strategy.interfaces.impl.MultiplyStrategy;
import com.techiegiri.pattern.behaviourial.strategy.interfaces.impl.SubstractStrategy;

public class StrategyDemo {

	/**
	 * @author Techie Giri 
	 * Pattern: Strategy Pattern 
	 * Pattern Type: Behavioral Design Pattern Pattern 
	 * Description: In Strategy pattern, a class behavior or its algorithm can be changed at run time. 
	 * 				This type of design pattern comes under behavior pattern.
	 * 				In Strategy pattern, we create objects which represent various strategies and 
					a context object whose behavior varies as per its strategy object. 
					The strategy object changes the executing algorithm of the context object. 				
	 * 
	 *  Advantage: Can change the object algorithm at runtime
	 */
	
	public static void main(String[] args) {

		Context context = new Context(new AddStrategy());
		System.out.println(context.doOperation(10, 5));
		context = new Context(new SubstractStrategy());
		System.out.println(context.doOperation(10, 5));
		context = new Context(new MultiplyStrategy());
		System.out.println(context.doOperation(10, 5));
	}

}
