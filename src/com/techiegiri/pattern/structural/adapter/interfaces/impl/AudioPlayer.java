package com.techiegiri.pattern.structural.adapter.interfaces.impl;

import com.techiegiri.pattern.structural.adapter.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {
	MediaAdaptor mediaAdapter;
	public void play(String fileType, String fileName) {
		// TODO Auto-generated method stub
		if (fileType.equals("mp3")) {
			System.out.println("playing mp3 file:"+fileName);
		}
		else if (fileType.equals("vlc") || fileType.equals("mp4")) {
			mediaAdapter = new MediaAdaptor(fileType);
			mediaAdapter.play(fileType, fileName);
		}
		else {
			System.out.println("Media type : "+fileType+" not supported");
		}
	}

}
