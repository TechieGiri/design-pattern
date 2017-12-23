package com.techiegiri.pattern.behaviourial.chainofresponsibility;

import com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces.DispenseChain;
import com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces.impl.Dispense10Dollar;
import com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces.impl.Dispense20Dollar;
import com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces.impl.Dispense50Dollar;

/**
 * 	@author Techie Giri
 *	Pattern: Chain of Responsibility Pattern 
 *	Pattern Type: Behavioral Design Pattern
 *	Pattern Description: The chain of responsibility pattern creates a chain of 
 *						receiver objects for a request. This pattern decouples 
 *						sender and receiver of a request based on type of request. 
 *						This pattern comes under behavioral patterns.
 *
 *	Advantage: 1. Single linked chain of responsibility
 */

public class ATMDispenseChainDemo {

	private DispenseChain chain1;
	
	public ATMDispenseChainDemo() {
		
		this.chain1 = new Dispense50Dollar();
		DispenseChain chain2 = new Dispense20Dollar();
		DispenseChain chain3 = new Dispense10Dollar();
		
		chain1.setNextChain(chain2);
		chain2.setNextChain(chain3);
		
	}
	
	public static void main(String[] args) {
		int setAmount = 330;
		ATMDispenseChainDemo atmDispenser = new ATMDispenseChainDemo();
		while(true) {

			System.out.println("Amount is :"+setAmount);
			if(setAmount % 10 != 0) {
				System.out.println("Amount should be multiples of 10s.");
				return;
			}
			atmDispenser.chain1.dispense(new Currency(setAmount));
		}
	}
}
