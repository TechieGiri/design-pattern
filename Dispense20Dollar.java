package com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces.impl;

import com.techiegiri.pattern.behaviourial.chainofresponsibility.Currency;
import com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces.DispenseChain;

public class Dispense20Dollar implements DispenseChain {
	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmt() >= 20){
			int num = cur.getAmt()/20;
			int remainder = cur.getAmt()%20;
			System.out.println("Dispensing "+num+" 20$");
			if (remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			}
		}
		else {
			this.chain.dispense(cur);
		}
	}
}
