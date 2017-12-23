package com.techiegiri.pattern.behaviourial.visitor.interfaces.impl;

import java.util.List;

import com.techiegiri.pattern.behaviourial.visitor.interfaces.Product;
import com.techiegiri.pattern.behaviourial.visitor.interfaces.Visitor;

public class CashierVisitor implements Visitor {
	private static float totalPrice = 0;

	@Override
	public void visit(List<Product> productList) {
		System.out.println("You have purchased following::::");
		for (Product product : productList) {
			System.out.println(product.getClass().getName());
			totalPrice = totalPrice + product.getPrice();
		}

	}

	public float getTotalPrice() {
		System.out.println("Please pay: Rs."+totalPrice);
		return totalPrice;
	}

}
