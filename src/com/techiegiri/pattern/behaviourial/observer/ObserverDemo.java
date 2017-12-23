package com.techiegiri.pattern.behaviourial.observer;

import com.techiegiri.pattern.behaviourial.observer.interfaces.impl.BinaryObserver;
import com.techiegiri.pattern.behaviourial.observer.interfaces.impl.HexaObserver;
import com.techiegiri.pattern.behaviourial.observer.interfaces.impl.OctalObserver;


/**
 * @author Techie Giri 
 * Pattern: Observer Pattern 
 * Pattern Type: Behavioral Design Pattern Pattern 
 * Description: Observer pattern is used 
 * 				when there is one-to-many relationship 
 * 				between objects such as if one object 
 * 				is modified, its depenedent objects are 
 * 				to be notified automatically. 
 * 				Observer pattern falls under behavioral 
 * 				pattern category.
 * 
 *  Advantage: One to many relation, update in one object notify many relative object.
 */

public class ObserverDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new BinaryObserver(subject);
		new OctalObserver(subject);
		new HexaObserver(subject);

		System.out.println("First state change: 15");
		subject.setState(18);
		System.out.println("Second state change: 10");
		subject.setState(20);
	}

}
