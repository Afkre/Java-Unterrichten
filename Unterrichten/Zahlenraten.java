import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/** 
 * Ein zuf�lliges Ratespiel:
 * Das Programm w�hlt eine zuf�llige Zahl aus, die der
 * Spieler erraten soll. Nach jedem Tipp wird ausgegeben, ob die
 * gesuchte Zahl gr�sser oder kleiner als der geratene Wert ist.
 * 
 *
 */

public class Zahlenraten {

	public static void main(String[] args) throws IOException {
		// Ein Zufallszahl im Wertebereich 1 bis 200 wird ermittelt
		Random wuerfel = new Random();
		int rateMich = wuerfel.nextInt(200) + 1;
		
		// Eingabe wird vorbereitet
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int tipp = 0;
		
		do {
			// In der Schleife werden die Zahlen gelesen und mit der gesuchten Zahl verglichen
			
			System.out.println("Geben Sie einen Tipp im Zahlenbereich von 1 bis 200 ab.");
			tipp = Integer.parseInt(in.readLine());
			
			/* 
			 * Ausgabe, ob die Zahl gr��er oder kleiner als der gesuchte Wert ist
			 */
			if (tipp > rateMich) {
				System.out.println("Der Wert ist zu hoch");
			} else if (tipp < rateMich) {
				System.out.println("Der Wert ist zu niedrig");
			}
		} while (tipp != rateMich);  // Die Schleife endet, wenn die Zahl erraten ist
		
		System.out.println("Die Zahl " + tipp + " ist richtig.");
			
			


	}

}
