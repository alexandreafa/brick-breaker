package brickBreaker;

import java.io.File;

import javax.swing.JFrame;

public class Main {
	SoundEffect se = new SoundEffect();

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		Gameplay jogando = new Gameplay();

		obj.setBounds(10, 10, 700, 600);
		obj.setTitle("Breakout Ball");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(jogando);

	}
}
