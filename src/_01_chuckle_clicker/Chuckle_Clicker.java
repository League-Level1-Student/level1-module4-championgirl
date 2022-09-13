package _01_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {

	public Chuckle_Clicker() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Chuckle_Clicker chuckleClicker = new Chuckle_Clicker();
	chuckleClicker.makeButtons();
}

JPanel panel = new JPanel();
JButton jokeButton = new JButton();
JButton punchLineButton = new JButton();
JFrame frame = new JFrame();
public void makeButtons() {
	
	
	frame.setVisible(true);
	
	jokeButton.setText("Joke!");
	punchLineButton.setText("Punchline!");
	jokeButton.addActionListener(this);
	punchLineButton.addActionListener(this);
	frame.add(panel);
	panel.add(jokeButton);
	
	panel.add(punchLineButton);
	frame.pack();
	
	
	
	
	
	
	
	
	
}
@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
if(arg0.getSource() == jokeButton) {
		JOptionPane.showMessageDialog(null, "I tripped in France, eiffel over! xD");
	}

if(arg0.getSource() == punchLineButton) {
	JOptionPane.showMessageDialog(null, "This would be funny, except there's no punchline xD");
}


}




}
