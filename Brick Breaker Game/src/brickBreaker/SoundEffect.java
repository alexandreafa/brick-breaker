package brickBreaker;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundEffect {
	String brickSound;
	brickSound = ".//sounds//brick.wav";
	Clip clip;

	public void setFile(String soundFileName) {
		try {
			File file = new File(soundFileName);
			AudioInputStream sound = AudioSystem.getAudioInputStream(file);
			clip = AudioSystem.getClip();
			clip.open(sound);

		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void play() {
		clip.setFramePosition(0);
		clip.start();
	}
}
