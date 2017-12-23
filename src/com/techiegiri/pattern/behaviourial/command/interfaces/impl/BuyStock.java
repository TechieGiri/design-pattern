package com.techiegiri.pattern.behaviourial.command.interfaces.impl;

import com.techiegiri.pattern.behaviourial.command.Stock;
import com.techiegiri.pattern.behaviourial.command.interfaces.Order;

public class BuyStock implements Order {
	private Stock abcStock;

	public BuyStock(Stock abcStock) {
		this.abcStock = abcStock;
	}
	@Override
	public void execute() {
		abcStock.buy();
	}

}
