package com.techiegiri.pattern.creational.builder;

import java.util.ArrayList;
import java.util.List;

import com.techiegiri.pattern.creational.builder.interfaces.Item;

public class Meal {

	private List<Item> items = new ArrayList<Item>();

	public void addItems(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;

		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : "+item.name()+", " +
					"Packing : "+item.packing()+", " +
					"Price : "+item.price());
		}
	}
	
}
