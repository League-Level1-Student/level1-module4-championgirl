package _06_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculater implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton addButton = new JButton();
	JButton subButton = new JButton();
	JButton mulButton = new JButton();
	JButton divButton = new JButton();
	JTextField number1 = new JTextField(5);
	JTextField number2 = new JTextField(5);
	JLabel label = new JLabel();

	public Calculater() {

		panel.add(addButton);
		panel.add(subButton);
		panel.add(divButton);
		panel.add(mulButton);
		panel.add(number1);
		panel.add(number2);
		frame.add(panel);
		addButton.addActionListener(this);
		subButton.addActionListener(this);
		divButton.addActionListener(this);
		mulButton.addActionListener(this);
		panel.add(label);
		frame.setVisible(true);
		frame.pack();

		addButton.setText("Add");
		subButton.setText("Sub");
		divButton.setText("Div");
		mulButton.setText("Mul");

		frame.pack();
	}

	public int add(int a, int b) {
		return a + b;

	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		return a / b;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		int variable = 0;
		int firstNumber = Integer.parseInt(number1.getText());
		int secondNumber = Integer.parseInt(number2.getText());

		if (arg0.getSource() == addButton) {
			variable = add(firstNumber, secondNumber);
		}

		if (arg0.getSource() == subButton) {
			variable = sub(firstNumber, secondNumber);
		}

		if (arg0.getSource() == mulButton) {
			variable = mul(firstNumber, secondNumber);
		}

		if (arg0.getSource() == divButton) {
			variable = div(firstNumber, secondNumber);
		}

		label.setText("" + variable);
		frame.pack();
	}

}
