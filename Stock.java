package com.techiegiri.pattern.behaviourial.command;

public class Stock {

	private String name = "ABC";
	private int number = 10;

	public void buy() {
		System.out.println("Stock buy [ name : " + name + " " + "Quatity : "
				+ number+" ]");
	}

	public void sell() {
		System.out.println("Stock sell [ name : " + name + " " + "Quatity : "
				+ number+" ]");
	}
}
