package _08_pig_latin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import game_tools.Sound;

public class PigLatin implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField textField1 = new JTextField(20);
	JTextField textField2 = new JTextField(20);
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton buttonSpeak = new JButton();
	JLabel label1 = new JLabel(">>");
	JLabel label2 = new JLabel("<<");
	JLabel labelSpeak = new JLabel("Speak");
	public PigLatin() {
		// TODO Auto-generated constructor stub
	

	frame.add(panel);
	panel.add(textField1);
	panel.add(button1);
	panel.add(button2);
	button1.add(label1);
	button2.add(label2);
	panel.add(textField2);
	button1.addActionListener(this);
	button2.addActionListener(this);
	panel.add(buttonSpeak);
	buttonSpeak.addActionListener(this);
	buttonSpeak.setText("Speak");
	frame.setVisible(true);
	frame.pack();
	
	
	
	
	
/* Translates a word in English to Pig Latin when a button is pressed.
•Translates a word in Pig Latin to English when a button is pressed.
•Make the computer speak the Pig Latin phrase (using Sound.speak(words)) when a button is pressed.*/
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
		if(button1==arg0.getSource()) {
		String stringEnglish = textField1.getText();
		textField2.setText(PigLatinTranslator.translateEnglishToPigLatin(stringEnglish));
		}
		if(button2==arg0.getSource()) {
			String stringPigLatin = textField2.getText();
			textField1.setText(PigLatinTranslator.translatePigLatinToEnglish(stringPigLatin));
			}
	if(buttonSpeak==arg0.getSource()) {
		Sound.speak(textField2.getText());
	}
		
		
		
		
	}
}