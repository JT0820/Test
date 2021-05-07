package waehrungsrechner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AListener1 implements ActionListener {
	
	JPanel panel;
	JLabel farbe;

	
	public AListener1 (JPanel panel,JLabel farbe) {
		
		this.panel = panel;
		this.farbe = farbe;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		panel.setBackground(Color.red);
		farbe.setText("Rot");
	}

}
