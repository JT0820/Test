package waehrungsrechner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Reset implements ActionListener {
	
	JPanel panel;
	JTextField eingabeBetrag;
	JLabel farbe;
	JLabel antwort;
	
	public Reset (JPanel panel, JTextField eingabeBetrag, JLabel farbe, JLabel antwort) {
		this.panel = panel;
		this.eingabeBetrag = eingabeBetrag;
		this.farbe = farbe;
		this.antwort = antwort;
		
			
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		panel.setBackground(null);
		eingabeBetrag.setText("");
		farbe.setText("");
		antwort.setText("");
		
	}
	
}
