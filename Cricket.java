package com.techiegiri.pattern.behaviourial.templatemethod;

public class Cricket extends Game {

	@Override
	void endGame() {
		System.out.println("Cricket game end");
	}

	@Override
	void initalizeGame() {
		System.out.println("Cricket game initalize");

	}

	@Override
	void startGame() {
		System.out.println("Cricket game start");

	}

}
