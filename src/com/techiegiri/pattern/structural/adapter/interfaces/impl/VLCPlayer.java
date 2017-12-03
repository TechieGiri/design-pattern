package com.techiegiri.pattern.structural.adapter.interfaces.impl;

import com.techiegiri.pattern.structural.adapter.interfaces.AdvancedMediaPlayer;

public class VLCPlayer implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		System.out.println("Playing VLC song : "+fileName);
	}

	public void playMp4(String fileNamex) {
		//Empty implementation
	}

}
