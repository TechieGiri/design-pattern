package com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces.impl;

import com.techiegiri.pattern.behaviourial.chainofresponsibility.Currency;
import com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces.DispenseChain;

public class Dispense10Dollar implements DispenseChain {
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmt() >= 10){
			int num = cur.getAmt()/10;
			int remainder = cur.getAmt()%10;
			System.out.println("Dispensing "+num+" 10$");
			if (remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			}
		}
		else {
			this.chain.dispense(cur);
		}
	}
}
