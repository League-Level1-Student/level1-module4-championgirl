package _10_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel Image1 = new JLabel();
	JLabel Image2 = new JLabel();
	JLabel Image3 = new JLabel();
	JButton spin = new JButton();
	Random ran = new Random();

	public Slot_Machine() {
		spin.addActionListener(this);

		spin.setText("spin");
		frame.add(panel);
		frame.setVisible(true);

		try {
			Image1 = createLabelImage("orange.png");
			Image2 = createLabelImage("lime.gif");
			Image3 = createLabelImage("cherry.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		panel.add(Image1);
		panel.add(Image2);
		panel.add(Image3);
		panel.add(spin);
		frame.pack();
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		if (arg0.getSource() == spin) {
			try {
				int random = ran.nextInt(3);
				int random1 = ran.nextInt(3);
				int random2 = ran.nextInt(3);
				if (random == 0) {
					Image1 = createLabelImage("orange.png");
				}
				if (random == 1) {
					Image1 = createLabelImage("lime.gif");
				}
					if (random == 2) {
						Image1 = createLabelImage("cherry.png");
					}
					
					if (random1 == 1) {
						Image2 = createLabelImage("lime.gif");
					}
					if (random1 == 0) {
						Image2 = createLabelImage("orange.png");
					}
					if (random1 == 2) {
						Image2 = createLabelImage("cherry.png");
					}

					
					if (random2 == 1) {
						Image3 = createLabelImage("lime.gif");
					}
					if (random2 == 0) {
						Image3 = createLabelImage("orange.png");
					}
					if (random2 == 2) {
						Image3 = createLabelImage("cherry.png");
					}
					
					frame.dispose();
					frame = new JFrame();
					panel = new JPanel();
					spin.setText("spin");
					spin.addActionListener(this);
					frame.add(panel);
					frame.setVisible(true);
					panel.add(Image1);
					panel.add(Image2);
					panel.add(Image3);
					panel.add(spin);
					frame.pack();
					
					if(random1 == random2 && random2 == random ) {
					JOptionPane.showMessageDialog(null, "WINNER!");
					}
				
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
