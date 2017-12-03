package com.techigiri.pattern.structural.proxy;

import com.techigiri.pattern.structural.proxy.interfaces.Image;
import com.techigiri.pattern.structural.proxy.interfaces.impl.ProxyImage;

/*
 * @author Techie Giri
 * 
 * Pattern: Proxy Pattern
 * Pattern Type: Structural Design Pattern
 * Pattern Description: best e.g. : Lazy Loading, reuse the object created
 * 						In proxy pattern, a class represents functionality of another class. 
 * 						This type of design pattern comes under structural pattern. 
 * 						In proxy pattern, we create object having original object to 
 * 						interface its functionality to outer world.
 *  
 * Advantage: Reuse the Object created again and again
 *  
 */

public class ProxyDemo {
	
	public static void main(String[] args) {
		Image img = new ProxyImage("test.txt");
		img.display();
		System.out.println("====");
		img.display();
	}

}
