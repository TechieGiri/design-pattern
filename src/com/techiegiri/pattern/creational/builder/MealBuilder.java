package com.techiegiri.pattern.creational.builder;

import com.techiegiri.pattern.creational.builder.interfaces.impl.ChickenBurger;
import com.techiegiri.pattern.creational.builder.interfaces.impl.Coke;
import com.techiegiri.pattern.creational.builder.interfaces.impl.Pepsi;
import com.techiegiri.pattern.creational.builder.interfaces.impl.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItems(new VegBurger());
		meal.addItems(new Coke());

		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItems(new ChickenBurger());
		meal.addItems(new Pepsi());
		return meal;
	}

}
