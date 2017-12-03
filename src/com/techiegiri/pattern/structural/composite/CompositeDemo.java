package com.techiegiri.pattern.structural.composite;

import com.techiegiri.pattern.structural.composite.interfaces.Employee;
import com.techiegiri.pattern.structural.composite.interfaces.impl.Accountant;
import com.techiegiri.pattern.structural.composite.interfaces.impl.BankManager;
import com.techiegiri.pattern.structural.composite.interfaces.impl.Cashier;
/*
 *@author Techie Giri
 * Pattern: Composite Pattern
 * Pattern Type: Structural Design Pattern
 * Pattern Description: Allow clients to operate in generic manner on objects 
 * 						that may or may not represent a hierarchy of objects.						
 * 
 * Advantage: It defines class hierarchies that contain primitive and complex objects. 
 */
public class CompositeDemo {

	public static void main(String args[]) {  
        Employee emp1=new Cashier(101,"Sohan Kumar", 20000.0);  
        Employee emp2=new Cashier(102,"Mohan Kumar", 25000.0);  
        Employee emp3=new Accountant(103,"Seema Mahiwal", 30000.0);   
        Employee manager1=new BankManager(100,"Ashwani Rajput",100000.0);  
        manager1.add(manager1);  
         manager1.add(emp1);  
         manager1.add(emp2);  
         manager1.add(emp3);  
         manager1.print();  
       }  
}
