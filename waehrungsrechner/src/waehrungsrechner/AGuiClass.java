package waehrungsrechner;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.util.EventListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AGuiClass {

	private static JComboBox waehrungVon = new JComboBox(new String[] { "Euro", "USD", "Pfund" });
	private static JComboBox waehrungZu = new JComboBox(new String[] { "Euro", "USD", "Pfund" });

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		 * JFrame myFrame = new JFrame ("Währungsrechner");
		 * myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 * myFrame.getContentPane().add(new APanel()); //myFrame.setSize(1024,1080);
		 * myFrame.pack(); myFrame.setVisible(true);
		 */

		JFrame waehrungsrechner = new JFrame();
		waehrungsrechner.setTitle("Währungsrechner");
		waehrungsrechner.setSize(300, 250);
		waehrungsrechner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		
		
		JTextField eingabeBetrag = new JTextField("0", 20);
		//eingabeBetrag.addFocusListener(new AFocusListener());
		

		JLabel frage = new JLabel("Welche Umrechnung möchten Sie vornehmen?");
		JLabel betrag = new JLabel("Welchen Betrag möchten Sie umrechnen?");
		JLabel von = new JLabel("von");
		JLabel zu = new JLabel("zu");
		JLabel antwort = new JLabel("");
		JLabel farbe = new JLabel("");
		
		
		JButton red = new JButton("Rot");
		red.addActionListener(new AListener1(panel,farbe));
		
		JButton yellow = new JButton("Gelb");
		yellow.addActionListener(new Yellow(panel,farbe));

		
		JButton buttonOK = new JButton("umrechnen");
		buttonOK.addActionListener(new AListener(eingabeBetrag, waehrungVon, waehrungZu, antwort));
		
		JButton reset = new JButton("reset");
		reset.addActionListener(new Reset(panel,eingabeBetrag, farbe, antwort));

		panel.add(frage);
		panel.add(von);
		panel.add(waehrungVon);
		panel.add(zu);
		panel.add(waehrungZu);
		panel.add(betrag);
		panel.add(eingabeBetrag);
		panel.add(buttonOK);
		panel.add(reset);
		panel.add(farbe);
		panel.add(red);
		panel.add(yellow);
		panel.add(AListener.antwort);
		panel.add(farbe);	

		waehrungsrechner.add(panel);
		waehrungsrechner.setVisible(true);
		

	}


private class ListenerYellow implements ActionListener {
	
	JPanel panel;
	
	
	public ListenerYellow (JPanel panel){
		this.panel = panel;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		panel.setBackground(Color.yellow);
		
	}
	
}
}
