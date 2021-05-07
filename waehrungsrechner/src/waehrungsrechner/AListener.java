package waehrungsrechner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AListener implements ActionListener {

	public double kursEURtoUSD = 1.21;
	public double kursUSDtoEUR = 0.83;
	public double kursGBPtoEUR = 1.15;
	public double kursEURtoGBP = 0.87;
	public double kursGBPtoUSD = 1.39;
	public double kursUSDtoGBP = 0.72;

	JComboBox waehrungVon, waehrungZu;
	JTextField eingabeBetrag;
	static JLabel antwort;

	public AListener(JTextField eingabeBetrag, JComboBox waehrungVon, JComboBox waehrungZu, JLabel antwort) {
		this.eingabeBetrag = eingabeBetrag;
		this.waehrungVon = waehrungVon;
		this.waehrungZu = waehrungZu;
		this.antwort = antwort;

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		//String eingabe = eingabeBetrag.getText();

		if (eingabeBetrag.getText() == null) {

			antwort.setText("Geben Sie einen Wert ein!");
			
		} else {
			double wert = Double.parseDouble(eingabeBetrag.getText());

			if (waehrungVon.getSelectedItem().equals("Euro") && waehrungZu.getSelectedItem().equals("USD")) {

				wert *= kursEURtoUSD;

			}
			if (waehrungVon.getSelectedItem().equals("USD") && waehrungZu.getSelectedItem().equals("Euro")) {

				wert *= kursUSDtoEUR;

			}
			if (waehrungVon.getSelectedItem().equals("Pfund") && waehrungZu.getSelectedItem().equals("Euro")) {

				wert *= kursGBPtoEUR;

			}
			if (waehrungVon.getSelectedItem().equals("Euro") && waehrungZu.getSelectedItem().equals("Pfund")) {

				wert *= kursEURtoGBP;

			}
			if (waehrungVon.getSelectedItem().equals("Pfund") && waehrungZu.getSelectedItem().equals("USD")) {

				wert *= kursGBPtoUSD;

			}
			if (waehrungVon.getSelectedItem().equals("USD") && waehrungZu.getSelectedItem().equals("Pfund")) {

				wert *= kursUSDtoGBP;

			}

			DecimalFormat f = new DecimalFormat("#0.00");

			antwort.setText("Der Betrag entspricht " + f.format(wert) + " " + waehrungZu.getSelectedItem());
		}
	}
}
