package com.techiegiri.pattern.behaviourial.mediator;

public class MediatorDemo {

	/**
	 * @author Techie Giri 
	 * Pattern: Mediator Pattern 
	 * Pattern Type: Behavioral Design Pattern Pattern 
	 * Description: Mediator pattern is used to reduce 
	 * 				communication complexity between multiple objects or classes. 
	 * 				This pattern provides a mediator class which normally handles 
	 * 				all the communications between different classes 
	 * 				and supports easy maintenance of the code by loose coupling.
	 * 				Mediator pattern falls under behavioral pattern category.
	 * 
	 *  Advantage: 1. Resolves the communication overhead between object 
	 *  			and loose coupled application.
	 */

	public static void main(String[] args) {
		User u1 = new User("Hritik");
		User u2 = new User("Akshay");

		u1.showMessage("Hi Akshay..How r u?");
		u2.showMessage("Hi Hritik..Im Fine");
	}

}
