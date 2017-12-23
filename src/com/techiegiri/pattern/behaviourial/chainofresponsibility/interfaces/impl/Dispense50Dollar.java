package com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces.impl;

import com.techiegiri.pattern.behaviourial.chainofresponsibility.Currency;
import com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces.DispenseChain;

public class Dispense50Dollar implements DispenseChain {

	private DispenseChain chain;
	
	@Override
	public void setNextChain(DispenseChain nextChain) {
		this.chain = nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if (cur.getAmt() >= 50){
			int num = cur.getAmt()/50;
			int remainder = cur.getAmt()%50;
			System.out.println("Dispensing "+num+" 50$");
			if (remainder != 0) {
				this.chain.dispense(new Currency(remainder));
			}
		}
		else {
			this.chain.dispense(cur);
		}
	}
}
