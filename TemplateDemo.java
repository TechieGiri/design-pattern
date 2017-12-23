package com.techiegiri.pattern.behaviourial.templatemethod;

public class TemplateDemo {


	/**
	 * @author Techie Giri 
	 * Pattern: Template Pattern 
	 * Pattern Type: Behavioral Design Pattern Pattern 
	 * Description: In Template pattern, an abstract class exposes defined way(s)/template(s) 
	 * 				to execute its methods. Its subclasses can override the method 
	 * 				implementation as per need but the invocation is to be in the same 
	 * 				way as defined by an abstract class. This pattern comes under behavior 
	 * 				pattern category. 				
	 * 
	 *  Advantage: Default template method describes unchanged way of execution. 
	 */
	
	public static void main(String[] args) {
		Game gameCricket = new Cricket();
		gameCricket.play();

		System.out.println("========================");
		
		Game gameFootball = new FootBall();
		gameFootball.play();
	}

}
