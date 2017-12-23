package com.techiegiri.pattern.behaviourial.templatemethod;

public class FootBall extends Game {

	@Override
	void endGame() {
		System.out.println("Football game end");

	}

	@Override
	void initalizeGame() {
		System.out.println("Football game initalize");

	}

	@Override
	void startGame() {
		System.out.println("Football game start");
	}

}
