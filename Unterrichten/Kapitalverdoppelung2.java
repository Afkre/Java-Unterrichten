import javax.swing.JOptionPane;

public class Kapitalverdoppelung2 {

	public static void main(String[] args) {
		String eingabe, ausgabe;
		double startkapital, endkapital;
		double zinssatz;
		int jahre = 0;
		
		// Eingabefenster
		eingabe = JOptionPane.showInputDialog("Anfangskapital eingeben");
		startkapital = Double.parseDouble(eingabe);
		eingabe = JOptionPane.showInputDialog("Zinssatz eingeben");
		zinssatz = Double.parseDouble(eingabe);
		
		// Verarbeitung
		endkapital = startkapital;
		while (endkapital < 2* startkapital) {
			jahre++;
			endkapital = endkapital * (1 + zinssatz/100);
		}
		// Ausgabe
		// %,.2f bedeutet die  Darstellung mit float und 2 Nachkommastellen
		ausgabe = String.format("Das Startkapital von %, .2f €" + "\nhat sich in %d Jahren verdoppelt." + "\nEndkapital: %,.2f €", startkapital, jahre, endkapital);
		
		JOptionPane.showMessageDialog(null, ausgabe);
		
	}

}
