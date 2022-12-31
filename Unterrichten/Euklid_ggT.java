import javax.swing.JOptionPane;

public class Euklid_ggT {

	public static void main(String[] args) {
		int m, n, r;
		String eingabe1, eingabe2;
		eingabe1 = JOptionPane.showInputDialog("Geben Sie die erste Zahl ein:");
		eingabe2 = JOptionPane.showInputDialog("Geben Sie die zweite Zahl ein:");
		
		m = Integer.parseInt(eingabe1);
		n = Integer.parseInt(eingabe2);
		r = m % n;
		
		// Hier entwickelt Ihr weiter 
		System.out.println("r(rest) ist ="+ r);
		while(r >0) {
			m = n;
			n = r;
			r=m%n;
		}
			System.out.println("ggt ist ="+ n);
	}
}


