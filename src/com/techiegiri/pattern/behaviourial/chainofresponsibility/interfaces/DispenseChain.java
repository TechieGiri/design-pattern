package com.techiegiri.pattern.behaviourial.chainofresponsibility.interfaces;

import com.techiegiri.pattern.behaviourial.chainofresponsibility.Currency;

public interface DispenseChain {

	void setNextChain(DispenseChain chain);
	void dispense(Currency cur);	
}
