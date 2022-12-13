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
		
		 if(Image1 ){
			 
		 }
		try {
			Image1 = createLabelImage("orange.png");
			Image2= createLabelImage("lime.gif");
			Image3= createLabelImage("cherry.png");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
			
		
		
	}
	private JLabel createLabelImage(String fileName) throws MalformedURLException{
        URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
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
		
		if(arg0.getSource()==spin) {
			ran.nextInt(2);
		}
		
	}
}
