import javax.swing.JFrame;   // Klasse JFrame ins Programm einbinden
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent; // Fehlt



public class Program {
	public static void main(String[] args) {
		try {
			JFrame mainFrame = new JFrame();   // ein neues Objekt erstellen
			mainFrame.setTitle("Das erste Java-Fenster ...");  // Titel des Fensters setzen
			mainFrame.setSize(800, 400);       // Gr��e des Fensters festlegen
			mainFrame.setLocation(400, 200);   // Position auf dem Bildschirm setzen
			mainFrame.setVisible(true);        // Fenster anzeigen
			
			JButton btnBeenden = new JButton("Beenden");
			btnBeenden.addActionListener(new ActionListener() {
			     public void actionPerformed(ActionEvent e) {
			          System.exit(0);
			     }
			});
			btnBeenden.setBounds(300, 200, 100, 25); 

	    } catch (Exception e) {                 
		    e.printStackTrace();
	    }
    }
}

