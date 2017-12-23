package com.techiegiri.pattern.behaviourial.visitor;

import java.util.ArrayList;
import java.util.List;

import com.techiegiri.pattern.behaviourial.visitor.interfaces.Product;
import com.techiegiri.pattern.behaviourial.visitor.interfaces.impl.CashierVisitor;
import com.techiegiri.pattern.behaviourial.visitor.interfaces.impl.Clothes;
import com.techiegiri.pattern.behaviourial.visitor.interfaces.impl.Toy;

public class VisitorDemo {

	public static void main(String[] args) {
		Product clothes = new Clothes("T-Shirt", 40, 102.25f);
		Product toy = new Toy("T-Shirt", "5-10",52.45f);

		List<Product> productList = new ArrayList<>();
		productList.add(clothes);
		productList.add(toy);

		CashierVisitor visitor = new CashierVisitor();
		visitor.visit(productList);
		visitor.getTotalPrice();
	}

}
