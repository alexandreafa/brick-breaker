package brickBreaker;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

public class SoundEffect {
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
		
		clip.addLineListener(new LineListener() {
			public void update(LineEvent e) {
				if (e.getType() == LineEvent.Type.STOP) {
					e.getLine().close();
					clip.close();
				}
			}
		});

		clip.stop();
		clip.flush();
		clip.setFramePosition(0);
		clip.start();
	}
}
