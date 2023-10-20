package PackageTP4;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 337, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnejercicio1 = new JButton("Ejercicio 1");
		btnejercicio1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaContactos nueva= new VentanaContactos();
				nueva.setVisible(true);
			}
		});
		btnejercicio1.setBounds(81, 74, 168, 23);
		contentPane.add(btnejercicio1);
		
		JButton btnEjercicio2 = new JButton("Ejercicio 2");
		btnEjercicio2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPromedio nueva= new VentanaPromedio();
				nueva.setVisible(true);
			}
		});
		btnEjercicio2.setBounds(81, 121, 168, 23);
		contentPane.add(btnEjercicio2);
		
		JButton btnEjercicio3 = new JButton("Ejercicio 3");
		btnEjercicio3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanSeleccionMultiple nueva = new VentanSeleccionMultiple();
				nueva.setVisible(true);
			}
		});
		btnEjercicio3.setBounds(81, 165, 168, 23);
		contentPane.add(btnEjercicio3);
		
		JLabel lblNewLabel = new JLabel("TP 4");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 131, 23);
		contentPane.add(lblNewLabel);
	}
}
