package com.techiegiri.pattern.structural.adapter.interfaces.impl;

import com.techiegiri.pattern.structural.adapter.interfaces.AdvancedMediaPlayer;

public class MP4Player implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		// Empty implementation

	}

	public void playMp4(String fileNamex) {
		System.out.println("Playing MP4 song :" + fileNamex);

	}

}
