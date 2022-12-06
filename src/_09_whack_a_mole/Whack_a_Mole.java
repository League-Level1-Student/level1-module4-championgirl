package _09_whack_a_mole;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Whack_a_Mole implements ActionListener {

	
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
	    JButton moleButton;	
	    Random ran = new Random();
	    Date date = new Date();
	    int counter =0;
		public Whack_a_Mole() {
			
			drawButtons(ran.nextInt(24));
			
		}
		
		
		public void drawButtons(int random){
			frame.dispose();
			frame = new JFrame();
			frame.setTitle("Whack a button for fame and glory");
			frame.setVisible(true);
			panel = new JPanel();
			panel.setLayout(new GridLayout(8,3));
			frame.add(panel);
			 for(int i = 0;i < 24;i++) {
				 JButton button = new JButton();
				 panel.add(button);
				 button.addActionListener(this);
				 if(i == random) {
					 moleButton = button;
					 moleButton.setText("mole!");
				 }
				
			 }
			frame.setSize(500, 800);
		}


		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(arg0.getSource()==moleButton) {
				drawButtons(ran.nextInt(24));
				counter++;
	
			}
			
			else {System.out.println("missed!");}
			if(counter==10) {
				endGame(date,10);
			}
			
			
		}
		
		   static void speak(String words) {
		        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
		            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
		                    + words + "');\"";
		            try {
		                Runtime.getRuntime().exec( cmd ).waitFor();
		            } catch( Exception e ) {
		                e.printStackTrace();
		            }
		        } else {
		            try {
		                Runtime.getRuntime().exec( "say " + words ).waitFor();
		            } catch( Exception e ) {
		                e.printStackTrace();
		            }
		        }
		   }
		
		   
		
		   private void endGame(Date timeAtStart, int molesWhacked) { 
			    Date timeAtEnd = new Date();
			    JOptionPane.showMessageDialog(null, "Your whack rate is "
			            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
			                  + " moles per second.");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}
