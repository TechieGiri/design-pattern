package com.techiegiri.pattern.behaviourial.templatemethod;

public abstract class Game {

	abstract void endGame();

	abstract void initalizeGame();

	abstract void startGame();
	
	//Template Method
	public void play() {
		initalizeGame();
		startGame();
		endGame();
	}
}
