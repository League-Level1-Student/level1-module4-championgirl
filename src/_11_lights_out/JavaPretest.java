package _11_lights_out;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaPretest implements ActionListener {
	JFrame frame = new JFrame();
	JButton hintbutton = new JButton();
	JButton submitButton = new JButton();
	JLabel label = new JLabel("Why did the programmer quit his job?");
	JTextField textField = new JTextField(20);
	JPanel panel = new JPanel();

	public JavaPretest() {
		// TODO Auto-generated constructor stub
		frame.setVisible(true);
		panel.add(label);
		panel.add(hintbutton);
		panel.add(submitButton);
		panel.add(label);
		panel.add(textField);
		submitButton.addActionListener(this);
		hintbutton.addActionListener(this);
		submitButton.setText("submit");
		hintbutton.setText("hint");
		frame.add(panel);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getSource() == submitButton) {

			if (textField.getText().equals("He didn't get arrays")) {

				System.out.println("Correct!");

			}

			else {
				System.out.println("Wrong!");
			}
		}
		if (arg0.getSource() == hintbutton) {

			JOptionPane.showMessageDialog(null, "arrays");

		}

	}
}
