package com.techiegiri.pattern.behaviourial.command.interfaces.impl;

import com.techiegiri.pattern.behaviourial.command.Stock;
import com.techiegiri.pattern.behaviourial.command.interfaces.Order;

public class SellStock implements Order {
	private Stock abcStock;
	
	public SellStock(Stock abcStock) {
		this.abcStock = abcStock;
	}
	@Override
	public void execute() {
		abcStock.sell();
	}

}
