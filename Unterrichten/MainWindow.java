//import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private JPanel contentPane;
	private JTextField txtValue1;
	private JTextField txtValue2;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow frame = new MainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainWindow() {
		setTitle("Addition zweier Zahlen");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("1. Zahl");
		lblNewLabel.setBounds(98, 47, 55, 14);
		contentPane.add(lblNewLabel);
		
		txtValue1 = new JTextField();
		txtValue1.setForeground(new Color(220, 20, 60));
		txtValue1.setBounds(152, 44, 127, 20);
		contentPane.add(txtValue1);
		txtValue1.setColumns(10);
		
		JLabel lblZahl = new JLabel("2. Zahl");
		lblZahl.setBounds(97, 77, 51, 17);
		contentPane.add(lblZahl);
		
		txtValue2 = new JTextField();
		txtValue2.setForeground(new Color(220, 20, 60));
		txtValue2.setBounds(152, 75, 127, 20);
		contentPane.add(txtValue2);
		txtValue2.setColumns(10);
		
		JLabel lblErgebnis = new JLabel("Ergebnis");
		lblErgebnis.setBounds(91, 109, 62, 14);
		contentPane.add(lblErgebnis);
		
		txtResult = new JTextField();
		txtResult.setForeground(new Color(0, 128, 0));
		txtResult.setBounds(152, 106, 127, 20);
		contentPane.add(txtResult);
		txtResult.setColumns(10);
		
		JButton btnCalc = new JButton("Berechnen");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double zahl1, zahl2, ergebnis;
				zahl1 = Double.parseDouble(txtValue1.getText());
				// Focus setzen
				// txtValue1.requestFocus();
				zahl2 = Double.parseDouble(txtValue2.getText());
				ergebnis = zahl1 + zahl2;
				txtResult.setText(String.valueOf(ergebnis));
				
				
			}
		});
		btnCalc.setBounds(91, 149, 103, 23);
		contentPane.add(btnCalc);
		
		JButton btnClose = new JButton("Beenden");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0); // Beenden Methode
			}
		});
		btnClose.setBounds(228, 149, 103, 23);
		contentPane.add(btnClose);
	}
}
