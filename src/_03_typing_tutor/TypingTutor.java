package _03_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.print.Printable;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {

	public TypingTutor() {
		// TODO Auto-generated constructor stub
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	char currentLetter;
	int correctKeysPressed = 0;
	int keysPressed = 0;

	void setup() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		currentLetter = generateRandomLetter();

		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);

		// 6. Add a key listener to the frame in setup method. Add label to the panel
		// and panel to the frame. Then pack the frame.

		frame.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		frame.pack();

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println(e.getKeyChar());

		keysPressed++;

		if (e.getKeyChar() == currentLetter) {

			panel.setBackground(Color.GREEN);
			correctKeysPressed++;
		}

		else {
			panel.setBackground(Color.RED);
		}

		if (keysPressed == 10) {

			showTypingSpeed(correctKeysPressed);
		}

		currentLetter = generateRandomLetter();

		label.setText(currentLetter + "");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	Date timeAtStart = new Date();

	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
		Date timeAtEnd = new Date();
		long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
		long gameInSeconds = (gameDuration / 1000) % 60;
		double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
		int charactersPerMinute = (int) (charactersPerSecond * 60);
		JOptionPane.showMessageDialog(null, "Your typing speed is " + charactersPerMinute + " characters per minute.");
	}

}
