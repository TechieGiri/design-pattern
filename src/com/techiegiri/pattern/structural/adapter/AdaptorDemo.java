package com.techiegiri.pattern.structural.adapter;

import com.techiegiri.pattern.structural.adapter.interfaces.impl.AudioPlayer;

/**
 * @author Techie Giri
 * Pattern: Adapter Pattern
 * Pattern Type: Structural Design Pattern
 * Pattern Description: Convert one system format and make it compatible with another system
 *  
 * Advantage: Sits between 2 different system and make them compatible to each other.
 * 
 */

public class AdaptorDemo {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "alone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "mind me.avi");
	}

}
