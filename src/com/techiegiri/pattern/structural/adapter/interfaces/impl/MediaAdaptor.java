package com.techiegiri.pattern.structural.adapter.interfaces.impl;

import com.techiegiri.pattern.structural.adapter.interfaces.AdvancedMediaPlayer;
import com.techiegiri.pattern.structural.adapter.interfaces.MediaPlayer;

public class MediaAdaptor implements MediaPlayer {

	AdvancedMediaPlayer advMediaPlayer;

	public void play(String fileType, String fileName) {
		if (fileType.equals("mp3")) {

		} else if (fileType.equals("vlc")) {
			advMediaPlayer.playVlc(fileName);
		} else if (fileType.equals("mp4")) {
			advMediaPlayer.playMp4(fileName);
		}

		else {
			System.out.println("unsupported file format: " + fileType);
		}

	}

	public MediaAdaptor(String fileType) {
		if (fileType.equals("vlc")) {
			advMediaPlayer = new VLCPlayer();
		} else if (fileType.equals("mp4")) {
			advMediaPlayer = new MP4Player();
		}
	}
}
