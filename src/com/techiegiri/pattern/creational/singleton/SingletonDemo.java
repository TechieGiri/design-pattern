package com.techiegiri.pattern.creational.singleton;

/**
 * @author Techie Giri
 * Pattern: Singleton Pattern
 * Pattern Type: Creational Design Pattern
 * Pattern Description: This pattern involves a single class 
 * 						which is responsible to create an object 
 * 						while making sure that only single object 
 * 						gets created. This class provides a way to 
 * 						access its only object which can be accessed 	
 * 						directly without need to instantiate the object 
 * 						of the class.
 * Advantage: Sometime class need to have only instance of it 
 * 			accessible to entire application. We make such class 
 * 			as Singleton as they tend to change very less frequently
 */
public class SingletonDemo {

	public static void main(String[] args) {
		SingletonObject obj = SingletonObject.getInstance();
		System.out.println("Singleton Message: " + obj.getMessage("Techie"));

	}

}
