import javax.swing.JOptionPane;

public class Kreistest {
    public static void main(String[] args) {
	String kreisradius, einheit;
	double r;
	kreisradius = JOptionPane
		.showInputDialog("Geben Sie einen Kreisradius ein:");
	einheit = JOptionPane.showInputDialog("Geben Sie die Ma�einheit ein:");
	r = Double.parseDouble(kreisradius);
	Kreis k = new Kreis(r);
	System.out.println("Kreisradius: " + k.getRadius() + " " + einheit);
	System.out.println("Umfang: " + k.getUmfang() + " " + einheit);
	System.out.println("Fl�che: " + k.getFlaeche() + " " + einheit
		+ '\u00b2');
    }

}
