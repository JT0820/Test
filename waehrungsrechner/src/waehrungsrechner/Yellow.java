package waehrungsrechner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Yellow implements ActionListener {

	JPanel panel;
	JLabel farbe;

	public Yellow(JPanel panel, JLabel farbe) {

		this.panel = panel;
		this.farbe = farbe;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		panel.setBackground(Color.yellow);
		farbe.setText("Yellow");
	}

}
