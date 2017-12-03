package com.techiegiri.pattern.creational.builder;

/**
 * @author Techie Giri Pattern: Builder Pattern Pattern Type: Creational Design
 *         Pattern Pattern Description: Builder pattern builds a complex object
 *         using simple objects and using a step by step approach. This type of
 *         design pattern comes under creational pattern as this pattern
 *         provides one of the best ways to create an object. Advantage: 1.
 *         Overhead of creating complex object is done at central place i.e. in
 *         builder class.
 * 
 */
public class BuilderDemo {

	public static void main(String[] args) {

		MealBuilder vegBuilder = new MealBuilder();
		Meal vegMeal = vegBuilder.prepareVegMeal();
		vegMeal.showItems();
		System.out.println("Veg Meal: price-" + vegMeal.getCost());

		MealBuilder nonVegBuilder = new MealBuilder();
		Meal nonVegMeal = nonVegBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		System.out.println("Non Veg Meal: price-" + nonVegMeal.getCost());

	}

}
